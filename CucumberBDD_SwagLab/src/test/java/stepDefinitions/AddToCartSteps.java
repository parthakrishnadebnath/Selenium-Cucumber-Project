package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddToCart;

public class AddToCartSteps {
	
	public WebDriver driver;
	public AddToCart ac;
	
	@When("User open Edge browser")
    public void user_launched_edge_browser() {
        // Set the path to your msedgedriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\asus\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        // CRITICAL: Initialize the page object to avoid NullPointerException
        ac = new AddToCart(driver); 
    }

    @And("User opens url")
    public void user_opens_url() {
        driver.get("https://www.saucedemo.com/");
    }

    @And("User enter username and password and login")
    public void user_enter_username_and_password_and_login() {
        ac.enterUsername("standard_user");
        ac.enterPassword("secret_sauce");
        ac.clicklogin();
    
    }

    @And("Click Cart button")
    public void click_cart_button() {
        ac.AddToCart();
    }

    @And("Go to the cart link")
    public void go_to_the_cart_link() {
        ac.CartLink();
    }

    @Then("Add To cart page is displayed")
    public void add_to_cart_page_is_displayed() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com", url);
        driver.quit(); // Close browser after test
    }

}
