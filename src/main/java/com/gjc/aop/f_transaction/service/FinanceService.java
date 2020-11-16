package com.gjc.aop.f_transaction.service;

import com.gjc.aop.f_transaction.anno.Transaction;
import com.gjc.aop.f_transaction.dao.FinanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    @Autowired
    FinanceDao financeDao;

    @Transaction
    public void transfer(Long source, Long target, int money) {
        financeDao.subtractMoney(source, money);
        int i = 1 / 0;
        financeDao.addMoney(target, money);
    }


}
