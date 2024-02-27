package com.CRM.qa.Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Roughwork {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.findElement(By.cssSelector("a[href*='ui'")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void login() {
		driver.findElement(By.name("email")).sendKeys("sivasaikrishna258@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sivasai@123");
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
		 WebElement calendarlink=driver.findElement(By.xpath("//*[contains(text(),'Calendar')]"));

		new WebDriverWait(driver,   
					Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(calendarlink)).click();
		 
		driver.findElement(By.xpath("//button[contains(text(),'Events')]")).click();
		 WebElement calendarlink1=driver.findElement(By.xpath("//input[contains(text(),'meeting')]"));
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(calendarlink1)).click();

		//*[contains(text(),'meeting')]
	}
	
//	@Test
//	public void login1() {
//		
//		driver.findElement(By.xpath("(//*[contains(text(),'Contacts')]")).click();
//	}
//	@Test
//	public void login2() {
//		
//		driver.findElement(By.xpath("(//*[contains(text(),'Companies')]")).click();
//	}
//	
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
