package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class LoginDemoSteps {
//	
//	WebDriver driver=null;
//	
//	@Given("Browser is open")
//	public void browser_is_open() {
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
//		driver.findElement(By.xpath("/a[@class='ico-login']")).click();
//		driver.findElement(By.id("Email")).sendKeys(Email);
//	    driver.findElement(By.id("Password")).sendKeys(password);
//	    Thread.sleep(2000);
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//
//	    
//	}
//
//
//	@Then("user is navigated to homepage")
//	public void user_is_navigated_to_homepage() {
//	   driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed();
//	   driver.close();
//	   driver.quit();
//	}
//}
