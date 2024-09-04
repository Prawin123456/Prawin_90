package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(xpath = "//a[@class='ico-login']")
	@CacheLookup
	WebElement Majortab_login;
	
	@FindBy(xpath = "//input[@type='text'and @autofocus='autofocus']")
	WebElement txt_Email;

	@FindBy(xpath = "//input[@class='password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement click_button;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logout;
	
	
	//constructor
    WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickMajorTab() {
		Majortab_login.click();
	}
	
	public void enterEmail(String Email) {
		txt_Email.sendKeys(Email);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clickLoginButton() {
		click_button.click();
	}
	public void checkIsDisplayed() {
		logout.isDisplayed();
	}
}
