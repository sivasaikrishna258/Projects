package org.testing.Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testing.Base.CreateDriverInstance;

public class LoginPage   {
	
	WebDriver driver;
	ResourceBundle element;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		element=ResourceBundle.getBundle("Elements");
		
	}
	
	public void enterUsername(String uname) {
		driver.findElement(By.id(element.getString("login_username"))).sendKeys(uname);
		
	}
	public void enterPassword(String password) {
		driver.findElement(By.id(element.getString("login_password"))).sendKeys(password);
	}
	public void clickOnSignin() {
		driver.findElement(By.name(element.getString("login_signin"))).click();	}

}
