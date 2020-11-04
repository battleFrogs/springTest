package com.gjc.b_factory.factory;

import com.gjc.b_factory.entity.Car;

public class StaticToyFactory {

    public static Car getCar() {
        return new Car();
    }

}
