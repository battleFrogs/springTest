package com.gjc.ioc.k_spi.java_spi;

import com.gjc.ioc.k_spi.java_spi.service.DemoService;

import java.util.ServiceLoader;

public class JavaSpi {

    public static void main(String[] args) {


        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        serviceLoader.forEach(DemoService::test);

    }

}
