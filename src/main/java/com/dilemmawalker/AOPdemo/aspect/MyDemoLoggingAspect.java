package com.dilemmawalker.AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // java class that has collection of related advices
@Component
public class MyDemoLoggingAspect {
    //add all of our related advices for logging

    //start with @Before advice

    @Pointcut("execution(* com.dilemmawalker.AOPdemo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* com.dilemmawalker.AOPdemo.dao.*.get*(..))")
    private void getter(){}

    @Pointcut("execution(* com.dilemmawalker.AOPdemo.dao.*.set*(..))")
    private void setter(){}

//    @Before("execution (* com.dilemmawalker.AOPdemo.dao.AccountDAOImpl.addAccount())")
//    @Before("execution (* add*())")

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("Executing @Before advice on addAccount()");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("performing api Analytics");
    }

    @Before("forDaoPackage() && getter()")
    public void combineGetter(){
        System.out.println("combining getter operation");
    }

    @Before("forDaoPackage() && setter()")
    public void combineSetter(){
        System.out.println("combining setter operation");
    }

}
