package com.springapp.base.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 16/3/8.
 */
public class Main {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-scope.xml");

        Foo f = ctx.getBean("foo", Foo.class);

        System.out.println(f.getBar());
    }
}
