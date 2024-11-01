
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PP {
	static WebDriver driver=null;
	public static void main(String[] args)throws IOException, InterruptedException {
		{
			try {		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--allow-reload-origins=*");
			options.addArguments("--disable-notifications");
			options.setPageLoadTimeout(Duration.ofSeconds(10));
			
			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//driver.get("http://www.policybazaar.com/");
			driver.get("http://cookbook.seleniumacademy.com/Config.html");
			driver.manage().window().maximize();
			//TEST:1
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//div[@class='prd-block health']//div[@class='shadowHandlerBox']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[normalize-space()='Female']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[@for='3']//i")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
			driver.findElement(By.xpath("//select[@id='Self']")).click();
			WebElement age=driver.findElement(By.xpath("//select[@id='Self']"));
			Select Age=new Select(age);
			//Thread.sleep(3000);
			//Age.selectByValue("20");
			Age.selectByVisibleText("45 yr");
			//System.out.println(Age);
			WebElement sonage=driver.findElement(By.xpath("//select[@id='Son']"));
			Select sonAge=new Select(sonage);
			sonAge.selectByVisibleText("20 yr");
			//Thread.sleep(3000);
			driver.findElement(By.id("step2ContinueBtn")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//div[@class='formWrap']")).sendKeys("Delhi");
			driver.findElement(By.id("city")).sendKeys("Delhi");
			//Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/form/section[1]/article/div[1]/div[2]/ul/li")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("LN");
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9988776655");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[contains(text(),'Continue ›')]")).click();
			Alert myalert= wait.until(ExpectedConditions.alertIsPresent()); // capture alertbox using explicit wait
			
			myalert.dismiss();
//			Alert myalert =driver.switchTo().alert();
//			myalert.accept();
			Thread.sleep(3000);
			driver.quit();
			}catch(Exception e) {
				System.out.println(e);
			}
	 
		}
	}
}