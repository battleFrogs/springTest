package com.gjc.ioc.b_factory;

import com.gjc.ioc.b_factory.config.ConfigTest;
import com.gjc.ioc.b_factory.entity.Car;
import com.gjc.ioc.b_factory.entity.Toy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConfigTest.class);
//        Person bean = applicationContext.getBean(Person.class);
//        System.out.println(bean);

        Toy bean = applicationContext.getBean(Car.class);
        System.out.println(bean);
    }

}
