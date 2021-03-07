import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ak769\\git\\CucumberAshish\\CucumberProj\\src\\main\\java\\Features\\mapsuse.feature"
		,glue= {"stepDefinition"},
		format= {"pretty","html:test-output","json:json-output/JsonOutput.json","junit:junit-output/op.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
public class TestRunner2 {
	

}
