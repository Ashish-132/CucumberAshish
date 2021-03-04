package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefn {
	WebDriver driver;
	@Given("^user on login$")
	public void user_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak769\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
       driver.get("https://www.google.com");
	   
	}

	@When("^title is gm$")
	public void title_is_gm() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String title=driver.getTitle();
	    System.out.println("Title is"+title);
	    
	}


}
