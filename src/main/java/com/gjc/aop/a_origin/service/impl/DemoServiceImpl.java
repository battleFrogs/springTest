package com.gjc.aop.a_origin.service.impl;

import com.gjc.aop.a_origin.BeanFactory;
import com.gjc.aop.a_origin.dao.DemoDao;
import com.gjc.aop.a_origin.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {


    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }


    @Override
    public int add(String userId, int points) {
        System.out.println("DemoServiceImpl add ...");
        System.out.println("user: " + userId + ", points: " + points);
        return points;
    }

    @Override
    public int subtract(String userId, int points) {
        System.out.println("DemoServiceImpl subtract ...");
        System.out.println("user: " + userId + ", points: " + points);
        return points;
    }

    @Override
    public int multiply(String userId, int points) {
        return points;
    }

    @Override
    public int divide(String userId, int points) {
        return points;
    }
}
