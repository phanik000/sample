package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import utils.Orep;

@SuppressWarnings("unused")
public class Login {
	
	@FindBy(xpath=Orep.LoginpageUserName)
	public WebElement LoginpageUserName;
	
	public void EnterUserName() {
		LoginpageUserName.sendKeys(Orep.User);
	}
	
	@FindBy(xpath=Orep.LoginpagePassword)
	public WebElement LoginpagePassword;
	
	public void EnterPassword() {
		LoginpagePassword.sendKeys(Orep.Password);
	}
	@FindBy(xpath=Orep.LoginpageButton)
	public WebElement LoginpageButton;
	//*******Will remove this comment*********//
	public void clickSignin() {
		LoginpageButton.click();
	}	
	
	
} 
