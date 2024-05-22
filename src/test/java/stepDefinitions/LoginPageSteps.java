package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;
import utils.DriverSetUP;

public class LoginPageSteps {
	WebDriver driver;
	LoginPage lp;
	@Given("I am on login page of the of application")
	public void i_am_on_login_page_of_the_of_application() throws Exception {
		driver=DriverSetUP.driver;
		driver.get("https://rahulshettyacademy.com/client/");
	}

	@When("I enter valid email {string} and password {string} and click on login button")
	public void i_enter_valid_email_and_password_and_click_on_login_button(String username, String password) {
		lp=new LoginPage(driver);
		lp.login(username, password);
	}

	@Then("I should be able to view the home button in home page")
	public void i_should_be_able_to_view_the_home_button_in_home_page() {
		boolean res=lp.verify_homeButton();
		Assert.assertEquals(true, res);
	}

	@When("I enter email {string} and wrong password {string} and click on login button")
	public void i_enter_email_and_wrong_password_and_click_on_login_button(String username, String password) {
		lp=new LoginPage(driver);
		lp.login(username, password);
	}

	@Then("I should not be able to login and a error message should be displayed stating {string}")
	public void i_should_not_be_able_to_login_and_a_error_message_should_be_displayed_stating(String string) {
		lp.verify_message(string);
	}

	@When("I enter invalid email format {string} and a password {string} and click on login button")
	public void i_enter_invalid_email_format_and_a_password_and_click_on_login_button(String username, String password) {
		lp=new LoginPage(driver);
		lp.login(username, password);
	}

	@Then("I should get a error message below the email input field stating {string}")
	public void i_should_get_a_error_message_below_the_email_input_field_stating(String string) {
		lp.verify_emailError(string);
	}

}
