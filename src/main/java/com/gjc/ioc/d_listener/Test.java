package com.gjc.ioc.d_listener;

import com.gjc.ioc.d_listener.service.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext("com.gjc.ioc.d_listener");
//        Person bean = applicationContext.getBean(Person.class);
//        System.out.println(bean);
//        applicationContext.close();

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.gjc.ioc.d_listener");
        RegisterService registerService = applicationContext.getBean(RegisterService.class);
        registerService.register();
    }


}
