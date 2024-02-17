package org.Automation.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportsEx {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeTest
	public void setup() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
	}


	@Test
	public void test() throws Exception {

		ExtentTest test = extent.createTest("secio", "Sample description");
		driver.get("https://www.facebook.com");
		test.info("navigated to login page");
		driver.findElement(By.partialLinkText("Create new account")).click();
		test.fail("user are able to click on create act");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("syd");  
		test.pass("i4kfit9m4vi");
		driver.findElement(By.name("lastname")).sendKeys("jikm");  
		driver.findElement(By.name("reg_email__")).sendKeys("kmjnnijn@g,ail.vom");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kmjnnijn@g,ail.vom");
		driver.findElement(By.name("reg_passwd__")).sendKeys("jibjibjk");

		WebElement webelement= driver.findElement(By.name("birthday_year"));
		Select testdrop=new Select(webelement);
		testdrop.selectByValue("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}



	@AfterTest
	public void teardown() {
		extent.flush();
		driver.close();

	}
}
