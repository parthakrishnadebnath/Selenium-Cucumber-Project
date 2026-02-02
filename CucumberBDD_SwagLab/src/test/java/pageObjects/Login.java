package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(xpath="//input[@id='user-name']")
	   private WebElement username;
	@FindBy(xpath="//input[@id='password']")
	   private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")
	   private WebElement login;
	
	public void username() {
		username.sendKeys("standard_user");
	}
	public void password1() {
		password.sendKeys("secret_sauce");
	}
	public void login() {
		login.click();
	}
}
