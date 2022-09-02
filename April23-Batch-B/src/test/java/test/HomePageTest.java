package test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;

public class HomePageTest extends BaseTest{
	HomePage hp;
	SoftAssert sa;
	@BeforeTest
	public void objint() {
		hp=new HomePage(driver);
		sa=new 	SoftAssert();
		
		
	}
	@Test (priority=1)
	public void gotoTab() {
		hp.adminMenu();
		sa.assertFalse(true);                         //for capturing screenshot we fail that method
		sa.assertAll();
	}
	@Test (priority=2)
	public void logout() {
		hp.logout();
	}
        @Test (priority=3)
	public void verifyTitle() {
         System.out.println(driver.getTitle());
	}
      
	

}
