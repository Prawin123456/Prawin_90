package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"stepsForHooks"},
monochrome=true,
plugin= {"pretty","junit:target/tucumber.xml"}
)
public class TestRunnerForHooks {

}
