package com.gjc.c_aware.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ConfigTest implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext args) throws BeansException {
        applicationContext = args;
    }

    public static Object getMyBean(String id) {
        return applicationContext.getBean(id);
    }
}
