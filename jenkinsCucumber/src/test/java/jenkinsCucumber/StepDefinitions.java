package jenkinsCucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
	WebDriver driver;
	
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";

	String baseUrl = "http://localhost:8081/dev/";
	@Before
	public void bfor() {
		System.setProperty(chromeProp, chromeDriverPath);
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		driver = new ChromeDriver(options);
		driver.get(baseUrl);
	}
	
	@Given("I am testing")
	public void i_am_testing() {
	}
	
	@Then("I am done testing")
	public void i_am_done_testing() {
		Assert.assertTrue(driver.findElements(By.className("testing")).size() > 0);
	}
	
	@After
	public void aftr() {
		driver.close();
	}
}
