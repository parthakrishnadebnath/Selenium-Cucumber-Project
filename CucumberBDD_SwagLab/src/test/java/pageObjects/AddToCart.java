package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;

	@FindBy(xpath="//input[@id='user-name']")
	   private WebElement txtUsername;
	@FindBy(xpath="//input[@id='password']")
	   private WebElement txtPassword;
	@FindBy(xpath="//input[@id='login-button']")
	   private WebElement login;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	   private WebElement btnAddToCart;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	   private WebElement btnCartLink;
	
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this); 
    }
	
	
	public void enterUsername(String username) {
		txtUsername.sendKeys("standard_user");
	}
	public void enterPassword(String password) {
		txtPassword.sendKeys("secret_sauce");
	}
	public void clicklogin() {
		login.click();
	}
	public void AddToCart() {
		btnAddToCart.click();
	}
	public void CartLink() {
		btnCartLink.click();
	}
}
