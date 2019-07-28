package signin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.baseclass.BaseClass;
import com.utilities.ObjectRepository;

public class SignIn extends BaseClass {
	
	public SignIn(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(xpath=ObjectRepository.LoginpageUserName)
	@CacheLookup
	public WebElement LoginpageUserName;

	@FindBy(xpath = ObjectRepository.LoginpagePassword)
	@CacheLookup
	public WebElement LoginpagePassword;

	@FindBy(xpath =ObjectRepository. LoginpageButton)
	@CacheLookup
	public WebElement LoginpageButton;

	
	
	public void enterEmailID(String emialid) {
		LoginpageUserName.sendKeys(emialid);
	}

	public void enterPassword(String pwd) {
		LoginpagePassword.sendKeys(pwd);
	}

	public void clickSigninBtn() {
		LoginpageButton.click();
	}

	
	
	
	
	
	
	
	
	
	
	
}
