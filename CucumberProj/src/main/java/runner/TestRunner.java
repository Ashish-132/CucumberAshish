package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ak769\\Desktop\\Program\\CucumberProj\\src\\main\\java\\Features\\deal.feature"
		,glue= {"stepDefinition"}
		
		)

public class TestRunner {
	//please pull the code

}
