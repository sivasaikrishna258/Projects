package Loginpage_PF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
}
  