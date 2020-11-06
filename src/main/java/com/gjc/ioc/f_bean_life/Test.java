package com.gjc.ioc.f_bean_life;

import com.gjc.ioc.f_bean_life.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("f_bean_life/f_bean_life");
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.gjc.ioc.f_bean_life");
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
        applicationContext.close();
    }

}
