package com.gjc.b_factory;

import com.gjc.b_factory.config.ConfigTest;
import com.gjc.b_factory.entity.Car;
import com.gjc.b_factory.entity.Person;
import com.gjc.b_factory.entity.Toy;
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
