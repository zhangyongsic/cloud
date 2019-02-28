package com.qlc.study.design.patterns.adapter.controller;

import com.qlc.study.design.patterns.adapter.config.ISMSCharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:zhangyong
 * Date:2019/2/28
 * Time:10:28
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ISMSCharge smsCharge;

    @GetMapping("adapter")
    public String adapter(){
        smsCharge.add("1",2);
        return "string";
    }

}
