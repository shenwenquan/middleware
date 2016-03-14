package com.springapp.base.hello;

/**
 * Created by apple on 16/3/6.
 */
public class Main2 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class c = DefaultServiceLocator.class;
        DefaultServiceLocator l = (DefaultServiceLocator) c.newInstance();
        System.out.println(l);
    }
}
