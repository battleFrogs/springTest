package com.gjc.ioc.h_condition.config;

import com.gjc.ioc.h_condition.entity.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

//@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public Animal animal(){
        return new Animal();
    }

}
