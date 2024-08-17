package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.homepage;
import pages.loginpage;
@Listeners(Listener.class)
public class hometest extends baseclass {
	@Test
	public void Addtocart(){
		loginpage lg = new loginpage();
		homepage hp= new homepage();
		lg.loginsucess("standard_user", "secret_sauce");
		hp.carttest();		
	}
}
