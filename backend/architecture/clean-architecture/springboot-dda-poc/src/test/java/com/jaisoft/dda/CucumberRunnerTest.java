package com.jaisoft.dda;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report.json"},
        features = {"src/test/resources/features"},
        glue={"com/jaisoft/dda/definitions"}
)
public class CucumberRunnerTest {
    
}
