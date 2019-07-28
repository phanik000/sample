package companysetup.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import companysetup.pages.AdditionalIncome;

public class VerifyAdditionalIncome extends BaseClass {
	public AdditionalIncome add;
	String expectedtitle = "Checkmark Canada Cloud Payroll | Additional Income";
	public String radiobtn = "Fixed Amount";

	@Test(priority = 1)
	public void verifyAdditionalIncomeAddfromList() throws Exception {
		test = report.startTest("Verify Additional Income Add from List Test");
		test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
		add = PageFactory.initElements(driver, AdditionalIncome.class);
		add.CompanySetupClick.click();
		Thread.sleep(1000);
		add.AdditionalIncomeClick.click();
		Assert.assertEquals(driver.getTitle(), expectedtitle);
		add.AddFromListAddtlIncome.click();
		add.selectFromList();
		add.AdditonalIncomeAddbtn.click();
		add.ConfirmPopupBtn.click();

	}

	@Test(priority = 2)
	public void verifyToEditAddtionalIncome() throws Exception {
		elementToClickByWait(add.CreateNewAdditionalBtn);
		add.EnterCategoryTextCreate.sendKeys("add sample");
		if (add.VariableAmountClick.getAttribute("id").contains(radiobtn)) {
			add.VariableAmountClick.click();
			System.out.println("variable amount clicked");
		} else {
			System.out.println("variable amount unclicked");

		}
		if (add.FixedAmountClick.getAttribute("id").contains(radiobtn)) {
			elementOperations(add.FixedAmountClick, "click", " ");

			System.out.println("fixed amount clicked");
			Thread.sleep(2000);
			elementOperations(add.FixedAmountEnterText, "sendkeys", "10");
			util.dropdownSelect(add.FixedAmountSelectPeriod, "Pay Period");

		} else {
			System.out.println("fixed amount unclicked");

		}
		if (add.FixedPercentsalesClick.getAttribute("id").contains(radiobtn)) {
			add.FixedPercentsalesClick.click();
			System.out.println("fixed percent sales clicked");
			Thread.sleep(2000);
			add.FixedPercentofsalesEnterText.sendKeys("20");
		} else {
			System.out.println("fixed percent sales unclicked");

		}
		if (add.MileageClick.getAttribute("id").contains(radiobtn)) {
			add.MileageClick.click();
			System.out.println("mileage clicked");
			Thread.sleep(2000);
			add.MileageTextEnter.sendKeys("10");
		} else {
			System.out.println("mileage unclicked");

		}
		if (add.PieceworkClick.getAttribute("id").contains(radiobtn)) {
			add.PieceworkClick.click();
			System.out.println("piece of work clicked");
			Thread.sleep(2000);
			add.PieceworkTextEnter.sendKeys("5");
		} else {
			System.out.println("piece of work unclicked");

		}

		int taxsize = add.ExepmtFromTaxList.size();
		System.out.println("exempt from tax size is: " + taxsize);
		for (int i = 0; i < taxsize; i++) {
			WebElement taxele = add.ExepmtFromTaxList.get(i);
			String taxattributeid = taxele.getAttribute("id");
			if (taxattributeid.contains("EI")) {
				taxele.click();
				System.out.println("Exempt from tax checked");
			} else {
				System.out.println("Exempt from tax not_checked");

			}

		}

	}

}
