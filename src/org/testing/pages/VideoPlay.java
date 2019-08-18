package org.testing.pages;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay 
{
	ChromeDriver driver;
	Properties pr;
	public VideoPlay(ChromeDriver driver, Properties pr) 
	{
		this.driver = driver;
		this.pr=pr;
	}
	
	public void playVideo() 
	{
		//WebElement we = driver.findElement(By.xpath("//div[@id = 'scroll-container']/div[@id = 'items']/ytd-grid-video-renderer/div[@id='dismissable']/ytd-thumbnail/a[@id='thumbnail']/yt-img-shadow/img[@id='img']"));
		WebElement we = driver.findElement(By.xpath(pr.getProperty("we")));
		int vc = we.findElements(By.xpath("//img[@id = 'img']")).size();
		System.out.println("video count is" + vc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> yt = driver.findElements(By.xpath("//img[@id = 'img']"));
		yt.get(5).click();
		System.out.println("Video is played");
	}
}
