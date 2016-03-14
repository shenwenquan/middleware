package com.springapp.base.gereric;

/**
 * Created by apple on 16/2/21.
 */
public interface BaseRespo<T> {

    void save(T t);

    int add(int a, int b);

    double chu(int a, int b);

}
