package testRunner;


	
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	        features = ".//Feature/AddToCart.feature",
	        glue = {"stepDefinitions", "hooks"},
	        plugin = {
	                "pretty",
	                "html:target/cucumber-reports.html",
	                "json:target/cucumber-reports.json"
	        },
	        monochrome = true,
	        publish = true
	)
	public class AddToCartRun extends AbstractTestNGCucumberTests {
	

}
