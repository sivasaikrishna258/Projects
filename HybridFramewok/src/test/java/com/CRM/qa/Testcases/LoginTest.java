package com.CRM.qa.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		
	}

	@Test
	public void LogintoCRMApplication() {
//		loginpage.clickOnLoginLink();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
