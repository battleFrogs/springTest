package com.gjc.aop.f_transaction.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.gjc.aop.f_transaction")
public class TransactionAspectConfiguration {



}
