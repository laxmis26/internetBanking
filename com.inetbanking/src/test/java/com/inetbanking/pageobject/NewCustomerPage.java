package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
    WebDriver driver;
    
    // Object repository for the New Customer Page
    
    @FindBy(name="name")
    WebElement txt_NewCustomer;
    
    @FindBy(xpath="//input[@type='radio'  and @value='m']")
    WebElement maleRadioBtn;
    
    @FindBy(xpath="//input[@type='radio'  and @value='f']")
    WebElement femaleRadioBtn;
    
    @FindBy(name="dob")
    WebElement txt_dob;
    
    @FindBy(name="addr")
    WebElement txt_Address;
    
    @FindBy(name="city")
    WebElement txt_city;
    
    @FindBy(name="state")
    WebElement txt_state;
    
    @FindBy(name="pinno")
    WebElement txt_pin;
    
    @FindBy(name="telephoneno")
    WebElement txt_Mobile;
    
    @FindBy(name="emailid")
    WebElement txt_Email;
    
    @FindBy(name="password")
    WebElement txt_password;
    
    @FindBy(name="sub")
    WebElement btnlogin;
    
	public NewCustomerPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyNewCustomerPage()
	{
	    return driver.getTitle();
	}
	
	public void setCustomerName(String customername)
	{
	
		txt_NewCustomer.sendKeys(customername);
	}
	public void selectGender(String gender)
	{
		if(gender.equals("male"))
		{
			maleRadioBtn.click();
			
		}else
		{
			femaleRadioBtn.click();
		}
	}
	
	public void setDOB(String dob)
	{
	
		// 22-4-2023
		String [] date= dob.split("-");
		String day=date[0];
		String month =date[1];
		String year= date[2];
		
		txt_dob.sendKeys(day);
		txt_dob.sendKeys(month);
		txt_dob.sendKeys(year);
		
	}
	
	public void setAddress(String Address)
	{
		txt_Address.clear();
		txt_Address.sendKeys(Address);
	}
	
	public void SetCity(String city)
	{
		txt_city.clear();
		txt_city.sendKeys(city);
	}
	
	public void SetState(String state)
	{
		txt_state.clear();
		txt_state.sendKeys(state);
	}
	
	public void SetPin(String pin)
	{
		txt_pin.clear();
		txt_pin.sendKeys(pin);
	}
	
	public void SetMobile(String Mob)
	{
		txt_Mobile.clear();
		txt_Mobile.sendKeys(Mob);
	}
	
	public void setEmail(String email)
	{
		txt_Email.clear();
		txt_Email.sendKeys(email);
	}
	
	public void SetPassword(String pass)
	{
		txt_password.clear();
		txt_password.sendKeys(pass);
	}
	
	public void clickOnSubmit()
	{
		try {
			Thread.sleep(3000);
			btnlogin.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
}
