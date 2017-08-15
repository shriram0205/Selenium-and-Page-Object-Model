package com.shriram.ecommerce.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shriram.ecommerce.page.BasePage;


public class EcommerceLoginPage extends BasePage {
    
WebDriver driver=null;
@FindBy(id=EcommerceLoginConstant.EMAIL)
WebElement email;
@FindBy(css=EcommerceLoginConstant.LOGIN)
WebElement login;
@FindBy(id=EcommerceLoginConstant.PASSWORD)
WebElement password;
public EcommerceLoginPage(WebDriver driver){
	//super(driver);
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  
}	
public void signon(String username, String password1){
	email.sendKeys(username);
	password.sendKeys(password1);
	login.click();
}
public String getTitle(){
	  return driver.getTitle();
}
}