package com.gjc.j_post_process.process;

import com.gjc.j_post_process.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

//@Component
public class MyFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Stream.of(configurableListableBeanFactory.getBeanDefinitionNames()).forEach(beanName->{
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanName);
            if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
                if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(), this.getClass().getClassLoader())
                        .equals(Person.class)) {
                    beanDefinition.getPropertyValues().add("name", beanName);
                }
            }
        });
    }
}
