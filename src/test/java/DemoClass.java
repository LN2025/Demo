import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoClass {
 
	WebDriver driver;

  @BeforeMethod
  public void driverSetup() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--start-maximized");
	  //options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	  options.setPageLoadTimeout(Duration.ofSeconds(10));
	  //options.addArguments("--remote-allow-origins=*");
	  //options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  //driver.get("http://142.250.196.36");
	  //driver.get("http://104.121.230.7");
	  //driver.get("http://www.google.com");
	  
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }


  @DataProvider (name = "dp")
    public Object[][] testMethod(){
  	  return new Object[][] {{"User1", "Pass@1"}, 
  		  					 {"User2", "Pass@2"}
  	  };
    }
    
    
    @Test(dataProvider="dp")
    public void myTest(String LoginId, String Passwd) throws InterruptedException {
  	  //System.out.println(val);
  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  	  driver.findElement(By.id("login1")).sendKeys(LoginId);
  	  driver.findElement(By.id("password")).sendKeys(Passwd);
  	  driver.findElement(By.id("eyeicon")).click();
  	  
  	  Thread.sleep(2000);
    }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
}
