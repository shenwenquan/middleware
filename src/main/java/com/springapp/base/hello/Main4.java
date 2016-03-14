package com.springapp.base.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 16/3/6.
 */
public class Main4 {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");

        CommandManager e = c.getBean("commandManager", CommandManager.class);
        System.out.println(e.process(1));
        System.out.println(e.process(2));
        System.out.println(e.process(3));

    }
}
