package com.gjc.ioc.c_aware;

import com.gjc.ioc.c_aware.config.ConfigTest;
import com.gjc.ioc.c_aware.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Object person = ConfigTest.getMyBean("person");
        System.out.println(person);
    }

}
