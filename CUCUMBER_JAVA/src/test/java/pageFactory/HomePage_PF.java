package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PF {
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement btn_logout;


	public void checkIsDisplayed() {
		// TODO Auto-generated method stub
		btn_logout.isDisplayed();
	}
}
