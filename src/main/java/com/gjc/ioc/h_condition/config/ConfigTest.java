package com.gjc.ioc.h_condition.config;

import com.gjc.ioc.h_condition.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {


    @Bean
    public Person person(){
        return new Person();
    }


}
