package com.qlc.study.decorate.design.patterns.entity;

/**
 * author:zhangyong
 * Date:2019/2/26
 * Time:11:47
 */
public class Person {
    private String name;
    public Person(){}
    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.print(name);
    }
}
