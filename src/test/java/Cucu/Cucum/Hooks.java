package Cucu.Cucum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	
	public static WebDriver driver;
	
	@Before
	public static void browserlaunch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rama\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
}
	@After
	public static void browserQuit() {
		driver.close();
	}
	
	
}