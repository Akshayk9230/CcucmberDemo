package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.DriverSetUP;

public class HomePageSteps {
	WebDriver driver;
	LoginPage lp;
	@Given("I am on the HomePage after login")
	public void i_am_on_the_home_page_after_login() {
	 driver= DriverSetUP.driver;
	 driver.get("https://rahulshettyacademy.com/client/");
	 lp = new LoginPage(driver);
	 lp.login("testuser123@example.com", "Password@123");
	}

//	@Then("Check the buttons {string} are present")
//	public void check_the_buttons_home_are_present(String string) {
//	   HomePage hp=new HomePage(driver);
//	   if(string.equalsIgnoreCase("Home")) 
//	   {
//		   Assert.assertTrue(hp.verify_HomeButton());
//	   }
//	   else if(string.equalsIgnoreCase("Cart"))
//	   {
//		   Assert.assertTrue(hp.verify_CartButton());
//	   }
//	   else if(string.equalsIgnoreCase("Orders"))
//	   {
//		   Assert.assertTrue(hp.verify_OrdersButton());
//	   }
//	   else {
//		   System.out.println("please provide valid button values");
//		   Assert.assertTrue(false);
//	   }
//	   
//	}
	@Then("Check the buttons Home are present")
	public void check_the_buttons_home_are_present() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage hp=new HomePage(driver);
		 Assert.assertTrue(hp.verify_HomeButton());
	}

	@Then("Check the buttons Orders are present")
	public void check_the_buttons_orders_are_present() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.verify_OrdersButton());
		
	}

	@Then("Check the buttons Cart are present")
	public void check_the_buttons_cart_are_present() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.verify_CartButton());
	}


}
