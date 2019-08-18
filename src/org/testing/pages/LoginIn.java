package org.testing.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIn 
{
	ChromeDriver driver;
	Properties pr;
	public LoginIn(ChromeDriver driver, Properties pr) 
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	public void signIn(String user, String password) 
	{
		//WebElement si = driver.findElement(By.xpath("//paper-button[@aria-label = 'Sign in']"));
		WebElement si = driver.findElement(By.xpath(pr.getProperty("si")));
		si.click();
		//WebElement e = driver.findElement(By.xpath("//input[@type = 'email']"));
		WebElement e = driver.findElement(By.xpath(pr.getProperty("e")));
		e.sendKeys(user);
		//WebElement next = driver.findElement(By.cssSelector("span.RveJvd.snByac"));
		WebElement next = driver.findElement(By.cssSelector(pr.getProperty("next")));
		next.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement passwd = driver.findElement(By.xpath("//input[@name = 'password']"));
		WebElement passwd = driver.findElement(By.xpath(pr.getProperty("passwd")));
		passwd.sendKeys(password);
		WebElement finalnext = driver.findElement(By.cssSelector(pr.getProperty("finalnext")));
		finalnext.click();
		System.out.println("Login Successful");
	}
}
