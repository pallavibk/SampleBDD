package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue= {"com.qa.stepDefinitions"},features= {"src/test/resources/login.feature"},dryRun=false,format={"html:target/cucumberResult.html"})
public class Runner
{
	
}
