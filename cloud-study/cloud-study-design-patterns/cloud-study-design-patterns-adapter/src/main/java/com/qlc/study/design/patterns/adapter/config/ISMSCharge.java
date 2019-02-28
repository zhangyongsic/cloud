package com.qlc.study.design.patterns.adapter.config;

/**
 * author:zhangyong
 * Date:2019/2/28
 * Time:10:13
 */
public interface ISMSCharge {
    boolean sub(String key,Integer count);
    void add(String key,Integer count);
}
