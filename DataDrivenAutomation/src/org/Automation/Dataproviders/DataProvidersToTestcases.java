package org.Automation.Dataproviders;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public  class DataProvidersToTestcases {
	
	@DataProvider(name="register")
	public static Object[][] testData(Method met) throws Exception {
		if(met.getName().equalsIgnoreCase("TC_01")) {
		FileInputStream file =new FileInputStream("./Testdata/Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); //creating object of workbook
		XSSFSheet sheet=workbook.getSheet("Login");		//getting yhe sheet from workbook object
		int numberofrows=sheet.getPhysicalNumberOfRows();
		Object[][] testdata=new Object[numberofrows][2];
		for(int i=0;i<numberofrows;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell username=row.getCell(0);
			XSSFCell pwd=row.getCell(1);
			testdata[i][0]=username.getStringCellValue();
			testdata[i][1]=pwd.getStringCellValue();

		}
		return testdata;
		}
		
		else {
		FileInputStream file =new FileInputStream("./Testdata/Register.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Register");
		int numberofrows=sheet.getPhysicalNumberOfRows();
		Object[][] testdata=new Object[numberofrows][2];
		for(int i=0;i<numberofrows;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell firstname=row.getCell(0);
			XSSFCell lastname=row.getCell(1);
			testdata[i][0]=firstname.getStringCellValue();
			testdata[i][1]=lastname.getStringCellValue();

		}
		return testdata;
	}
	}
}
