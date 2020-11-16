package com.gjc.aop.d_anno.entity;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Logger {

    @Before("execution(public * com.gjc.aop.d_anno.entity.*.*(*))")
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

}

