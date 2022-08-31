package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
@BeforeTest
public void init() {
	WebDriverManager.chromedriver().setup();            //webdrivermanager is dependency  and it will set chromedriver
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\selenium\\ChromeDriver\\chromedriver.exe");

		//step-1 launch browser
		 driver=new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//step-4 wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterTest
public void tearDown() {
	driver.close();
}
}
