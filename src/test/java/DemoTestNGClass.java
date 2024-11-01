import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTestNGClass {
	
	 WebDriver driver;
	
	 
  @BeforeMethod
  @Parameters({"browser"})
  public void driverSetUp(String browser) {
	  ChromeOptions options = new ChromeOptions();
	  options.setAcceptInsecureCerts(false);
	  	  
	  if(browser.equalsIgnoreCase("chrome")) {
	  	  
	  driver = new ChromeDriver();
	  
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  
		  driver = new EdgeDriver();
	  }
	  //driver.get("http://www.rediffmail.com"); 
	  
	  driver.get("https://cookbook.seleniumacademy.com/Alerts.html");
	  driver.manage().window().maximize();
  } 

  
  @Test
  public void  verifyTitle() {
	  
	  //String eTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus";
	  
	  //String aTitle = driver.getTitle();
	  
	  //System.out.println(aTitle);
	  //Assert.assertEquals(eTitle, aTitle);
  }
  
  @Test
  public void verifyCurrentUrl() {
	  //System.out.println(driver.getCurrentUrl());
  }
   
  
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
  
}
