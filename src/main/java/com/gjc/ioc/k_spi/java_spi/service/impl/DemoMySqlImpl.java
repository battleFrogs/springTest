package com.gjc.ioc.k_spi.java_spi.service.impl;

import com.gjc.ioc.k_spi.java_spi.service.DemoService;

public class DemoMySqlImpl implements DemoService {

    @Override
    public void test() {
        System.out.println("mysqlTest");
    }
}
