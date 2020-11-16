package com.gjc.aop.d_anno.entity;

import java.util.List;

public interface OrderService {

    void createOrder();

    void deleteOrderById(String id);

    String getOrderById(String id);

    List<String> findAll();

}
