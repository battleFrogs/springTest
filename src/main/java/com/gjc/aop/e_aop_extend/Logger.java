package com.gjc.aop.e_aop_extend;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Logger {

    @Pointcut("execution(public * com.gjc.aop.e_aop_extend.service..*(..))")
    public void common() {
        System.out.println("common");
    }

    @Before("common()")
    public void beforeRun() {
        System.out.println("beforeRun");
    }

    @After("common()")
    public void afterRun() {
        System.out.println("afterRun");
    }


//    @Before("@annotation(com.gjc.aop.e_aop_extend.Log)")
//    public void beforeTest() {
//        System.out.println("beforeTest");
//    }


//    @Around("execution(public * com.gjc.aop.e_aop_extend.service..*(..))")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println(joinPoint.getTarget());
//        System.out.println(joinPoint.getThis());
//        System.out.println(Arrays.asList(joinPoint.getArgs()));
//        System.out.println(joinPoint.getSignature());
//        System.out.println(((MethodSignature)joinPoint.getSignature()).getMethod().getName());
//        return joinPoint.proceed();
//    }

}
