package com.qlc.study.design.patterns.adapter.config;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Servlet;

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
