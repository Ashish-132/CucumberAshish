package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn2 {
	@Given("^Userone is on login page$")
	public void userone_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Title is gmail as$")
	public void title_is_gmail_as() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
