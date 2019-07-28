package companysetup.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import companysetup.pages.HourCategories;
import signin.pages.SignIn;

public class VerifyHourCategories extends BaseClass {
	public SignIn sign;
	public HourCategories hourcategory;
	public String expectedtitle="Checkmark Canada Cloud Payroll | Hour Categories";
	@Test(priority=1)
	  public void verifySignIn() {
		try {
			test = report.startTest("Verify to signin Test");
			test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
			sign=PageFactory.initElements(driver, SignIn.class);
			sign.enterEmailID(userid);
			sign.enterPassword(pwd);
			sign.clickSigninBtn();
			String dashboardTitle = driver.getTitle();
			System.out.println("After signin page title is: "+dashboardTitle);
		} catch (Exception e) {
	System.out.println("verify signin exception is: "+e.getMessage());
		}

	}
	@Test(priority=2)
	public void verifyHourCategoryAddFromList() throws Exception {
		try {
		test = report.startTest("Verify verify Hour Category Add From List Test");
		test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
		hourcategory=PageFactory.initElements(driver, HourCategories.class);
		hourcategory.companySetupClick();
		hourcategory.clickHourCategory();
		Assert.assertEquals(driver.getTitle(), expectedtitle);
		Thread.sleep(5000);
		hourcategory.addFromListBtn();
		Thread.sleep(5000);
		hourcategory.selectFromList();
		Thread.sleep(5000);
		hourcategory.addList();
		Thread.sleep(5000);
		hourcategory.confirmbtnclick();
		hourcategory.confirmbtnclick();

		Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("verify hourcategory add from list exception is: "+e.getMessage());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
