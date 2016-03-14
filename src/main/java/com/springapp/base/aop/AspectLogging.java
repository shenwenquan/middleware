package com.springapp.base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by apple on 16/2/21.
 */
@Order(2)
@Aspect
@Component
public class AspectLogging {

    @Pointcut("execution(* com.springapp.base.gereric.*.*(..))")
    public void declarePoint() {

    }

    @Before("declarePoint()")
    public void beforeLog(JoinPoint joinPoint) {

        System.out.println("logging :the method " + joinPoint.getSignature().getName() + " begins ,args is :" + Arrays.asList(joinPoint.getArgs()));
    }

}
