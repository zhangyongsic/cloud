package com.qlc.study.design.patterns.adapter.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * author:zhangyong
 * Date:2019/2/28
 * Time:10:32
 */
@Configuration
public class SMSChargeConfig {

    @Bean
    public ISMSCharge smsCharge(){
        return new SMSChargeAdapter() {
            @Override
            public boolean sub(String key, Integer count) {
                return false;
            }

            @Override
            public void add(String key, Integer count) {
                System.out.println("SMSChargeConfig");
            }
        };
    }
}
