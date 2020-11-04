package com.gjc.g_import.annoation;

import com.gjc.g_import.config.BarImportSelector;
import com.gjc.g_import.config.BossRegister;
import com.gjc.g_import.config.MyConfig;
import com.gjc.g_import.entity.Person;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)  // 运行时起效
@Target(ElementType.TYPE)
@Import({Person.class, MyConfig.class, BarImportSelector.class, BossRegister.class})
public @interface EnableImport {


}
