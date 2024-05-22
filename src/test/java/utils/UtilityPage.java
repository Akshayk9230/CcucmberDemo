package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UtilityPage {
	WebDriver driver;
	
	@FindBy(xpath="//button[contains(text(),'HOME')]")
	public WebElement homeBtn;
	@FindBy(xpath="//button[contains(text(),'ORDERS')]")
	public WebElement orders;
	@FindBy(xpath="(//button[contains(text(),'Cart')])[1]")
	public WebElement cart;

	public UtilityPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
