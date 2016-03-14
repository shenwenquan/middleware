package com.springapp.base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
@Aspect

@Component
public class AspectValidate {

    @Before("execution(* com.springapp.base.gereric.MyService.*(..))")
    public void beforeLog(JoinPoint joinPoint) {

        System.out.println("validate :the method " + joinPoint.getSignature().getName() + " begins ,args is :" + Arrays.asList(joinPoint.getArgs()));
    }

}
