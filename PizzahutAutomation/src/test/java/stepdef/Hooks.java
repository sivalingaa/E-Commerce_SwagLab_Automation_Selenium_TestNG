package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
public static WebDriver driver;
public static ExtentReports report = new ExtentReports("HtmlResults.html",false);
public static ExtentTest test;
	
	@Before
	public void SetUp(Scenario scenario) {
		test = report.startTest(scenario.getName());
		driver = new ChromeDriver();
	}
	
	@After
	public void TearDown() {
		driver.quit();
		report.endTest(test);
		report.close();
	}

}
