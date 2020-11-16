package com.gjc.aop.e_aop_extend;

import com.gjc.aop.e_aop_extend.service.TestService;
import com.gjc.aop.e_aop_extend.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@ComponentScan("com.gjc.aop.e_aop_extend")
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Test.class);
//        UserService bean = applicationContext.getBean(UserService.class);
//        bean.login();
//        bean.register();
//
//        bean.test();
        TestService bean = applicationContext.getBean(TestService.class);
        bean.test();
    }


}
