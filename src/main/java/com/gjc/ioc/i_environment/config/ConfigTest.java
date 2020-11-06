package com.gjc.ioc.i_environment.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("i_environment/i_environment.properties")
public class ConfigTest {

    @Value("${name}")
    private String name;


}
