package com.gjc.k_spi.spring_spi;

import com.gjc.k_spi.spring_spi.service.DemoService;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

public class SpringSpi {

    public static void main(String[] args) {
        List<String> list = SpringFactoriesLoader.loadFactoryNames(
                DemoService.class, SpringSpi.class.getClassLoader());
        list.forEach(className ->{
            System.out.println(className);
        });
    }

}
