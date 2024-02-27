package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;

public class LoginPage extends TestBase {

	@FindBy(css = "a[href*='ui'")
	WebElement loginbutton;

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[contains(@class,'ui fluid large blue submit button')]")
	WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public void clickOnLoginLink() {
//		loginbutton.click();
//	}

	public HomePage login(String uname,String Pwd) {
		loginbutton.click();
		username.sendKeys(uname);
		password.sendKeys(Pwd);
		login.click();

		return new HomePage();
	}


}
