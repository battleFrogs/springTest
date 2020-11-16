package com.gjc.aop.d_anno;

import com.gjc.aop.d_anno.entity.FinancService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.gjc.aop.d_anno")
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Test.class);
        FinancService bean = applicationContext.getBean(FinancService.class);
        bean.addMoney(100);
//        bean.subtractMoney(10);
//        bean.getMoneyById("1");
    }

}
