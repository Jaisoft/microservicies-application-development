package com.jaisoft.bdtdd;

import com.jaisoft.bdtdd.infrastructure.springrest.UserAcceptationTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report.json"},
        features = {"src/test/resources/features"},
        glue={"com/jaisoft/bdtdd/infrastructure/definitions"}
)
public class CucumberRunnerTest extends UserAcceptationTest {
    
}
