package com.shriram.google.login;

import org.testng.annotations.Test;

import com.shriram.ecommerce.core.GoogleBaseTest;
import com.shriram.ecommerce.dataprovider.Dataprovider;


import org.testng.Assert;

public class LoginTest extends GoogleBaseTest{
  @Test(dataProvider="success",dataProviderClass=Dataprovider.class)
  public void performSuccessLogin(String userId, String passWd) throws InterruptedException {
	  LoginPage page = new LoginPage(driver);
	  page.signon(userId, passWd);
	  Assert.assertEquals("Gmail", page.getTitle());
  }
}
