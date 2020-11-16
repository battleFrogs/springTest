package com.gjc.aop.b_primordial;

import com.gjc.aop.b_primordial.entity.IndividualPartner;
import com.gjc.aop.b_primordial.entity.Partner;
import com.gjc.aop.b_primordial.entity.PartnerPlatform;
import com.gjc.aop.b_primordial.entity.Player;

public class Test {

    public static void main(String[] args) {

        Player player = new Player("gjc");
        Partner partner = PartnerPlatform.getPartner(50);

        partner.receiveMoney(20);
        partner.playWith(player);


    }

}
