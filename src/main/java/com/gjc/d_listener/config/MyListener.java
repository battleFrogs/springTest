package com.gjc.d_listener.config;

import org.springframework.context.ApplicationEvent;

public class MyListener extends ApplicationEvent {

    public MyListener(Object source) {
        super(source);
    }
}
