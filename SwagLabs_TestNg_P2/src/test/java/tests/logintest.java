package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.loginpage;
@Listeners(Listener.class)
public class logintest extends baseclass{
	
	@Test
	public void TC01_LoginSuccessTest() {
		loginpage lp = new loginpage();
		lp.loginsucess("standard_user","secret_sauce");
	}
	@Test
	public void TC02_LoginFailureTest() {
		loginpage lg = new loginpage();
		lg.loginsucess("standard_user", "asd@123");
		String msg = "Epic sadface: Username and password do not match any user in this service"; 
		lg.LoginFailure(msg);
	}
	@Test
	public void TC03_LockedUserTest() {
		loginpage lg = new loginpage();
		lg.loginsucess("locked_out_user","secret_sauce");
		String lock ="Epic sadface: Sorry, this user has been locked out.";
		lg.LockedUser(lock);
	}



}
