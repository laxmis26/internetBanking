package com.inetbanking.testcases;




import org.testng.Assert;
import org.testng.annotations.Test;


import com.inetbanking.testbase.TestBase;

public class LoginTC_001 extends TestBase{
	
	@Test
	public void verifyLoginPageTitleTC_001()
	{
		String expTitle = "Guru99 Bank Home Page";
		String actTitle = driver.getTitle();
		
		System.out.println(actTitle);
	
		
		if(expTitle.equals(actTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	
	
	
}
