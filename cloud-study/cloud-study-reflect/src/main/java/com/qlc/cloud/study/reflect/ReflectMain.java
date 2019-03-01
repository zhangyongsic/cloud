package com.qlc.cloud.study.reflect;

import com.qlc.cloud.entitys.sys.User;

import java.lang.reflect.Field;

/**
 * author:zhangyong
 * Date:2019/3/1
 * Time:10:54
 */
public class ReflectMain {

    public static void main(String[] args) throws Exception{
        User user = new User();
        Class<User> userClass = User.class;
        Field[] fields = userClass.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user,"zxj");
        System.out.println(user.getName());
    }
}
