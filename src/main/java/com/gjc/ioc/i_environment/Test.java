package com.gjc.ioc.i_environment;

import com.gjc.ioc.i_environment.config.EnvironmentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.gjc.ioc.i_environment");
//        ConfigTest bean = applicationContext.getBean(ConfigTest.class);
//        System.out.println(bean);
        EnvironmentConfig bean = applicationContext.getBean(EnvironmentConfig.class);
        System.out.println(bean.getValue("name"));
    }

}
