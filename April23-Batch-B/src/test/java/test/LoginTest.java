package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoaginPage;                              //where we import this pacage name and class name

public class LoginTest extends BaseTest {
	//public WebDriver driver;
	SoftAssert sa;
	LoaginPage lp;
	
	@Test(priority=1)
	public void initObject() {
		lp=new LoaginPage(driver);
		sa=new SoftAssert();
	}
	@Test (priority=2)
	public void verifyButtonText() {
		sa.assertEquals(lp.buttonText(), "LOGINN");           //for capturing screenshot we fail that method
		sa.assertAll();
	}
	@Test(priority=3)
	public void login() {
		lp.enterCread("Admin","admin123");
		lp.submit();
	}
	@Test(priority=5)
   public void tearDown() {
    	driver.close();
   }
}
