package com.gjc.ioc.j_post_process;

import com.gjc.ioc.j_post_process.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.gjc.j_post_process");
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        // 增加一行注释
        // feature_test1 修改
        // feature_test1 again 修改
    }


}
