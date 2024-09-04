package stepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
	
	
	WebDriver driver=null;
	
	@Before(value="@smoke" , order=1)
	public void BrowserSetup() {
		System.out.println("  i am inside   ");
		System.setProperty("webDriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
		}
	
	@Before(order = 2)
	public void setup2() {
		System.out.println("i am insidesetup2 \n");
	}
	
	@After(order = 1)
	public void tearDown() {
		System.out.println("i am inside the teardown");
		driver.close();
		driver.quit();
	}
	
	@After(order = 2)
	public void tearDown2() {
		System.out.println("i am inside tearDown2 \n");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("i am inside before steps");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("i an outside steps");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	}
	@And("user Enter valid username and password")	
	public void user_Enter_valid_username_and_password() {
		
	}	

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	  
	}



}
