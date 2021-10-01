package jenkinsCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
	WebDriver driver;
	
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";

	String baseUrl = "http://localhost:8081/dev/";
	
	@Given("I am testing")
	public void i_am_testing() {
		System.setProperty(chromeProp, chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	@Then("I am done testing")
	public void i_am_done_testing() {
		Assert.assertTrue(true);
	}
}
