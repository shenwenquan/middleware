package com.springapp.hive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 16/2/22.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        SomeClass sc = ctx.getBean("someBean", SomeClass.class);
        System.out.println(sc.getDbs());
    }
}
