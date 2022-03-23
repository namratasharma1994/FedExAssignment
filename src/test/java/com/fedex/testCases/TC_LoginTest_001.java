package com.fedex.testCases;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.fedex.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
	//logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
	
		//logger.info("Entered username");
		lp.setPassword(password);
		Thread.sleep(2000);
		//logger.info("Entered password");
		lp.clickSubmit();
		if(driver.getTitle().equals("fedEx"))
		{
		Assert.assertTrue(true);
		//logger.info("Login Test passed");
		}
		else
		{
	Assert.assertTrue(false);
	//logger.info("Login Test failed");
		}
	}
	

}
