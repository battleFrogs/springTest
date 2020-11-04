package com.gjc.h_condition;

import com.gjc.h_condition.config.ConfigTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        applicationContext.scan("com.gjc.h_condition.config");
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }




}
