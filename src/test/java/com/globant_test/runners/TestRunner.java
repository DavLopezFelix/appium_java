package com.globant_test.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.globant_test.stepDefinitions", "com.globant_test.hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
