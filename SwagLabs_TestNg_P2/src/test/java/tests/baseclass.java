package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class baseclass {

	public static WebDriver driver;
	
	@BeforeMethod()
	public void BeforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		}
	
	@AfterMethod()
	public void AfterTest() {
		driver.close();
	}
}
