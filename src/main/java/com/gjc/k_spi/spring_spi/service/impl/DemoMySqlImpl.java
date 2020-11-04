package com.gjc.k_spi.spring_spi.service.impl;

import com.gjc.k_spi.spring_spi.service.DemoService;

public class DemoMySqlImpl implements DemoService {

    @Override
    public void test() {
        System.out.println("mysqlTest");
    }
}
