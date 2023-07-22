package com.inetbanking.utility;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	public static void captureScreenshot(WebDriver driver) {
		try {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//			File target = new File("./Screenshots/" + getCurrentDateTime() + ".png");
//			FileHandler.copy(src, target);
			
	FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./Screenshots/" +getCurrentDateTime()+".png"));
			
		} catch (Exception e) {
			System.out.println("Exception raised in try block " + e);
		}

	}

	public static void HandleAlertPopUp(WebDriver driver) {
		if (isAlertPresent(driver)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} else {
			System.out.println("Alert popup not exists");
		}

	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static String getCurrentDateTime() {
		return new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss").format(new Date());
	}
	
	public static void handleNormalDropdown(WebElement dropdown, int index)
	{
		new Select(dropdown).selectByIndex(index);
		
	}
    
	public static void handleNormalDropdown(WebElement dropdown, String visibleText)
	{
		new Select(dropdown).selectByVisibleText(visibleText);
	}
	
	public static void handleNormalDropdown(String value, WebElement dropdown)
	{
		new Select(dropdown).selectByValue(value);
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
