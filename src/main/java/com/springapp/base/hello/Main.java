package com.springapp.base.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by apple on 16/2/21.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);

        helloWorld.setName("xiaoming");

        System.out.println(helloWorld.getName());
        System.out.println("is prototype: " + ctx.isPrototype("helloWorld"));

        System.out.println("is singleton :" + ctx.isSingleton("helloWorld"));

        System.out.println(helloWorld.hashCode());

        HelloWorld helloWorld2 = ctx.getBean("helloWorld2", HelloWorld.class);

        System.out.println(helloWorld2.hashCode());

        System.out.println("h1:" + ctx.getBean("h1", HelloWorld.class));
        System.out.println("h2:" + ctx.getBean("h3", HelloWorld.class));


    }


}
