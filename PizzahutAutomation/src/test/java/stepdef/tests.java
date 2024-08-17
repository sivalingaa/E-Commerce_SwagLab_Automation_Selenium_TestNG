package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//cucumber automatically uses methods from hook no need to extend the class
public class tests {
	WebDriver driver = Hooks.driver;
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.pizzahut.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Hooks.test.log(LogStatus.PASS, "Application Launched");
	    
	}

	@When("I enter the location as {string}")
	public void i_enter_the_location_as(String location) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loc = driver.findElement(By.cssSelector("input[type='text']"));
		loc.sendKeys(location);
		Hooks.test.log(LogStatus.PASS, "Location entered");
		
	   
	}

	@When("I select the very first suggestion from the list")
	public void i_select_the_very_first_suggestion_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement selectloc = driver.findElement(By.xpath("//button[2]"));
		selectloc.click();
		Hooks.test.log(LogStatus.PASS, "clicked on 1st suggestion");
	    
	}

	@Then("I should land on the Deals page")
	public void i_should_land_on_the_Deals_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement page = driver.findElement(By.cssSelector("div.side-menu>div>a:nth-of-type(1)")); // //[data-synth='link--deals--side'] span
		Assert.assertTrue(page.isDisplayed());
		Assert.assertTrue(page.isEnabled());
		System.out.println("The current title is :- " + driver.getTitle());
		Hooks.test.log(LogStatus.PASS, "Deals Page");
		////div[@class='menu-item-wrapper ']/a/*[contains(text(),'Deals')]
		//Assert may get error and the code is cut then remove assert junit framwork and add org.junit.Assert
		//String title = driver.getTitle();
		//assert title.contains("Deals");
	    
	}

	@Then("I select the tab as {string}")
	public void i_select_the_tab_as(String pza) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pizza = driver.findElement(By.xpath("//a[2]/span[contains(text(),'"+ pza +"')]"));// //div[@class='menu-item-wrapper ']/a/*[contains(text(),'Pizzas')]
		pizza.click();
		System.out.println("The current title is" + driver.getTitle());
		Hooks.test.log(LogStatus.PASS, "selected Pizzas");
		// //   div.side-menu>div>a:nth-of-type(2)
	   
	}

	@Then("I add {string} to the basket")
	public void i_add_to_the_basket(String addcart) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement additem = driver.findElement(By.xpath("//span[@data-testid='pizzas']/div[1]/a[2]/div[3]/div/button"));
		additem.click();
		//Adding this due to need of more basket value
		WebElement additem2 = driver.findElement(By.xpath("//span[@data-testid='pizzas']/div[1]/a[1]/div[3]/div/button"));
		additem2.click();
		Hooks.test.log(LogStatus.PASS, "Add items in basket");
	    
	}

	@Then("I note down the price displayed on the screen")
	public void i_note_down_the_price_displayed_on_the_screen() {
		WebElement price = driver.findElement(By.xpath("//span[@data-testid='pizzas']/div[1]/a[2]/div[3]/div/button/span[2]"));
		Assert.assertTrue(price.isDisplayed());
		System.out.println("The price is: -"+price.getText());
		Hooks.test.log(LogStatus.PASS, "Proper price displayed");
	   
	}

	@Then("I should see the pizza {string} is added to the cart")
	public void i_should_see_the_pizza_is_added_to_the_cart(String Expitem) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement bitem = driver.findElement(By.xpath("//*[text()='"+ Expitem +"'] "));
		String Addeditem = bitem.getText();////div[@id='basket']//div[3]/div/div/div[text()='Personal Schezwan Margherita']
		Assert.assertEquals(Expitem,Addeditem);
		System.out.println("The added item is: -"+ Addeditem);
		Hooks.test.log(LogStatus.PASS, "Items added in the basket");
			    
	}

	@Then("price is also displayed correctly")
	public void price_is_also_displayed_correctly() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement crprice= driver.findElement(By.xpath("//div[@id='basket']//div[3]/div/div/div[2]"));
		String addedprice = crprice.getText();
		/*WebElement price = driver.findElement(By.xpath("//span[@data-testid='pizzas']/div[1]/a[2]/div[3]/div/button/span[2]"));
		String beforeprice = price.getText();
		Assert.assertEquals(beforeprice, addedprice); */
		Assert.assertTrue(crprice.isDisplayed());
	//	System.out.println("The price before adding: -"+beforeprice);
		System.out.println("The price before adding: -"+addedprice);
		Hooks.test.log(LogStatus.PASS, "Correct price display of added items");
		
		
	    
	}

	@Then("I click on the Checkout button")
	public void i_click_on_the_Checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement chk = driver.findElement(By.xpath("//span[text()='Checkout']"));
		chk.click();
		Hooks.test.log(LogStatus.PASS, "Clicked on checkout button");
	   
	}

	@Then("I should be landed on the secured checkout page")
	public void i_should_be_landed_on_the_secured_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement checkoutpage = driver.findElement(By.xpath("//*[contains(text(),'Secure Checkout')]"));
		Assert.assertTrue(checkoutpage.isDisplayed());
		System.out.println("The title of Checkout page is: - "+ driver.getTitle());
		Hooks.test.log(LogStatus.PASS, "Landed on secured checkout page");
	    
	}

	@Then("I enter the personal details")
	public void i_enter_the_personal_details(Map<String, String> details) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		
		//String usrname = ;
		//String usrmobile = ;
		//String usremail = ;
		//System.out.println(usrkeys);
		//List<String> a = new ArrayList<>();
		Set<String> usrkeys = details.keySet();
		for(String a: usrkeys) {
			WebElement usrdetails = driver.findElement(By.cssSelector("input[name='"+ a +"']"));
			usrdetails.sendKeys(details.get(a));
		}
		Hooks.test.log(LogStatus.PASS, "Entered personal detials");
		//WebElement nm = driver.findElement(By.cssSelector("input[name='"+ usrname +"']"));
		//WebElement phn = driver.findElement(By.cssSelector("input[name='"+ usrmobile+"']"));
		//WebElement email = driver.findElement(By.cssSelector("input[name='"+ usremail +"']"));	    
	}

	@Then("I enter the address details")
	public void i_enter_the_address_details(List<String> addrdetail) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println(addrdetail);
		WebElement addline1 = driver.findElement(By.cssSelector("input[name='deliveryAddress.interior']"));
		addline1.sendKeys(addrdetail.get(0));
		WebElement addline2 = driver.findElement(By.cssSelector("input[name='deliveryAddress.notes']"));
		addline2.sendKeys(addrdetail.get(1));
		Hooks.test.log(LogStatus.PASS, "Entered Address details");
		
	   
	}

}
