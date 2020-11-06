package com.gjc.ioc.l_ico_test.anno;

import com.gjc.ioc.l_ico_test.config.JdbcConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfig.class)
public @interface EnableJdbc {



}
