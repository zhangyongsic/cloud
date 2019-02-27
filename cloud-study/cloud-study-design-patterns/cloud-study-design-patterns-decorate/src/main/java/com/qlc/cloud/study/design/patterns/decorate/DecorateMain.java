package com.qlc.cloud.study.design.patterns.decorate;

/**
 * author:zhangyong
 * Date:2019/2/27
 * Time:19:21
 */
public class DecorateMain {

    public static void main(String[] args) {
        Person person = new Person("zxj");
        TShirts tShirts = new TShirts();
        tShirts.decorate(person);
        tShirts.show();

        Trousers trousers = new Trousers();

        trousers.decorate(tShirts);
        trousers.show();
    }
}
