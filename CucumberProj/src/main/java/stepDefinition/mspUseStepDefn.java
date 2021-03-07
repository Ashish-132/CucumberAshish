package stepDefinition;



import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mspUseStepDefn {

@Given("^Provide Credentials$")
public void provide_Credentials(DataTable cred) throws Throwable {
	//Map<String, String> data=(Map<String, String>) cred.asMaps(String.class, String.class);
    for(Map<String, String> data:cred.asMaps(String.class, String.class))
    {
    	System.out.println(data.get("username"));
    	System.out.println(data.get("Password"));
    }
}

@When("^user enters values$")
public void user_enters_values(DataTable val) throws Throwable {
	for(Map<String, String> value:val.asMaps(String.class, String.class))
	{
		System.out.println(value.get("Test1"));
    	System.out.println(value.get("Test2"));
    	System.out.println(value.get("Test3"));
	}
    
}

@Then("^user logged in$")
public void user_logged_in() throws Throwable {
    
}

@Then("^user checks title$")
public void user_checks_title() throws Throwable {
   
}

@Then("^user closes browser$")
public void user_closes_browser() throws Throwable {
   
}

	}
