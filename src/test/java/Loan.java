import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loan {
	
	WebDriver driver;
  @BeforeMethod
  public void setUp() {
	driver  = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }
	
  @DataProvider (name="Name of the Data Provider")
  public Object[][] testMethod() {
	  return new Object[][] {
		  {"user1", "pass@1"},
		  {"user2", "pass@2"},
		  {"user3", "pass@3"}
		  
	  };
  }
  
	
	@Test(dataProvider="Name of the Data Provider")
  public void testMethodwithMultiData(String LoginId, String Passwd) {
		driver.findElement(By.id("login1")).sendKeys(LoginId);
		driver.findElement(By.id("password")).sendKeys(Passwd);
		driver.findElement(By.id("eyeicon")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
