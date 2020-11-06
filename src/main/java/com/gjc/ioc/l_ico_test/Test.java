package com.gjc.ioc.l_ico_test;

import com.alibaba.druid.pool.DruidDataSource;
import com.gjc.ioc.l_ico_test.anno.EnableJdbc;
import com.gjc.ioc.l_ico_test.config.JdbcConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@EnableJdbc
@Configuration
@PropertySource("l_ioc_test/jdbc_configuration.properties")
public class Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Test.class);
        DruidDataSource bean = applicationContext.getBean(DruidDataSource.class);
        System.out.println(bean.getUrl());
    }

}
