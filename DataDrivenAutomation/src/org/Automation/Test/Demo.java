package org.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();  
		driver.manage().timeouts().pageLoadTimeout(40,   
		TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		driver.get("https://www.facebook.com/");  
		WebElement forgotAccount=   
				driver.findElement(By.partialLinkText("Create new account"));
		
		Assert.assertEquals(true, forgotAccount.isDisplayed());
		System.out.println("element is visible");
	
	
}
}
