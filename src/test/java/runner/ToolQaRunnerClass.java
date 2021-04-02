package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\DemoQaPage.feature",glue="stepdef1",monochrome=true)
public class ToolQaRunnerClass {

}