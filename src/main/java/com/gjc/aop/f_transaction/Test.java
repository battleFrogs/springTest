package com.gjc.aop.f_transaction;

import com.gjc.aop.f_transaction.configure.TransactionAspectConfiguration;
import com.gjc.aop.f_transaction.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                TransactionAspectConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.transfer(1L, 2L, 100);


    }

}
