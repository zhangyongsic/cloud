package com.qlc.study.design.patterns.adapter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author:zhangyong
 * Date:2019/2/28
 * Time:10:54
 */
@Configuration
public class SMSSAutoConfig {
    @Bean
    @ConditionalOnMissingBean(ISMSCharge.class)
    public ISMSCharge smsCharge(){
        return new SMSChargeAdapter() {
            @Override
            public boolean sub(String key, Integer count) {
                System.out.println("AutoConfig");
                return true;
            }

            @Override
            public void add(String key, Integer count) {
                System.out.println("AutoConfig");
            }
        };
    }
}
