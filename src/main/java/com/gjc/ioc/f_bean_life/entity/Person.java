package com.gjc.ioc.f_bean_life.entity;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class Person implements InitializingBean, DisposableBean {

    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("impl afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("impl destroy ");
    }

    public void xmlInit() {
        System.out.println("xmlInit");
    }

    public void xmlDestroy() {
        System.out.println("xmlDestroy");
    }
}
