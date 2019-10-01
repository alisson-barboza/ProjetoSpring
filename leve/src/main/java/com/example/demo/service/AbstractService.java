package com.example.demo.service;

import br.com.unicap.smartparking.model.base.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public abstract class AbstractService<T extends AbstractEntity<ID>, ID extends Serializable> {

    @Autowired
    JpaRepository<T, ID> repository;

    public List<T> listAll(){
        return repository.findAll();
    }

    public T getById(T t){
        return repository.getOne(t.getId());
    }

    public T save(T t){
        return repository.save(t);
    }

    public T update(T t){
        return repository.save(t);
    }

}
