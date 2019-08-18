package ytPkg;

import java.io.IOException;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testing.pages.VideoPlay;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC3 extends BaseClass
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
	public void videoPlayAndLike() throws InterruptedException, IOException 
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
		System.out.println("Generating log after sign in");
		Logs.takeLog("TC1", "Logged in Successfully");
		//Below code for video play
		System.out.println("Play the video");
		VideoPlay vp = new VideoPlay(driver,pr);
		vp.playVideo();
		/*WebElement we = driver.findElement(By.xpath("//div[@id = 'scroll-container']/div[@id = 'items']/ytd-grid-video-renderer/div[@id='dismissable']/ytd-thumbnail/a[@id='thumbnail']/yt-img-shadow/img[@id='img']"));
		int vc = we.findElements(By.xpath("//img[@id = 'img']")).size();
		System.out.println("video count is" + vc);
		Thread.sleep(5000);
		List<WebElement> yt = driver.findElements(By.xpath("//img[@id = 'img']"));
		yt.get(5).click();*/ // can put for loop for specific video number
		System.out.println("Like the video played");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		System.out.println("Video liked");
		Screenshot.takeScreenshot(driver, "C:\\Users\\Prafful\\Pictures\\Screenshot3.png");
		
	}
	
	/*@AfterMethod
	public void close() throws InterruptedException 
	{
		Thread.sleep(5000);
		System.out.println("Closing the driver");
		//driver.close();
	}*/
}










/*
for(WebElement sample: options)
{
    if(sample.getText().equals(sample))
    {
        //sample.click();
        //break;
    }
    
}*/