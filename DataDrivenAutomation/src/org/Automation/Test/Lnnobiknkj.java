package org.Automation.Test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Lnnobiknkj {
	static WebDriver driver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;

	public static void main(String[] args) {
		 htmlReporter = new ExtentHtmlReporter("extent1.html");
		  extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
			
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
	      
		ExtentTest test = extent.createTest("login to google", "Sample description");

		driver.get("http://www.facebook.com");
		test.log(Status.INFO, "This step shows navigating to google");
		
		 driver.findElement(By.partialLinkText("Create new account")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.name("firstname")).sendKeys("syd");  
		 driver.findElement(By.name("lastname")).sendKeys("jikm");  
		 driver.findElement(By.name("reg_email__")).sendKeys("kmjnnijn@g,ail.vom");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kmjnnijn@g,ail.vom");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("jibjibjk");
		 
		 WebElement webelement= driver.findElement(By.name("birthday_year"));
		 Select testdrop=new Select(webelement);
		 testdrop.selectByValue("1999");
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 driver.close();
		
//		 Select testdrop1=new Select(webelement1);
//		 testdrop1.selectByIndex(2);
		 
	}

}
