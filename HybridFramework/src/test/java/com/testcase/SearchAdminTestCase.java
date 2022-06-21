package com.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.LoginPage;
import com.pages.SearchAdminPage;

public class SearchAdminTestCase extends LibraryClass{
	@BeforeMethod
	public void launch()
	{
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	
	/*@Test
	public void loginTest()
	{
		
	}*/
	
	@Test
	public void searchTest()
	{
		LoginPage pageobj =  new LoginPage(driver);
		pageobj.login("Admin","admin123");
		SearchAdminPage searchAdmin = new SearchAdminPage(driver);
		searchAdmin.search("Admin", "Admin", "Rajiv Sinha", "Enabled");
		
	}
	
/*	@AfterMethod
	public void closeApp()
	{
		ReusableFunction reuse = new ReusableFunction(driver);
		reuse.to_take_screenshot("src/test/resources/screenshorts/login.png");
		reuse.quit();
	}*/
	
}
