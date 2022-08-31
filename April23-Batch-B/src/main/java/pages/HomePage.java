package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//*[@class=oxd-text oxd-text--span oxd-main-menu-item--name]")
	private WebElement admin;
	@FindBy (xpath="//*[@class='oxd-sidepanel-body']//child::ul//li[@class='oxd-main-menu-item-wrapper']")
	private WebElement tabs;
	@FindBy (xpath="//*[@class='oxd-topbar-header']//child::ul//li//i")
	private WebElement header;
	@FindBy(xpath="//*[@class='oxd-topbar-header']//child::ul//li//a[text()='Logout']")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void adminMenu() {
		admin.click();
	}
	public void logout() {
		header.click();
		logoutlink.click();
	}

}
 