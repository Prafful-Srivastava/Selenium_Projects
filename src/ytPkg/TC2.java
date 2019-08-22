package ytPkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC2 extends BaseClass
{
	
	@Test
	public void loginAndClickSubscription() throws IOException 
	{
		LoginIn l = new LoginIn(driver,pr);
		l.signIn("prafful.shri@gmail.com","Shibbu@16");
		System.out.println("Generating log after sign in");
		Logs.takeLog("TC1", "Logged in Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click on Subscription");
		WebElement subscription = driver.findElement(By.xpath(pr.getProperty("subscription")));
		subscription.click();
		System.out.println("Clicked on Subscription");
		Screenshot.takeScreenshot(driver, "C:\\Users\\Prafful\\Pictures\\Screenshot2.png");
	}
	
	
}
	
