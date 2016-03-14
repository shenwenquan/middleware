package com.springapp.base.gereric;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by apple on 16/2/21.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = ctx.getBean("user", User.class);
        user.setName("aaa");

        MyService bs = ctx.getBean("myService", MyService.class);
        bs.addUser(user);

        System.out.println("Main: add result:" + bs.add(1, 2));


        System.out.println("Main: chu result:" + bs.chu(1, 2));

        DefaultListableBeanFactory dd = (DefaultListableBeanFactory) ctx.getAutowireCapableBeanFactory();


        dd.registerSingleton("d", new Date());

        System.out.println(ctx.getBean("d", Date.class));
    }
}
