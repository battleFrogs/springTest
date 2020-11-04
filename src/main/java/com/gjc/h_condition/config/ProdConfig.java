package com.gjc.h_condition.config;

import com.gjc.h_condition.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
@Profile("test")
public class ProdConfig {

    @Bean
    public Car car() {
        return new Car();
    }


}
