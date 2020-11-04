package com.gjc.h_condition.config;

import com.gjc.h_condition.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConfigTest {


    @Bean
    public Person person(){
        return new Person();
    }


}
