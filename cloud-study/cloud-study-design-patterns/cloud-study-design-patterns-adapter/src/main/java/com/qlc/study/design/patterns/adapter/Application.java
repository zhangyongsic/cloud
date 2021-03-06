package com.qlc.study.design.patterns.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * author:zhangyong
 * Date:2019/2/28
 * Time:10:26
 */
@SpringBootApplication(scanBasePackages = { "com.qlc.cloud" }) // same as @Configuration
@EnableTransactionManagement
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
