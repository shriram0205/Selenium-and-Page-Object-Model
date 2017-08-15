package com.shriram.ecommerce.register;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.shriram.ecommerce.core.EcommerceBaseTest;
import com.shriram.ecommerce.dataprovider.Dataprovider;


public class RegisterTest extends EcommerceBaseTest{
  @Test(dataProvider="ecommerceRegister",dataProviderClass=Dataprovider.class)
	public void registration(String fname, String lname, String email, String password, String cpassword, String phone) throws InterruptedException{
		
	  Registerpage page = new Registerpage(driver);
	  page.signon(fname, lname, email, password, cpassword,phone);
	  Assert.assertEquals("Ez Shop Online", page.getTitle());
	}
}    
