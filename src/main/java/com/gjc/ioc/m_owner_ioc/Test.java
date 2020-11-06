package com.gjc.ioc.m_owner_ioc;

import com.gjc.ioc.m_owner_ioc.entity.Student;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Student.class)
                .addPropertyValue("name", "gjc")
                .addPropertyValue("age", 27);
        applicationContext.registerBeanDefinition("student", builder.getBeanDefinition());

        applicationContext.refresh();

        Student bean = applicationContext.getBean(Student.class);
        System.out.println(bean);

    }

}
