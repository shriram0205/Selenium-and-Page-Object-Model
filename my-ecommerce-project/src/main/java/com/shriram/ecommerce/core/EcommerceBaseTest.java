package com.shriram.ecommerce.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shriram.ecommerce.page.BasePage;
import com.shriram.ecommerce.register.Registerpage;

public class EcommerceBaseTest {
	protected WebDriver driver =null;
	@BeforeMethod
	public void setup() throws InterruptedException{
		    
			System.setProperty("webdriver.chrome.driver", "C:/Users/shriram/Desktop/chromedriver.exe");
			driver =new ChromeDriver();
			
			driver.get("http://saipratap.net/ecommerce/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("ACCOUNT")).click();
			 Thread.sleep(2000);
			
	}
	
	@AfterMethod
	  public void teardown(){
		  driver.close();
	  }
	
}
