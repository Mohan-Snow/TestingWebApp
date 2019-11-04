package com.goalsachieved.services;

public interface BasicService<T> {

    void add(T t);

    void edit();

    void delete(Long id);

    T show(Long id);

    Iterable<T> getAll();

}
