package com.gjc.ioc.b_factory.factory;

import com.gjc.ioc.b_factory.entity.Car;

public class StaticToyFactory {

    public static Car getCar() {
        return new Car();
    }

}
