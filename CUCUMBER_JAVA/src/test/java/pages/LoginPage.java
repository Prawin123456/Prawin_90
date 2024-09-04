package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	private By login_majortab=By.xpath("//a[@class='ico-login']");
	private By username_email=By.xpath("//input[@type='text'and @autofocus='autofocus']");
	private By password_pass=By.xpath("//input[@class='password']");
	private By login_button=By.xpath("//input[@class='button-1 login-button']");
	private By logout=By.xpath("//a[@class='ico-logout']"); 
	
	public LoginPage(WebDriver driver) {   //contructor
		this.driver=driver;
		
		if(driver.getTitle().equals("demo web shop")) {
			throw new IllegalStateException("this is not login page.The current page is"+driver.getCurrentUrl());
		}
		
	}
	public void clickLoginButton() {
		driver.findElement(login_majortab).click();
	}
	
	public void enterUsername(String Email) {
		driver.findElement(username_email).sendKeys(Email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(password_pass).sendKeys(password);
		
	}
	
	
	public void clicklogin() {
		driver.findElement(login_button).click();
		
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(logout).isDisplayed();
	}
	
	public void loginValidUser(String Email,String password) {
		driver.findElement(username_email).sendKeys(Email);
		driver.findElement(password_pass).sendKeys(password);
		driver.findElement(login_button).click();

	}

	
	

	
}
