package com.fedex.testCases;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.fedex.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password =readconfig.getPassword();
	public static WebDriver driver;
	//public static Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
	
	 //logger =Logger.getLogger(BaseClass.class);
		//PropertyConfigurator.configure("Log4j.properties");
				}
	
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
			

}
