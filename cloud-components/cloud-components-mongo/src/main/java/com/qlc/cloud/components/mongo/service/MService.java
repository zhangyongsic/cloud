package com.qlc.cloud.components.mongo.service;


public interface MService<T,PK> {

    T save(T t);

    T findById(PK pk);

}
