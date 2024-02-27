package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement  createnewuser;
	
	@FindBy(name="first_name")
	WebElement  firstname;
	
	@FindBy(name="last_name")
	WebElement  lastname;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement  savebutton;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateButton() {
		createnewuser.click();
		firstname.sendKeys("siva");
		lastname.sendKeys("sai");
		savebutton.click();
	}
	

}
