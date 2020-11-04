package com.gjc.d_listener.config;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextAnnotationApplicationListener {

    @EventListener
    public void onContextClosedEvent(ContextClosedEvent event) {
        System.out.println("close");
    }

}
