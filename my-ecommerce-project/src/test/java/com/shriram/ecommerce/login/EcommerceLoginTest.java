package com.shriram.ecommerce.login;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.shriram.ecommerce.core.EcommerceBaseTest;
import com.shriram.ecommerce.dataprovider.Dataprovider;

public class EcommerceLoginTest extends EcommerceBaseTest {
	@Test(dataProvider="emcommerceLogin",dataProviderClass=Dataprovider.class)
	public void login(String userId, String passWd)throws InterruptedException{
	EcommerceLoginPage page = new EcommerceLoginPage(driver);
	page.signon(userId,passWd);
	Assert.assertEquals("Ez Shop Online", page.getTitle());
	}
}
