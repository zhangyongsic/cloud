package com.qlc.study.design.patterns.adapter.config;

/**
 * author:zhangyong
 * Date:2019/2/28
 * Time:10:16
 */
public abstract class SMSChargeAdapter implements ISMSCharge {

    public abstract boolean sub(String key, Integer count);

    public abstract void add(String key, Integer count);
}
