package org.testing.Assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	public boolean validatePageUrl(WebDriver driver,String expectedurl) {
		boolean result=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedurl)) {
			result=true;
		}
		return result;
	}

}
