package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibraryClass;

public class LoginPage extends LibraryClass{
	@FindBy(id="txtUsername")   //findElementById==>change wherever we want
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement pwd;
	@FindBy(xpath="//*[@id=\'btnLogin\']")

	WebElement Loginbutton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
}
	
	public void login(String uname,String pas) {
		username.sendKeys(uname);
		pwd.sendKeys(pas);
		
		Loginbutton.click();
		
	}

}
