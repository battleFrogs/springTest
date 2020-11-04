package com.gjc.c_aware;

import com.gjc.c_aware.config.ConfigTest;
import com.gjc.c_aware.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Object person = ConfigTest.getMyBean("person");
        System.out.println(person);
    }

}
