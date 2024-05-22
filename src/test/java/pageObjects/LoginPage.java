package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.UtilityPage;

public class LoginPage extends UtilityPage{
	
	WebDriver driver;
	@FindBy(id="userEmail")
	WebElement email;
	@FindBy(id="userPassword")
	WebElement pwd;
	@FindBy(id="login")
	WebElement login;
	@FindBy(xpath="//div[@id='toast-container']")
	WebElement messageBlock;
	@FindBy(xpath="//div[@class='invalid-feedback']/div")
	WebElement invalidEmailMsg;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String userName,String password) {
		email.sendKeys(userName);
		pwd.sendKeys(password);
		login.click();
		return new HomePage(driver);
	}
	public boolean verify_homeButton() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(homeBtn));
		return homeBtn.isDisplayed();
	}
	public boolean verify_emailError(String string) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(invalidEmailMsg));
		boolean res=string.equals(invalidEmailMsg.getText()) ;
		return res;
	}
	public boolean verify_message(String string) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(messageBlock));
		boolean res=string.equals(messageBlock.getText());
		return res;
	}
}
