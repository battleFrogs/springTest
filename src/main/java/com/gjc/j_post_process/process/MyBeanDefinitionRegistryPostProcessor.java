package com.gjc.j_post_process.process;

import com.gjc.j_post_process.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        if (!beanDefinitionRegistry.containsBeanDefinition("person")) {
            AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class)
                    .getBeanDefinition();
            beanDefinitionRegistry.registerBeanDefinition("person", beanDefinition);
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
