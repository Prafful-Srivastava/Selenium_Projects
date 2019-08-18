package ytPkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.assertions.Assertt;

import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends BaseClass
{
	@Test
	public void loginAndClickTrending() throws IOException, InterruptedException 
	{
		LoginIn l = new LoginIn(driver, pr);
		l.signIn("prafful.shri@gmail.com","Shibbu@16");
		Thread.sleep(20000);
		String expected_url = "https://www.youtube.com/";
		Assert.assertTrue(Assertt.assert1(driver.getCurrentUrl(), expected_url));
		System.out.println("Generating log after sign in");
		Logs.takeLog("TC1", "Logged in Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click on Trending");
		WebElement trend = driver.findElement(By.xpath(pr.getProperty("trend")));
		trend.click();
		System.out.println("Clicked on Trending");
		Screenshot.takeScreenshot(driver, "C:\\Users\\Prafful\\Pictures\\Screenshot1.png");
	}
}
