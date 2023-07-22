package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;
import com.inetbanking.testbase.TestBase;
import com.inetbanking.utility.Helper;

public class LoginTC_002 extends TestBase {
	
	
	@Test
	public void verifyLoginFunctionalityTC_002()
	{
		LoginPage login = new LoginPage(driver);
		login.setUsername(configDataProvider.getUsername());
		login.setPassword(configDataProvider.getPassword());
		
		login.clickonLoginBtn();
		
				
		String expTitle = "Guru99 Bank Manager HomePage";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			Assert.assertTrue(true);
//			Helper.captureScreenshot(driver, "HomePage");
			Helper.captureScreenshot(driver);
		}
		else
		{
//		Helper.captureScreenshot(driver, "LoginPage");
			Helper.captureScreenshot(driver);
			Assert.assertTrue(false);
		}
		
//		Assert.assertEquals(actTitle, expTitle, "act browser doesn't matched with expected browser");
		
	}
   
	 

}
