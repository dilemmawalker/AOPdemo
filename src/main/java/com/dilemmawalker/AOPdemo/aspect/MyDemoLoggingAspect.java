package com.dilemmawalker.AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // java class that has collection of related advices
@Component
public class MyDemoLoggingAspect {
    //add all of our related advices for logging

    //start with @Before advice

    @Before("execution (public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("Executing @Before advice on addAccount()");
    }
}
