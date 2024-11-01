import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestClass {

	public static void main(String[] args) {

	DemoTestNGClass dt = new DemoTestNGClass();
	
	dt.verifyTitle();
	dt.verifyCurrentUrl();
	
	}
}
