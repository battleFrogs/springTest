package com.gjc.ioc.d_listener.config;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListenerSuccess {

    @EventListener
    public void onSuccessResult(MyListener myListener) {
        System.out.println("成功");
    }

}
