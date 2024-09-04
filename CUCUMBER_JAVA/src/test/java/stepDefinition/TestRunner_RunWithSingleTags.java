	package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureWithTag",
glue= {"StepDefinition"},
tags =" @regression and not @important"


)
public class TestRunner_RunWithSingleTags {
	
	}
	


