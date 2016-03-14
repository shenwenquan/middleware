package com.springapp.base.gereric;

import org.springframework.stereotype.Repository;

/**
 * Created by apple on 16/2/21.
 */
@Repository
public class MyRespo implements BaseRespo<User> {
    @Override
    public void save(User user) {
        System.out.println(user);
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double chu(int a, int b) {
        return a / b;
    }
}
