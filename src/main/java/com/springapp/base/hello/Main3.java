package com.springapp.base.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 16/3/6.
 */
public class Main3 {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");

        ExampleBean e = c.getBean("exampleBean", ExampleBean.class);
        System.out.println(e);
    }
}
