package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dealStepDefn {
	
	@Given("^User login$")
	public void user_login() throws Throwable {
	   
	}

	@When("^user tried$")
	public void user_tried() throws Throwable {
	    
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable {
		List<List<String>> data=credentials.raw();
		
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
	    
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(1).get(1));
	}

	@Then("^user provides passcode$")
	public void user_provides_passcode(DataTable passcode) throws Throwable {
		List<List<String>> pass=passcode.raw();
		
		System.out.println(pass.get(0).get(0));
	   
	}

}
