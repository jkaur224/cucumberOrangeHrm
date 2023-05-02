package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\CucumberPomOrangeHRM\\src\\main\\java\\features\\login.feature"},
		glue = {"stepDefinitions"},
		format = {"pretty","html:test-output","junit:juint_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false,
		strict=true,
		tags= {}
		)
public class OrangeRunner {

}
