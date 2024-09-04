package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class GoogleSearchSteps {
	
//	WebDriver driver=null;
//	@Given("browser is open")
//	public void browser_is_open() {
//	    System.out.println("inside step-browser is open");
//	   
//	    driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.get("https://www.google.co.in");
//	    
//	    
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() throws InterruptedException {
//		 System.out.println("inside step-user is on google search page");
//	  
//	   Thread.sleep(2000);
//	   
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		System.out.println("inside step-user enters a text in search box");
//		driver.findElement(By.name("q")).sendKeys("automation step by step");
//		Thread.sleep(2000);  
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//	    System.out.println("inside step-hits enter");
//	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	    Thread.sleep(2000);
//	}
//
//	@Then("user navigate to search results")
//	public void user_navigate_to_search_results() throws InterruptedException {
//	    System.out.println("inside step-user navigate to search results");
//        driver.getPageSource().contains("Online Courses");
//        Thread.sleep(2000);
//	}
//
//


//}
