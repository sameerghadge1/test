package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoaginPage {
	//webelement

		@FindBy(id="txtUsername")
		private WebElement username;

		@FindBy(id="txtPassword")
		private WebElement password;

		@FindBy(id="btnLogin")
		private WebElement button;

		//constructor
		public LoaginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public String buttonText() {
			String text=button.getText();
			System.out.println(text);
			return text;
		}
		
		public void enterCread(String user,String pass) {
			username.sendKeys(user);
			password.sendKeys(pass);
		}
		public void submit() {
			button.click();
		}
}
