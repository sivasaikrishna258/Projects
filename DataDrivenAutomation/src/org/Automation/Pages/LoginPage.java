package org.Automation.Pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.Automation.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String uname) throws IOException {
		driver.findElement(By.id(Utility.fetchElements("username"))).sendKeys(uname);
		
	}
	
	public void enterPwd(String pwd) throws IOException {
		driver.findElement(By.id(Utility.fetchElements("password"))).sendKeys(pwd);

	}
	public void clickOnCreateAccount() throws IOException {
		driver.findElement(By.partialLinkText(Utility.fetchElements("createaccount"))).click();;
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void enterFirstName(String firstname) throws IOException {
		WebElement element=driver.findElement(By.name(Utility.fetchElements("firstname1")));
		new WebDriverWait(driver,   
				Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));  
				element.sendKeys(firstname);

	}
	public void enterLastName(String lastname) throws IOException {
		WebElement element=driver.findElement(By.name(Utility.fetchElements("lastname1")));
		new WebDriverWait(driver,   
				Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));  
				element.sendKeys(lastname);

	}
	
	public void clickSignIn() throws IOException {
		driver.findElement(By.name(Utility.fetchElements("signin"))).click();

	}

}
