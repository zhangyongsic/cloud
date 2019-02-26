package com.qlc.study.decorate.design.patterns.test;

import com.qlc.study.decorate.design.patterns.entity.BigTrousers;
import com.qlc.study.decorate.design.patterns.entity.Person;
import com.qlc.study.decorate.design.patterns.entity.TShirts;

/**
 * author:zhangyong
 * Date:2019/2/26
 * Time:13:42
 * 装饰模式
 */
public class DecorateTest {
    public static void main(String[] args) {
        Person person = new Person("zy");
        TShirts tShirts = new TShirts();
        BigTrousers bigTrousers = new BigTrousers();
        tShirts.decorate(person);
        bigTrousers.decorate(tShirts);
        bigTrousers.show();
    }
}
