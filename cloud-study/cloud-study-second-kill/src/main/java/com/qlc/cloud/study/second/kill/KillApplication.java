package com.qlc.cloud.study.second.kill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * author:zhangyong
 * Date:2019/3/5
 * Time:17:50
 */
@SpringBootApplication(scanBasePackages = { "com.qlc.cloud" }) // same as @Configuration
@EnableTransactionManagement
public class KillApplication {
    public static void main(String[] args) {
        SpringApplication.run(KillApplication.class,args);
    }
}
