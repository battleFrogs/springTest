package com.gjc.b_factory.factory;

import com.gjc.b_factory.entity.Ball;
import com.gjc.b_factory.entity.Car;
import com.gjc.b_factory.entity.Person;
import com.gjc.b_factory.entity.Toy;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//@Component
//public class ToyFactory implements FactoryBean<Toy> {
//
//    @Resource
//    private Person person;
//
//    @Override
//    public Toy getObject() throws Exception {
//
//        if (person.getAge() > 10) {
//            return new Car();
//        }else{
//            return new Ball();
//        }
//    }
//
//    @Override
//    public Class<?> getObjectType() {
//        return Toy.class;
//    }
//}
