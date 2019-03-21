package com.qlc.cloud.study.design.patterns.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * author:zhangyong
 * Date:2019/3/19
 * Time:9:55
 */
public class ProxyMain {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
        Map<String,String> map = new HashMap<>();
    }
}
