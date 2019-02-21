package com.qlc.cloud.components.mongo.service;


public interface MService<T> {

    T save(T t);

    T findById(Object id);

}
