package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.HomePage;
import com.inetbanking.pageobject.LoginPage;
import com.inetbanking.testbase.TestBase;
import com.inetbanking.utility.Helper;

public class HomeTC_001 extends TestBase {

//	@Test
//	public void navigateTonewCustomerTC_001() {
//		LoginPage login = new LoginPage(driver);
//
//		String username = excelDataProvider.getStringCellData("Login", 1, 0);
//		String password = excelDataProvider.getStringCellData("Login", 1, 1);
//
//		login.setUsername(username);
//		login.setPassword(password);
//
//		HomePage homepage = login.clickonLoginBtn();
//		homepage.ClickOnNewCustomeLink();
//
//		System.out.println(driver.getTitle());
//
//	}
	
	@Test
	public void verifyLogoutFunctionality() throws InterruptedException {
		LoginPage login = new LoginPage(driver);

		String username = excelDataProvider.getStringCellData("Login", 1, 0);
		String password = excelDataProvider.getStringCellData("Login", 1, 1);

		login.setUsername(username);
		login.setPassword(password);

		HomePage homepage = login.clickonLoginBtn();
		
	    Thread.sleep(3000);
		
		homepage.clickOnLogoutLink();

		Helper.HandleAlertPopUp(driver);

		String actTitle = driver.getTitle();
		String expTitle = "Guru99 Bank Home Page";

		if (actTitle.equals(expTitle)) {
			Assert.assertTrue(true);
//			Helper.captureScreenshot(driver, "LoginPage");
			Helper.captureScreenshot(driver);

		} else {
//			Helper.captureScreenshot(driver, "Homepage");
			Helper.captureScreenshot(driver);
			Assert.assertTrue(false);
			

		}
		
		
		
		
		
		
		
	}
}
