package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class TestOne extends Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		browserSetup("chrome");
		
		 driver = new ChromeDriver();
		  driver.get("http://www.google.com");
	  }	
	
  @Test
  public void chromeTest() {
	 
	  System.out.println(driver.getTitle()+" from chrome browser"); 
  }
  

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
