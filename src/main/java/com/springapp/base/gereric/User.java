package com.springapp.base.gereric;

import org.springframework.stereotype.Component;

/**
 * Created by apple on 16/2/21.
 */
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
