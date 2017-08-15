package com.shriram.google.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shriram.ecommerce.page.BasePage;

public  class LoginPage {
	 WebDriver driver=null;
	@FindBy(id=LoginConstant.IDENTIFIER_ID)
  WebElement emailid;
	@FindBy(xpath=LoginConstant.IDENTIFIER_NEXT)
  WebElement nextBtn;
	@FindBy(css=LoginConstant.IDENTIFIER_PASSWORD)
  WebElement passid;
	@FindBy(xpath=LoginConstant.IDENTIFIER_PASSWORDNEXT)
  WebElement passnext;
  public LoginPage(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  
  }
  public void signon(String user, String pass) throws InterruptedException{
	  emailid.sendKeys(user);
	  Thread.sleep(2000);
	  nextBtn.click();
	  Thread.sleep(2000);
	  passid.sendKeys(pass);
	  Thread.sleep(2000);
	  passnext.click();
  }
  public String getTitle(){
	  return driver.getTitle();
  }
}
