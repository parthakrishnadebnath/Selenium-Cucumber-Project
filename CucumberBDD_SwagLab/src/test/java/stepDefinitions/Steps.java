package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;

public class Steps {
	
	public WebDriver driver;
	public Login ln;
	
	@Given("User launched Edge browser")
	public void user_launched_edge_browser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\asus\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		ln= new Login(driver);
		
 	    
	}

	@When("User opens url {string}")
	public void user_opens_url(String string) {
		driver.get("https://www.saucedemo.com/");
	    
	}

	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String uname, String pwd) {
		
		ln.enterUsername(uname);
		ln.enterPassword(pwd);
	    
	}

	@When("Click login")
	public void click_login() {
        ln.login(); 
         
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Swag Labs");
		
	}

}
