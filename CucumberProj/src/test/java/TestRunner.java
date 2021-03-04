

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ak769\\Desktop\\Program\\CucumberProj\\src\\main\\java\\Features\\login.feature"
		,glue= {"stepDefinition"},
		format= {"pretty","html:test-output","json:json-output/JsonOutput.json","junit:junit-output/op.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class TestRunner {
	

}
