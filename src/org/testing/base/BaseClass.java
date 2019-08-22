package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void baseMethod() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prafful\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		//Load OR file
		File f = new File("../YTFramework/OR.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("Closing the driver");
	}
}
