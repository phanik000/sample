package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CompanySetup;
import pages.LaunchPage;
import pages.Login;
import utils.BaseClass;
import utils.ExcelUtil;
import utils.Orep;

public class CompanySetupTest extends BaseClass {
	public Login lp;
	public LaunchPage launch;
	public CompanySetup setup;
	public ExcelUtil xl = new ExcelUtil();

	@Test(priority = 1)
	public void LoginTC() {
		iwait();
		driver.get(Orep.URL);
		maximize();
		lp = PageFactory.initElements(driver, Login.class);
		lp.EnterUserName();
		lp.EnterPassword();
		lp.clickSignin();

	}

	@Test(priority = 2)
	public void addDepartments() throws Exception {

		setup = PageFactory.initElements(driver, CompanySetup.class);
		Thread.sleep(2000);
		iwait();
		setup.companysetupclick.click();
		Thread.sleep(1000);
		setup.departmentsclick.click();
		//int a = xl.getCellCount(Orep.xlPath, "Departments", 1);
		int b = xl.getRowCount(Orep.xlPath, "Departments");
		for (int i = 1; i <= b; i++) {
			Thread.sleep(1000);
			setup.addnewdepartmentsclick.click();
			Thread.sleep(1000);
			String Dept = xl.getCellData(Orep.xlPath, "Departments", i, 0);
			System.out.println("Data from Excel :" + Dept);
			setup.enterDepartmentName(Dept);
			setup.saveDepartment();
		}

	}

	@Test(priority = 3)
	public void addHourCat() {
		iwait();
		driver.navigate().refresh();
		setup.companysetupStale.click();
		setup.HourCategory.click();
		setup.AddFromListButton.click();
		setup.SelectFromList.click();
		setup.SelectFromList.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		setup.AddButtonList.click();
	}

	@Test(priority = 4)
	public void additionalIncome() {
		iwait();
		driver.navigate().refresh();
		setup.companysetupStale.click();
		setup.AdditionalIncome.click();
		setup.AddFromListAddtlIncome.click();
		setup.EmptyClickAddtlIncome.click();
		setup.EmptyClickAddtlIncome.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		setup.AdditonalIncomeAddbtn.click();
	}

	@Test(priority = 5)
	public void deductionsSetup() throws Exception {
		iwait();
		driver.navigate().refresh();
		setup.companysetupStale.click();
		setup.OtherDeductions.click();
		setup.AddFromlistBtn.click();
		setup.EmptyClickOtherDeduc.click();
		setup.EmptyClickOtherDeduc.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		setup.AddButton.click();
	}
}
