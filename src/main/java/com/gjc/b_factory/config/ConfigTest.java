package com.gjc.b_factory.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.gjc.b_factory.entity","com.gjc.b_factory.factory"})
@PropertySource("b_factory/b_factory.properties")
@ImportResource("b_factory/b_facatory_bean.xml")
public class ConfigTest {


}
