package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class TestThree extends Base {
public WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		 browserSetup("firefox");
		 driver = new FirefoxDriver();	
		 driver.get("http://www.google.com");
	  }	
	
  @Test
  public void firefoxTest() {
	 
	  System.out.println(driver.getTitle()+" from FF browser"); 
  }
  

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
}