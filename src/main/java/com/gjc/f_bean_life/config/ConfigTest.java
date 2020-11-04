package com.gjc.f_bean_life.config;

import com.gjc.f_bean_life.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {


    @Bean(initMethod = "xmlInit",destroyMethod = "xmlDestroy")
    public Person person() {
        return new Person();
    }

}
