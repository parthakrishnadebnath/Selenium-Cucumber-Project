package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

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
		ln=new Login();
 	    throw new io.cucumber.java.PendingException();
	}

	@When("User opens url {string}")
	public void user_opens_url(String string) {
		driver.get("https://www.saucedemo.com/");
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string, String string2) {
		ln.username();
		ln.password1();
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click login")
	public void click_login() {
        ln.login(); 
         throw new io.cucumber.java.PendingException();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
