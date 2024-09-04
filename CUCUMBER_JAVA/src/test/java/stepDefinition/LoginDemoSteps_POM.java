package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import pages.LoginPage;

//public class LoginDemoSteps_POM {
//	
//	WebDriver driver=null;
//	LoginPage login;
//	
//	@Given("Browser is open")
//	public void browser_is_open() {
//		
//		System.out.println("====I m inside LoginDemo===");
//		
//		System.out.println("inside step-browser is open");
//		driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//	  
//	    
//	}   
//
//	@And("user is on  login page")
//	public void user_is_able_to_login() {
//		driver.get("https://demowebshop.tricentis.com/");
//		
//	    
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_Email_and_password(String Email,String password) throws InterruptedException {
//		
//	    login=new LoginPage(driver);
//	    login.clickLoginButton();
//		login.enterUsername(Email);
//		login.enterPassword(password);
//	    Thread.sleep(2000);
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clicklogin();
//	}
//
//
//	@Then("user is navigated to homepage")
//	public void user_is_navigated_to_homepage() {
//	   login.checkLogoutIsDisplayed();
//	   driver.close();
//	   driver.quit();
//	}
//}
