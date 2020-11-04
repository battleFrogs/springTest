package com.gjc.g_import.config;

import com.gjc.g_import.entity.Car;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Car.class.getName()};
    }
}
