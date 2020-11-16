package com.gjc.aop.b_primordial.entity;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PartnerPlatform2 {

    private static List<IndividualPartner> individualPartners = new ArrayList<>();

    static {

        individualPartners.add(new IndividualPartner("211"));
        individualPartners.add(new IndividualPartner("112"));
        individualPartners.add(new IndividualPartner("123"));

    }


    public static Partner getPartner(int money) {
        Partner partner = individualPartners.remove(0);
        return (Partner) Enhancer.create(partner.getClass(), new MethodInterceptor() {

            private int budget = money;
            private boolean status = false;


            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                if (method.getName().equals("receiveMoney")) {
                    int money = (int) objects[0];
                    this.status = money >= budget;
                }

                if (status) {
                    return method.invoke(partner, objects);
                }
                return null;
            }
        });
    }






}
