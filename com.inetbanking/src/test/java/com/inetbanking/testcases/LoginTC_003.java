package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;
import com.inetbanking.testbase.TestBase;

public class LoginTC_003 extends TestBase {
	
	@Test
	public void verifyLoginFunctionalityTC_003()
	{
		LoginPage login = new LoginPage(driver);
//		String username = excelDataProvider.getStringCellData(0, 1, 0);
//		String password = excelDataProvider.getStringCellData(0, 1, 1);
//		String exptitle = excelDataProvider.getStringCellData(0, 1, 2);
		
		String username = excelDataProvider.getStringCellData("Login", 1, 0);
		String password = excelDataProvider.getStringCellData("Login", 1, 1);
		String exptitle = excelDataProvider.getStringCellData("Login", 1, 2);
		
		login.setUsername(username);
		login.setPassword(password);
		login.clickonLoginBtn();
		
		if(exptitle.equals(driver.getTitle()))
		{
			Assert.assertTrue(true);
			System.out.println("Login Successful");
		}
		else
		{
		   Assert.assertTrue(false);
		   System.out.println("Login failed");
		}
	
	}
	

}
