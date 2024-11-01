package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	public WebDriver browserSetup(String browserName) throws MalformedURLException {
		
		WebDriver driver;
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			dc.setBrowserName("chrome");
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			dc.setBrowserName("edge");
		}
		else
		{
			dc.setBrowserName("firefox");
		}
	
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		
		return driver;
}
	
}
