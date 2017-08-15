package com.shriram.ecommerce.dataprovider;

import org.testng.annotations.DataProvider;


import com.shriram.ecommerce.core.XLSUnil;

public  class Dataprovider {
	@DataProvider(name="success")
	public static Object[][] getSuccessIds(){
		String [][] idsFromSheet=XLSUnil.getTableArray("google_ids.xls", "Sheet1", "GoogleIds");
		return idsFromSheet;
		
	}
	@DataProvider(name="emcommerceLogin")
	public static Object[][] getEcommerceIds(){
		String [][] idsFromSheet=XLSUnil.getTableArray("Ecommerce_Ids.xls", "Sheet1", "EcommerceIds");
		return idsFromSheet;
		
	}
	@DataProvider(name="ecommerceRegister")
	public static Object[][] getEcommerceRegister(){
		String [][] idsFromSheet=XLSUnil.getTableArray("Ecommerce_register.xls", "Sheet1", "EcommerceRegister");
		return idsFromSheet;
		
	}
}
