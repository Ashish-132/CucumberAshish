package DFG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
	public static WebDriver driver;
	
	
	
	public static WebDriver a()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak769\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
       //driver.get("https://www.google.com");
        return driver;
	}
	
	public static void invoke()
	{
		
		driver.get("https://www.google.com");
	}

}
