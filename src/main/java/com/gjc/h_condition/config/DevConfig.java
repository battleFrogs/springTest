package com.gjc.h_condition.config;

import com.gjc.h_condition.entity.Animal;
import com.gjc.h_condition.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public Animal animal(){
        return new Animal();
    }

}
