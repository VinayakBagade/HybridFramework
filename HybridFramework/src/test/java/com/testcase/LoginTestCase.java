package com.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.morningstar.ReusableFunction;
import com.pages.LoginPage;


public class LoginTestCase extends LibraryClass{

	@BeforeMethod
	public void launch()
	{
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void loginTest()
	{
		LoginPage pageobj =  new LoginPage(driver);
		pageobj.login("Admin","admin123");
	}
	
	@AfterMethod
	public void closeApp()
	{
		ReusableFunction reuse = new ReusableFunction(driver);
		reuse.to_take_screenshot("src/test/resources/screenshorts/login.png");
		reuse.quit();
	}
	
	
}
