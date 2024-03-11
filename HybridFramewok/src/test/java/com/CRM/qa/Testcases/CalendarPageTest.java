package com.CRM.qa.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.CalendarPage;
import com.CRM.qa.Pages.CompaniesPage;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class CalendarPageTest extends TestBase{
	
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	CalendarPage calendarpage;
	CompaniesPage companiespage;
	boolean b;
	
	public CalendarPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
	}
	
	@Test
	public void clickOnCalendarTest() {

		calendarpage=homepage.clickOnCalenderLink();
		calendarpage.clickOnEventsLink();
	
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}

}
