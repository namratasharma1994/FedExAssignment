package com.fedex.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how = How.XPATH , using ="//input[@type='text' and @id='userId']")
	
	WebElement txtuserName;

	@FindBy(how = How.XPATH, using ="//*[@type='password']/parent::div")
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtuserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
}


