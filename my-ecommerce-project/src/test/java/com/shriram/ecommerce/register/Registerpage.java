package com.shriram.ecommerce.register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shriram.ecommerce.page.BasePage;

public  class Registerpage extends BasePage {
	WebDriver driver=null;
	@FindBy(xpath=RegsiterConstant.SIGNUP)
	WebElement signup;
	@FindBy(id=RegsiterConstant.PASSWORD)
	WebElement password;
	@FindBy(id=RegsiterConstant.PHONE)
	WebElement phone;
	@FindBy(id=RegsiterConstant.C_PASSWORD)
	WebElement cpassword;
	@FindBy(id=RegsiterConstant.TERMS)
	WebElement terms;
	@FindBy(css=RegsiterConstant.REGISTER)
	WebElement register;
		@FindBy(id=RegsiterConstant.F_NAME)
	  WebElement fname;
		@FindBy(id=RegsiterConstant.L_NAME)
	  WebElement lname;
		@FindBy(id=RegsiterConstant.EMAIL)
	  WebElement email;
	    
		 public Registerpage(WebDriver driver){
			 //super(driver);
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
			  
		  }	
		 public void signon(String fname1, String lname1, String email1, String password1, String cpassword1, String phone1) throws InterruptedException{
			 
             signup.click();
			 fname.sendKeys(fname1);
			 lname.sendKeys(lname1);
			 email.sendKeys(email1);
			 password.sendKeys(password1);
			 cpassword.sendKeys(cpassword1);
			 phone.sendKeys(phone1);
			 if(!terms.isSelected()){
			 terms.click();
			 }
			 register.click();
		 }
		 public String getTitle(){
			  return driver.getTitle();
		  }
}
