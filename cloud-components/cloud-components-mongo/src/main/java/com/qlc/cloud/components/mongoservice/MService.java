package com.qlc.cloud.components.mongoservice;


public interface MService<T> {

    T save(T t);

    T findById(Object id);

}
