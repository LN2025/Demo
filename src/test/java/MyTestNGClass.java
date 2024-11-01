import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestNGClass {
	 WebDriver driver;
	
	 @BeforeClass
	@Parameters({"browser"})
	 public void driverSetup(String browserName) {
		 if(browserName.equals("chrome")) {
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");	
		 options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 
		 driver = new ChromeDriver(options);
		 }
		 else if(browserName.equals("edge")) {
			 EdgeOptions options = new EdgeOptions();
			 options.addArguments("start-maximized");
			 options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			 driver = new EdgeDriver(options);
		 }
		 
		 driver.get("http://www.google.com");
		 
	  }
	
  @Test(priority=-1)
  public void verifyTitle(){
	  
	  String eTitle = "Google";
	  String aTitle = driver.getTitle();
	  
	  Assert.assertEquals(aTitle, eTitle);
	  
  }
 
  @Test(priority=0)
  public void verifyGmailLink() {
	  WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
	  gmailLink.isDisplayed();
	  }
	 
  
  @Test(priority=2, groups = {"Regression"})
  public void verifyImagesLink() {
	  WebElement imagesLink = driver.findElement(By.linkText("Images"));
	  imagesLink.isDisplayed();
	  }
  

  @AfterClass
  public void closeBrowser() {
	  driver.close();
	  driver.quit();
  }

}
