package com.gjc.aop.a_origin;

import com.gjc.aop.a_origin.dao.DemoDao;

import java.io.IOException;
import java.util.Properties;

public class BeanFactory {

    public static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("aop/factory_f.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error" + e.getMessage());
        }

    }

    public static Object getBean(String beanName) {

        try {
            Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
            return beanClazz.newInstance();
        } catch (ClassNotFoundException e ) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "]");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("[" + beanName + "]" + "instantiation error");
        }


    }

}
