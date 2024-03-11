package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;

public class CalendarPage extends TestBase {
	
	@FindBy(xpath="//*[contains(text(),'Calendar')]")
	WebElement eventslink;
	
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEventsLink() {
		eventslink.click();
	}
}
