package Runners;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Dashboard.feature", glue = {"StepDef"}, plugin = {"pretty", "html:target/HTML/cucumber-reports.html", "json:target/JSON/cucumber-reports.json"}, monochrome = true)
public class TestRunner {

	
}
