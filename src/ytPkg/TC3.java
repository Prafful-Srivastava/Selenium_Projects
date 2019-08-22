package ytPkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testing.pages.VideoPlay;
import org.testing.utilities.Logs;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC3 extends BaseClass
{
	
	@Test
	public void videoPlayAndLike() throws InterruptedException, IOException 
	{
		LoginIn l = new LoginIn(driver, pr);
		l.signIn("prafful.shri@gmail.com","Shibbu@16");
		System.out.println("Generating log after sign in");
		Logs.takeLog("TC1", "Logged in Successfully");
		//Below code for video play
		System.out.println("Play the video");
		VideoPlay vp = new VideoPlay(driver,pr);
		vp.playVideo();
		System.out.println("Like the video played");
		Thread.sleep(5000);
		WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		System.out.println("Video liked");
		Screenshot.takeScreenshot(driver, "C:\\Users\\Prafful\\Pictures\\Screenshot3.png");
		
	}
}