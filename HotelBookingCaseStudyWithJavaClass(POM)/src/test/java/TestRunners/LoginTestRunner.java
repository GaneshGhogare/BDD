package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= "pretty",
features="src/main/resources/login"
,glue= "StepDefinitions")
public class LoginTestRunner {

}
