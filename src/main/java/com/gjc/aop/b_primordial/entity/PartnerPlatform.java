package com.gjc.aop.b_primordial.entity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class PartnerPlatform {

    private static List<IndividualPartner> individualPartners = new ArrayList<>();

    static {

        individualPartners.add(new IndividualPartner("211"));
        individualPartners.add(new IndividualPartner("112"));
        individualPartners.add(new IndividualPartner("123"));

    }


    /**
     * jdk动态代理
     * @param money
     * @return
     */
    public static Partner getPartner(int money) {
        Partner partner = individualPartners.remove(0);
        return (Partner) Proxy.newProxyInstance(partner.getClass().getClassLoader(),
                partner.getClass().getInterfaces()
                , new InvocationHandler() {
                    private int budget = money;
                    private boolean status = false;

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("receiveMoney")) {
                            int money = (int) args[0];
                            // 平台需要运营，抽成一半
                            args[0] = money / 2;
                            // 如果在付钱时没给够，则标记budget为异常值
                            this.status = money >= budget;
                        }
                        if (status) {
                            return method.invoke(partner, args);
                        }
                        return null;
                    }
                });

    }

}
