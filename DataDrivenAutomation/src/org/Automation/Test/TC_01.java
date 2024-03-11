package org.Automation.Test;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.Automation.Base.DriverInstance;
import org.Automation.Dataproviders.DataProvidersToTestcases;
import org.Automation.Pages.LoginPage;
import org.Automation.Utility.Utility;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TC_01 extends DriverInstance {

	@Test(dataProvider="register",dataProviderClass = DataProvidersToTestcases.class)
	public  void login(String uname,String pass) throws IOException {
		
		
		driver.get(Utility.fetchProperty("Applicationurl").toString());
		
		LoginPage login=new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPwd(pass);
		login.clickSignIn();
	}
//	@DataProvider(name="Static")
//	public Object[][] testDataGenerator() {
//		Object[][] data= {{"uname","pass"},{"uname1","pass1"}};
//		return data;
//		
//	}
	
}


