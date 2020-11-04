package com.gjc.h_condition.config;

import com.gjc.h_condition.entity.Person;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionDecide implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getBeanFactory().containsBeanDefinition(Person.class.getName());
    }

}
