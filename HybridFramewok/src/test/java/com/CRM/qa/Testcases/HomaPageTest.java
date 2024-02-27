package com.CRM.qa.Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.CalendarPage;
import com.CRM.qa.Pages.CompaniesPage;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class HomaPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	CalendarPage calendarpage;
	CompaniesPage companiespage;
	
	public HomaPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
	}
	
	@Test
	public void verifyUserNameTest() {
	Assert.assertTrue(homepage.validationOfUserOnHeader(), "username is correect");
	}
	
	@Test(priority=0)
	public void clickOnContactsLinkTest() {
		contactspage=homepage.clickOnContactsLink();
		
	}
	
	@Test(priority=1)
	public void clickOncalendarLinkTest() {
		calendarpage=homepage.clickOnCalenderLink();
	}
	
	@Test(priority=2)
	public void clickOnCompaniesLinkTest() {
		companiespage=homepage.clickOnCompaniesrLink();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
