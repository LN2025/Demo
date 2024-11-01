import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
 static WebDriver driver;

  @BeforeMethod
  public void driverSetup() { 
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--start-maximized");
	  driver=new ChromeDriver(options);
	  driver.get("http://www.google.com");
  }

	@Test(groups = {"Regression"})
	  public void verifyTitle() {
			
		 driver.getTitle().contains("Google");
			
	  }

  @Test()
  public void verifyGmailLink() {
	  
	  driver.findElement(By.linkText("Gmail")).isDisplayed();
  }
  
  
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
