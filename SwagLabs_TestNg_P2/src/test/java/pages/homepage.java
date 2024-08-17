package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.baseclass;

public class homepage {
WebDriver driver = baseclass.driver;

@FindBy(xpath = "//div[@class='inventory_container']/div/div[1]/div[3]/button")
WebElement cartbutton;

public homepage() {
	PageFactory.initElements(driver, this);
}

public void carttest() {
	cartbutton.click();
}

}
