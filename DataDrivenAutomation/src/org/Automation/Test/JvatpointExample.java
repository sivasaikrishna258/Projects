package org.Automation.Test;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;  
	import org.openqa.selenium.By;  
	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.WebElement;  
	import org.openqa.selenium.chrome.ChromeDriver;  
	import org.openqa.selenium.support.ui.ExpectedConditions;  
	import org.openqa.selenium.support.ui.WebDriverWait;   
	public class JvatpointExample {  
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
			clickOn(driver,forgotAccount, 10);  
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	WebElement firstname= driver.findElement(By.name("firstname"));  
	WebElement lastname= driver.findElement(By.name("lastname"));  
	WebElement email= driver.findElement(By.name("reg_email__"));
	WebElement pwd= driver.findElement(By.name("reg_passwd__"));
	sendKeys(driver, firstname, 10, "Edureka");  
	sendKeys(driver, lastname, 20, "Edureka");
	sendKeys(driver, email, 10, "sivasaikrishna258@gmail.com");  
	sendKeys(driver, pwd, 20, "Edksnn");
	WebElement signup=   
			driver.findElement(By.partialLinkText("Sign Up"));  
			clickOn(driver,signup, 10); 
	}  
	public static void sendKeys(WebDriver driver1, WebElement element,   
	int timeout, String value){  
	new WebDriverWait(driver1,   
	Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));  
	element.sendKeys(value);  
	}  
	public static void clickOn(WebDriver driver1, WebElement element,   
	int timeout)  
	{  
	new WebDriverWait(driver1,   
	Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));  
	element.click();  
	}  
	}  


