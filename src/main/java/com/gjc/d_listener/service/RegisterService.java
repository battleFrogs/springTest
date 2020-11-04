package com.gjc.d_listener.service;

import com.gjc.d_listener.config.MyListener;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class RegisterService implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register() {
        System.out.println("开始注册成功");
        applicationEventPublisher.publishEvent(new MyListener(""));
    }
}
