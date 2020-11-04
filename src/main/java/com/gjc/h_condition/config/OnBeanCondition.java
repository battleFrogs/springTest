package com.gjc.h_condition.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnBeanCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String[] values = (String[]) annotatedTypeMetadata.getAnnotationAttributes(ConditionOnBean.class.getName()).get("value");
        for (String value : values) {
            if (!conditionContext.getBeanFactory().containsBeanDefinition(value)) {
                return false;
            }
        }
        return true;
    }
}
