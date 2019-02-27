package com.qlc.cloud.study.design.patterns.decorate;

/**
 * author:zhangyong
 * Date:2019/2/27
 * Time:19:12
 */
public class Person {

    public String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }
}
