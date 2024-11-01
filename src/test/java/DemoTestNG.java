import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTestNG {
  
	WebDriver driver;
	
	@BeforeMethod()
	@Parameters({"browser"})
	  public void driverSetup(String browserName) {
		
		if(browserName.equals("Chrome")) {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		//options.addArguments("--disable-notifications");
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setPageLoadTimeout(Duration.ofSeconds(10));
		
		driver = new ChromeDriver(options);
		}
		
		else if(browserName.equals("Edge")) {
			
			EdgeOptions options = new EdgeOptions();
			
			driver = new EdgeDriver(options);	
		}
		
		driver.get("http://www.google.com");
	  }
	
	
	
	@Test(priority=-1)
  public void verifyTitle() {
		
		String eTitle = "Google";
		
		String aTitle = driver.getTitle();
		
		Assert.assertEquals(aTitle, eTitle);
  }
  
 @Test()
 public void verifyGmailLink() {
	 WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
	 gmailLink.isDisplayed();
	 
 }
 
 
 @Test()
 public void verifyImagesLink() {
	 WebElement imagesLink = driver.findElement(By.linkText("Images"));
	 imagesLink.isDisplayed();
 }

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
