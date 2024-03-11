import java.time.Duration;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShopNowCheckoutTest {

	
	public static void main(String[] args) {
		
		// Set the path to Chrome WebDriver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Open the Flipkart website
		driver.get("https://www.flipkart.com");

		// Verify homepage loads successfully
		assert driver.getTitle().contains("Flipkart");

		// Search for a product 
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("laptop" + Keys.RETURN);

		//Handling multiple tabs and  add the product to cart
		String mainpage= driver.getWindowHandle();
		WebElement productLink = driver.findElement(By.xpath("//div[contains(text(),'Lenovo')]"));
		productLink.click();
		Set<String> alltabs=driver.getWindowHandles();
		for(String page:alltabs) {
			if(!page.equals(mainpage)) {
				driver.switchTo().window(page);
				break;
			}
		}

		WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addToCartButton.click(); 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Verify that the correct item is in the cart.
		WebElement cartItem = driver.findElement(By.xpath("//div[contains(@class, '_2nQDXZ')]"));
		assert cartItem.getText().contains(productLink.getText());

		//Click on the "Proceed to Checkout" button.
		WebElement checkoutButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
		checkoutButton.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter gmail and click on Continue
		WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("sivasaikrishna258@gmail.com");
		
		driver.findElement(By.xpath("//*[contains(text(),'CONTINUE')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Mobile number and then click on Continue
		WebElement MobileNo=driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _17N0em')]"));
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(MobileNo));
		MobileNo.sendKeys("9121645063");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'CONTINUE')]")).click();

		/**
		 * Taking OTP from console and Login to the application 
		 * Here  we can use other third party API's to read SMS and same  we can use in our Selenium code using Rest Assured like twileo
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter otp");
		String otp=sc.nextLine();
		
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh _17N0em')]")).sendKeys("otp");
		WebElement LoginButton=driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _20xBvF _3AWRsL')]"));
		LoginButton.click();

		//Enter valid shipping information (name, address, city, state, and zip code).Proceed to the next step.
		WebElement AddNewAddressButton=driver.findElement(By.xpath("//div[contains(text(),'Add a new address')]"));
		AddNewAddressButton.click();

		// Shipping information
		WebElement nameInput = driver.findElement(By.name("name"));
		WebElement PhoneInput = driver.findElement(By.name("phone"));
		WebElement cityInput = driver.findElement(By.name("city"));
		WebElement stateInput = driver.findElement(By.name("state"));
		WebElement zipcodeInput = driver.findElement(By.name("pincode"));
		WebElement addressInput = driver.findElement(By.name("addressLine2"));
		WebElement LocalityInput = driver.findElement(By.name("addressLine1"));
		WebElement addressSaveButton = driver.findElement(By.xpath("//button[contains(text(),'Save and Deliver Here')]"));

		nameInput.sendKeys("siva");
		PhoneInput.sendKeys("9121645063");
		cityInput.sendKeys("Tirupathi");
		LocalityInput.sendKeys("Tirupahti ,SPSR Nellore");
		stateInput.sendKeys("Andhra Pradesh");
		zipcodeInput.sendKeys("524408");
		addressInput.sendKeys("Tirupathi");
		addressSaveButton.click();

		// Verify the Order Summary
		WebElement orderSummary = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _1seccl _3AWRsL')]"));
		orderSummary.click();

		// Payment information
		WebElement paymentMethod = driver.findElement(By.xpath("//div[contains(text(),'Net Banking')]"));
		paymentMethod.click();


		// Close the browser
		driver.quit();

	}
	
}
