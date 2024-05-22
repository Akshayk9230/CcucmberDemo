package pageObjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.UtilityPage;

public class HomePage extends UtilityPage {
WebDriver driver;

public HomePage(WebDriver driver) {
	super(driver);
	this.driver = driver;
}

public boolean verify_HomeButton() {
	return homeBtn.isDisplayed();
}
public boolean verify_OrdersButton() {
	return orders.isDisplayed();
}
public boolean verify_CartButton() {
	return cart.isDisplayed();
}

}
