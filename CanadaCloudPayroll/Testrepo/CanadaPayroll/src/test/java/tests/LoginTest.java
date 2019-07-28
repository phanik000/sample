package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LaunchPage;
import pages.Login;
import utils.BaseClass;
import utils.ExcelUtil;
import utils.Orep;

public class LoginTest extends BaseClass {
	public Login lp;
	public LaunchPage launch;
	public ExcelUtil xl= new ExcelUtil();
	@Test(priority=1)
	public void LoginTC() {
		iwait();
		driver.get(Orep.URL);
		maximize();
		lp=PageFactory.initElements(driver, Login.class);
		lp.EnterUserName();
		lp.EnterPassword();
		lp.clickSignin();
		
	}
	
	
	
	
	}
	
