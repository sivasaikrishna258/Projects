package com.CRM.qa.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import com.CRM.qa.BaseClass.TestBase;

public class UtilClass extends TestBase {

	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/failedscreenshots/" + System.currentTimeMillis() + ".png"));
		
	}
}
