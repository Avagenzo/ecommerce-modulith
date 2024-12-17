package com.example.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

class ModulithTest {

    @Test
    void verifyModularStructure() {
        ApplicationModules modules = ApplicationModules.of(EcommerceApplication.class);
        modules.verify();
    }

    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(EcommerceApplication.class);
        modules.forEach(System.out::println);
    }

    @Test
    void createModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of(EcommerceApplication.class);
        new Documenter(modules)
                .writeDocumentation()
                .writeIndividualModulesAsPlantUml();
    }
}