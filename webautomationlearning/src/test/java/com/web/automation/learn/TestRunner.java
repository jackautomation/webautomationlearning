package com.web.automation.learn;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue= "com.web.automation.learn.stepdefinition",
		plugin = {"pretty", "html:target/cucumber-reports"},
		monochrome = true
		)
public class TestRunner {

}
