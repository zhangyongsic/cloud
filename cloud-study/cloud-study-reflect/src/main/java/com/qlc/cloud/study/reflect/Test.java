package com.qlc.cloud.study.reflect;

import java.util.*;

/**
 * author:zhangyong
 * Date:2019/3/19
 * Time:11:32
 */
public class Test {

    private Integer remaid = 1;

    public void test(){
        remaid = (remaid+1)*2;
    }

    public static void main(String[] args) {
        Test t =  new Test();
//        System.out.println(t.fn(2));
//        t.day();
//        System.out.println(t.water(5));
        t.romove1();
    }


    public Integer fn(int i){
        if (i<=1){
            return 1;
        }
        return 2*(fn(i-1)+1);
    }



    private Integer addDays = 364;
    public void day(){
        Calendar calendar = Calendar.getInstance();

        calendar.get(Calendar.DAY_OF_YEAR);

    }

    private int s =0;
    public int drink(Integer p){
        if (p==1){
            s+=1;
            return s;
        }else {
            s += p/2;
        }
        return drink((p%2==0)?(p/2):(p/2+1));
    }

    public int water(int money){
        return money + drink(money);
    }

    public void romove1(){
        List<String> list = new ArrayList<String>(){{
            add("1");
            add("2");
            add("3");
        }};

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next().equals("1")){
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
