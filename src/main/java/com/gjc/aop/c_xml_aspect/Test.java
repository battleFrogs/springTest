package com.gjc.aop.c_xml_aspect;

import com.gjc.aop.c_xml_aspect.service.FinancService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/c_xml_aspect/xmlaspect.xml");
        FinancService bean = applicationContext.getBean(FinancService.class);
        bean.addMoney(123.45);
        bean.subtractMoney(543.21);
        bean.getMoneyById("abc");



    }

}
