package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUP {
	public static WebDriver driver;
	public WebDriver getDriver() throws Exception {
		File f =new File(System.getProperty("user.dir")+"\\src\\test\\java\\utils\\config.properties");
		Properties p = new Properties();
		p.load(new FileInputStream(f));

		String res=p.getProperty("browser");
		switch(res) {
		case "chrome": 
			driver=new ChromeDriver();
			return driver;

		case "edge": 
			driver =new EdgeDriver();
			return driver;

		case "firefox":
			driver=new FirefoxDriver();
			return driver;

		default: 
			System.out.println(" Please enter proper browser name");
			return null;
		}

	}
}
