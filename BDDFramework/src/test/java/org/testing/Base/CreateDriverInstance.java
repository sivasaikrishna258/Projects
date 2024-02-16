package org.testing.Base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CreateDriverInstance {
	WebDriver driver;
	@Before
	public WebDriver generateDriverInstance() {
		ResourceBundle config=ResourceBundle.getBundle("config");
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(config.getString("applicationurl"));
		
		return driver;
		
	}
	
	

}
