package com.gjc.ioc.k_spi.spring_spi.service.impl;

import com.gjc.ioc.k_spi.spring_spi.service.DemoService;

public class DemoOracleImpl implements DemoService {


    @Override
    public void test() {
        System.out.println("oracleTest");
    }
}
