package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Login Page Repository
	
	 WebDriver driver;
	
	@FindBy(name="uid")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_Password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String usrname)
	{
		txt_username.clear();
		txt_username.sendKeys(usrname);
	}
	
	public void setPassword(String Pass)
	{
		txt_Password.clear();
		txt_Password.sendKeys(Pass);
	}
	
	public HomePage clickonLoginBtn()
	{
		loginBtn.click();
		return new HomePage(driver);
		
		
	}

}


