package com.gjc.ioc.h_condition.config;


import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionOnBean {

    String[] value() default {};

}
