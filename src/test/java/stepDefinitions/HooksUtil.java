package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utils.DriverSetUP;

public class HooksUtil {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		DriverSetUP dp =new DriverSetUP();
		driver=dp.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@After
	public void tearDown() {
		driver.quit();
	}

}
