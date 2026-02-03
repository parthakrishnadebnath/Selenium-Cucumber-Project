package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;

	@FindBy(xpath="//input[@id='user-name']")
	   private WebElement txtUsername;
	@FindBy(xpath="//input[@id='password']")
	   private WebElement txtPassword;
	@FindBy(xpath="//input[@id='login-button']")
	   private WebElement login;
	
	public Login(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this); 
    }
	
	
	public void enterUsername(String username) {
		txtUsername.sendKeys("standard_user");
	}
	public void enterPassword(String password) {
		txtPassword.sendKeys("secret_sauce");
	}
	public void login() {
		login.click();
	}
}
