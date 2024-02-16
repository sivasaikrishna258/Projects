package org.testing.TestCases;
import org.openqa.selenium.WebDriver;
import org.testing.Base.CreateDriverInstance;
import org.testing.Pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.da.Givet;
import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	LoginPage login;
	@Givet("User on login page")
	public void user_on_login_page() {
		CreateDriverInstance driverinstance=new CreateDriverInstance();
		driver=driverinstance.generateDriverInstance();
	}

	@When("user enters usename as {string}")
	public void user_enters_usename_as(String username) {
		login=new LoginPage(driver);
		login.enterUsername(username);
	    
	}

	@When("enters password as {string}")
	public void enters_password_as(String password) {
	   login.enterPassword(password);
	}

	@When("user click on signin")
	public void user_click_on_signin() {
	   login.clickOnSignin();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

	
}
