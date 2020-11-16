package com.gjc.aop.e_aop_extend.service;

import com.gjc.aop.e_aop_extend.Log;
import org.springframework.stereotype.Component;

@Component
public class UserService {


    public void login() {
        System.out.println("login");
    }

    public void register() {
        System.out.println("register");
    }

    @Log
    public void test() {
        System.out.println("test");
    }


}
