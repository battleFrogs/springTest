package com.gjc.g_import.config;

import com.gjc.g_import.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {


    @Bean
    public Person person2() {
        return new Person();
    }



}
