package com.gjc.h_condition.config;

import com.gjc.h_condition.entity.Car;
import com.gjc.h_condition.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCondition {

    @Bean
    @ConditionOnBean("com.gjc.h_condition.entity.Person")
    public Car car() {
        return new Car();
    }

}
