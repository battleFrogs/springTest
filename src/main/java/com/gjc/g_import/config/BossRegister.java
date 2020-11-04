package com.gjc.g_import.config;

import com.gjc.g_import.entity.Boss;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class BossRegister implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        registry.registerBeanDefinition("boss", new RootBeanDefinition(Boss.class));
    }
}
