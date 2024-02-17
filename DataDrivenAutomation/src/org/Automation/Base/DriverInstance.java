package org.Automation.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Automation.Utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DriverInstance {
	public static WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	protected ExtentReports extent;
	
	
	@BeforeTest
	public void initiateDriver() throws IOException 
	{
		
//		htmlReporter = new ExtentHtmlReporter("extent2.html");
//		extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	public void close() {
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);	

		driver.quit();
	}

}
