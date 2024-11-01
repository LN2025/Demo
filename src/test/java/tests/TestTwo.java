package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class TestTwo extends Base{
public WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		browserSetup("edge");
		 driver = new EdgeDriver();
		  driver.get("http://www.google.com");
	  }	
	
  @Test
  public void edgeTest() {
	  
	 
	  System.out.println(driver.getTitle()+" from edge browser"); 
  }
  

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
}
