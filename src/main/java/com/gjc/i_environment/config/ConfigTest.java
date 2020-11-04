package com.gjc.i_environment.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Configuration
@PropertySource("i_environment/i_environment.properties")
public class ConfigTest {

    @Value("${name}")
    private String name;


}
