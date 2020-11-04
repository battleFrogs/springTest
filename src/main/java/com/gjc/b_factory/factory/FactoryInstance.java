package com.gjc.b_factory.factory;

import com.gjc.b_factory.entity.Car;

public class FactoryInstance {

    public Car getCar() {
        return new Car();
    }



}
