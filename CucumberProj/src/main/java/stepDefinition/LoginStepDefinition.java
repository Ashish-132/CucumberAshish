package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak769\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.get("https://www.google.com");
	    
	}

	@When("^Title is gmail$")
	public void title_is_gmail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String title=driver.getTitle();
	    System.out.println(title);
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user sucessfully logged in$")
	public void user_sucessfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
