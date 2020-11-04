package com.gjc.a_bean;

import com.gjc.a_bean.config.ConfigTest;
import com.gjc.a_bean.entity.Animal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("a_bean/a_bean.xml");
//        Object bean = applicationContext.getBean("animal");
//        System.out.println(bean);

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConfigTest.class);
        Animal bean = applicationContext.getBean(Animal.class);
        System.out.println(bean);
    }





}
