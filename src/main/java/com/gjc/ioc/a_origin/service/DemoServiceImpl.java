package com.gjc.ioc.a_origin.service;

import com.gjc.ioc.a_origin.dao.DemoDao;
import com.gjc.ioc.a_origin.dao.impl.DemoDaoImpl;

import java.util.List;

public class DemoServiceImpl implements DemoService {


    private DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
