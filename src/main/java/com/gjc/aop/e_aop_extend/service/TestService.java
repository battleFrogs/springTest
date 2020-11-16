package com.gjc.aop.e_aop_extend.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class TestService {


    public void test() {
        ((TestService)AopContext.currentProxy()).test1();
        System.out.println("test`");
    }

    public void test1() {
        System.out.println("test`1");
    }

}
