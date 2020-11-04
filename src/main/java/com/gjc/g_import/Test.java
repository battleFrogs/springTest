package com.gjc.g_import;

import com.gjc.g_import.config.ConfigTest;
import com.gjc.g_import.entity.Car;
import com.gjc.g_import.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConfigTest.class);
//        Object bean = applicationContext.getBean("person");
//        System.out.println(bean);
//        Car bean = applicationContext.getBean(Car.class);
//        System.out.println(bean);
        Object bean = applicationContext.getBean("boss");
        System.out.println(bean);
    }

}
