package com.gjc.ioc.b_factory.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;





}
