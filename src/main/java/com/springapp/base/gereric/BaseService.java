package com.springapp.base.gereric;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 16/2/21.
 */
public abstract class BaseService<T> {

    @Autowired
    protected BaseRespo<T> baseRespo;

    public abstract void addUser(T t);

    public abstract int add(int a, int b);

    public abstract double chu(int a, int b);
}
