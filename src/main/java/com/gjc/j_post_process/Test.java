package com.gjc.j_post_process;

import com.gjc.j_post_process.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.gjc.j_post_process");
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }


}
