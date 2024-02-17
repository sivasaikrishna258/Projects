package org.Automation.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Automation.Base.DriverInstance;
import org.Automation.Dataproviders.DataProvidersToTestcases;
import org.Automation.Pages.LoginPage;
import org.testng.annotations.Test;

public class NewUserRegistration extends DriverInstance{
	
	@Test(dataProvider = "register", dataProviderClass = DataProvidersToTestcases.class)
	public  void newUserRegister(String firstname,String lastname) throws IOException {

		LoginPage login=new LoginPage(driver);
		login.clickOnCreateAccount();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		login.enterFirstName(firstname);
		login.enterLastName(lastname);
	}

}
