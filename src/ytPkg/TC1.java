package ytPkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.assertions.Assertt;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends BaseClass
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
	public void loginAndClickTrending() throws IOException, InterruptedException 
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
		LoginIn l = new LoginIn(driver, pr);
		l.signIn("prafful.shri@gmail.com","Shibbu@16");
		Thread.sleep(20000);
		String expected_url = "https://www.youtube.com/";
		//Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		Assert.assertTrue(Assertt.assert1(driver.getCurrentUrl(), expected_url));
		//Assertt.assert1(driver.getCurrentUrl(), expected_url);
		System.out.println("Generating log after sign in");
		Logs.takeLog("TC1", "Logged in Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click on Trending");
		//WebElement trend = driver.findElement(By.xpath("//a[@href='/feed/trending']"));
		//WebElement trend = driver.findElement(By.xpath("//a[@aria-label = 'Trending']"));
		WebElement trend = driver.findElement(By.xpath(pr.getProperty("trend")));
		trend.click();
		System.out.println("Clicked on Trending");
		Screenshot.takeScreenshot(driver, "C:\\Users\\Prafful\\Pictures\\Screenshot1.png");
	}
	
	/*@AfterMethod
	public void close() 
	{
		System.out.println("Closing the driver");
		//driver.close();
	}*/
}
