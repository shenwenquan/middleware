package com.springapp.base.gereric;

import org.springframework.stereotype.Service;

/**
 * Created by apple on 16/2/21.
 */
@Service
public class MyService extends BaseService<User> {
    @Override
    public void addUser(User user) {
        baseRespo.save(user);
    }

    @Override
    public int add(int a, int b) {
        return baseRespo.add(a, b);
    }

    @Override
    public double chu(int a, int b) {
        return baseRespo.chu(a, b);
    }
}
