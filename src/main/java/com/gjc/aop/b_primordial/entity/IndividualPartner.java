package com.gjc.aop.b_primordial.entity;

public class IndividualPartner implements Partner{

    private String name;

    public IndividualPartner(String name) {
        this.name = name;
    }


    // 收钱
    @Override
    public void receiveMoney(int money) {
        System.out.println(name + "收到" + money + "元");
    }

    // 陪玩
    @Override
    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起玩耍");
    }


}
