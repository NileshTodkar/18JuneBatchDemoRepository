package Ai.Expertia.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		String Br="Chrome";
		if(Br.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.expertia.ai/");
			Thread.sleep(3000);
		}	
		}
	@AfterTest
	public void quite() {
		driver.quit();
	}
	

}
