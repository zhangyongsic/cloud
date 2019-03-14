package com.qlc.cloud.study.single;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * author:zhangyong
 * Date:2019/3/13
 * Time:15:25
 */
public class LazySingle implements Serializable {
    private static LazySingle instance;
    private LazySingle(){};
    public static LazySingle getInstance(){
        if (instance==null){
            instance = new LazySingle();
        }
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
