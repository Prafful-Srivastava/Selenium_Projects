package ytPkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC2 extends BaseClass
{
	//ChromeDriver driver;
	
	/*@BeforeMethod
	public void signin() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prafful\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}*/
	
	@Test
	public void loginAndClickSubscription() throws IOException 
	{
		/*WebElement si = driver.findElement(By.xpath("//paper-button[@aria-label = 'Sign in']"));
		si.click();
		WebElement e = driver.findElement(By.xpath("//input[@type = 'email']"));
		e.sendKeys("prafful.shri@gmail.com");
		WebElement next = driver.findElement(By.cssSelector("span.RveJvd.snByac"));
		next.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement passwd = driver.findElement(By.xpath("//input[@name = 'password']"));
		passwd.sendKeys("Shibbu@16");
		WebElement finalnext = driver.findElement(By.cssSelector("span.RveJvd.snByac"));
		finalnext.click();
		System.out.println("Login Successful");*/
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
	
	/*@AfterMethod
	public void close() 
	{
		System.out.println("Closing the driver");
		//driver.close();
	}*/
}
	
