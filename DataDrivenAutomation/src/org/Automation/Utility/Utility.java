package org.Automation.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility{
	
	 public static Object fetchProperty(String key) throws IOException {  
	        
		   FileInputStream file=new FileInputStream("./Config/config.properties");//creating the object of fileinputstream
		   Properties property=new Properties();//create instance of properties class
		   property.load(file); //loading the file
		   return property.get(key);//returning the element based on element passed
		      
		    }  
	 
	 
	 
	 public static String fetchElements(String key) throws IOException {  
	        
		   FileInputStream file=new FileInputStream("./Config/element.properties");
		   Properties property=new Properties();
		   property.load(file);
		   return property.get(key).toString();
		      
		    }  
		  
		}  


