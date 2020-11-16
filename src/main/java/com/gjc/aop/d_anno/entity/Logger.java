package com.gjc.aop.d_anno.entity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Logger {

    @Before("@annotation(com.gjc.aop.d_anno.entity.Log)")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }

    @After("execution(public * com.gjc.aop.d_anno.entity.*.*(*))")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning("execution(public * com.gjc.aop.d_anno.entity.*.*(*))")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    @AfterThrowing("execution(public * com.gjc.aop.d_anno.entity.*.*(*))")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * com.gjc.aop.d_anno.entity.FinancService.addMoney(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Logger aroundPrint before run ......");
        try {
            Object retVal = joinPoint.proceed();// 此处抛出Throwable异常
            System.out.println("Logger aroundPrint afterReturning run ......");
            return retVal;
        } catch (Throwable e) {
            System.out.println("Logger aroundPrint afterThrowing run ......");
            throw e;
        } finally {
            System.out.println("Logger aroundPrint after run ......");
        }
    }
}

