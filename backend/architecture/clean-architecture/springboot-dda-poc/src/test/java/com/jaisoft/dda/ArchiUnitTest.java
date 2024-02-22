package com.jaisoft.dda;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.library.Architectures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;


public class ArchiUnitTest {

    private JavaClasses importedClasses;

    @BeforeEach
    public void setup() {
        importedClasses = new ClassFileImporter()
                .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
                .importPackages("com.abante.signature");
    }

    /*    Package Dependency Checks*/

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        noClasses()
                .that().resideInAnyPackage("com.abante.signature.service..")
                .or().resideInAnyPackage("com.abante.signature.repository..")
                .should()
                .dependOnClassesThat()
                .resideInAnyPackage("com.abante.signature.controller..")
                .because("Services and repositories should not depend on web layer")
                .check(importedClasses);
    }

    /* Class Dependency Checks*/

    @Test
    void serviceClassesShouldOnlyBeAccessedByController() {
        classes()
                .that().resideInAPackage("..service..")
                .should().onlyBeAccessed().byAnyPackage("..service..", "..controller..")
                .check(importedClasses);
    }


    /* naming convention */

    @Test
    void serviceClassesShouldBeNamedXServiceOrXComponentOrXServiceImpl() {
        classes()
                .that().resideInAPackage("..service..")
                .should().haveSimpleNameEndingWith("Service")
                .orShould().haveSimpleNameEndingWith("Domain")
                .orShould().haveSimpleNameEndingWith("Component")
                .orShould().haveSimpleNameEndingWith("Request")
                .orShould().haveSimpleNameEndingWith("Response")
                .check(importedClasses);
    }

    @Test
    void repositoryClassesShouldBeNamedXRepository() {
        classes()
                .that().resideInAPackage("..repository..")
                .should().haveSimpleNameEndingWith("Repository")
                .orShould().haveSimpleNameEndingWith("Entity")
                .check(importedClasses);
    }

    @Test
    void controllerClassesShouldBeNamedXController() {
        classes()
                .that().resideInAPackage("..controller£..")
                .should().haveSimpleNameEndingWith("Controller")
                .check(importedClasses);
    }


    /* Annotation check*/

    @Test
    void fieldInjectionNotUseAutowiredAnnotation() {

        noFields()
                .should().beAnnotatedWith(Autowired.class)
                .check(importedClasses);
    }

    @Test
    void repositoryClassesShouldHaveSpringRepositoryAnnotation() {
        classes()
                .that().resideInAPackage("..repository£..")
                .should().beAnnotatedWith(Repository.class)
                .check(importedClasses);
    }

    @Test
    void serviceClassesShouldHaveSpringServiceAnnotation() {
        classes()
                .that().resideInAPackage("..service£..")
                .should().beAnnotatedWith(Service.class)
                .check(importedClasses);
    }

    @Test
    void onioArchitecture(){
        Architectures.OnionArchitecture onionArchitecture =
                Architectures.onionArchitecture()
                        .domainModels("com.jaisoft.cleanarch.domain.data..")
                        .domainServices("com.jaisoft.cleanarch.domain.service..")
                        .applicationServices("com.jaisoft.cleanarch.application.service..")
                        .adapter("web", "com.jaisoft.cleanarch.infrastructure.web..");
    }

    @Test
    void repositoriesMustResideInRepositoryPackage() {
        classes().that().haveNameMatching(".*Repository").should().resideInAPackage("..repository..")
                .as("Repositories should reside in a package '..repository..'")
                .check(importedClasses);
    }

    @Test
    void domainClassesShouldBeSerializable() {
        classes()
                .that().resideInAPackage("..£domain..")
                .should()
                .beAssignableTo(Serializable.class)
                .check(importedClasses);
    }

    @Test
    void interfacesShouldNotHaveNamesEndingWithTheWordInterface() {
        noClasses().that().areInterfaces().should().haveNameMatching(".*Interface").check(importedClasses);
    }

    @Test
    void domainClassesShouldBePublic() {
        classes()
                .that().resideInAPackage("..£domain..")
                .should()
                .bePrivate()
                .check(importedClasses);
    }
}
