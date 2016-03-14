package com.springapp.base.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 16/2/21.
 */
public class Main {
    public static void main(String[] args) {

        System.setProperty("aa", "111");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person p = ctx.getBean("person", Person.class);
        System.out.println(p);
    }
}
