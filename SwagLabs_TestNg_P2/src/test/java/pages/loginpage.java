package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import tests.baseclass;

public class loginpage {
WebDriver driver = baseclass.driver;
@FindBy(css ="input[type='text']")
WebElement usrnm;

@FindBy(name = "password")
WebElement pwd;

@FindBy(css = "input.btn_action")
WebElement btn;

@FindBy(xpath = "//h3[@data-test='error']") 
WebElement failerror;
	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginsucess(String Usrnm, String Pwd) {
		usrnm.sendKeys(Usrnm);
		pwd.sendKeys(Pwd);
		btn.click();	
	}
	
	public void LoginFailure(String Expmsg) {
		String Actualmsg = failerror.getText();
		Assert.assertEquals(Expmsg, Actualmsg);
		System.out.println("The expected msg is :- "+ Expmsg);
		System.out.println("The actual msg is :- "+ Actualmsg);
	}
	public void LockedUser(String lockerror) {
		String actuallockmsg = failerror.getText();
		Assert.assertEquals(lockerror,actuallockmsg);
		System.out.println("The expected msg is :- "+ lockerror);
		System.out.println("The actual msg is :- "+ actuallockmsg);
	}
	
}
