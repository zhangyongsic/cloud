package com.qlc.cloud.study.second.kill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * author:zhangyong
 * Date:2019/3/5
 * Time:17:51
 */
@RestController
@RequestMapping("kill")
public class KillController {

    @Autowired
    private ValueOperations<String, String> valueOperations;

    @Autowired
    private HashOperations<String, String, Object> hashOperations;

    @Autowired
    private ListOperations<String, Object> listOperations;

    @GetMapping("goods/get/{customerId}")
    public String customer(@PathVariable Integer customerId) throws Exception{

        ExecutorService executors = Executors.newFixedThreadPool(10);
        for (int id = 1;id<=2000;id++){
            Future future = executors.submit(new KillThread2(id));
            System.out.println(future.get());
        }
        return "ok";
    }

    @GetMapping("goods/set/{count}")
    public String set(@PathVariable String count){
        valueOperations.setIfAbsent("goods",count);
        return "ok";
    }


    private class  KillThread extends Thread {

        private Integer customerId;
        public KillThread(Integer customerId){
            this.customerId = customerId;
        }

        @Override
        public void run() {

            if (valueOperations.increment("goods",-1)<0){
                System.out.println("客户"+customerId+"没有秒杀到。。。。。。。");
            }else {
                System.out.println("客户"+customerId+"秒杀到了商品");
                listOperations.leftPush("customer",customerId+"");
                hashOperations.put("cc",customerId+"",customerId+"");
            }
        }
    }

    private class  KillThread2 implements Callable {

        private Integer customerId;
        public KillThread2(Integer customerId){
            this.customerId = customerId;
        }

        @Override
        public Object call() throws Exception {
            if (valueOperations.increment("goods",-1)<0){
                System.out.println("客户"+customerId+"没有秒杀到。。。。。。。");
                return "fail:客户"+customerId+"没有秒杀到。。。。。。。";
            }else {
                System.out.println("客户"+customerId+"秒杀到了商品");
                listOperations.leftPush("customer",customerId+"");
                hashOperations.put("cc",customerId+"",customerId+"");
                return "ok:"+"客户"+customerId+"秒杀到了商品";
            }
        }

    }


}
