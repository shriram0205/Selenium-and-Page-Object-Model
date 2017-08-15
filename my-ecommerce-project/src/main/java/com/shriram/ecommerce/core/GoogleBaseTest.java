package com.shriram.ecommerce.core;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleBaseTest {
  
	protected WebDriver driver =null;
	@BeforeMethod
	public void setup(){
		    
			System.setProperty("webdriver.chrome.driver", "C:/Users/shriram/Desktop/chromedriver.exe");
			driver =new ChromeDriver();
			
			driver.get("http://www.google.com/gmail");
	}
	@AfterMethod
	  public void teardown(){
		  driver.close();
	  }
}
