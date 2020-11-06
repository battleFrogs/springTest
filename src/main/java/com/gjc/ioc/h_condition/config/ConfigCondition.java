package com.gjc.ioc.h_condition.config;

import com.gjc.ioc.h_condition.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCondition {

    @Bean
    @ConditionOnBean("com.gjc.ioc.h_condition.entity.Person")
    public Car car() {
        return new Car();
    }

}
