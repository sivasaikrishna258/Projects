package Hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HookSteps {
	
	WebDriver driver=null;
	
	@Before(order=1)
	public void openBrowser() {
		System.out.println("hi");
		System.setProperty("webdriver.chromedriver.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	
	@Before(order=0)
	public void displayMsg() {
		System.out.println("how r u");
		
	}
	
	@Given("User on google search")
	public void user_on_google_search() {
//	    driver.get("https://www.google.com");
	}

	@When("user enters {string}")
	public void user_enters(String string) {
		
	    
	}

	@When("click on searcch button")
	public void click_on_searcch_button() {
	    
	}

	@When("close the browser")
	public void close_the_browser() {
//		driver.close();
	    
	}
	@After
	public void quit() {
		System.out.println("hello");
		driver.close();
	}

	
	
}