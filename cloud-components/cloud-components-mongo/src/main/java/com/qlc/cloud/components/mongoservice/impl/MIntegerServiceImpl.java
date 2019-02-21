package com.qlc.cloud.components.mongoservice.impl;

import com.qlc.cloud.components.mongoservice.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;


public class MIntegerServiceImpl<R extends MongoRepository<T,Integer>,T> implements MService<T> {

    @Autowired
    private R mongoRepository;

    public T save(T t) {
        return mongoRepository.save(t);
    }

    public T findById(Object id) {
        return this.mongoRepository.findOne((Integer) id);
    }
}
