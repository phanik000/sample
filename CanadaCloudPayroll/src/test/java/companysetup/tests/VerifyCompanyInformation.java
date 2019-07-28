package companysetup.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import companysetup.pages.CompanyInformation;

public class VerifyCompanyInformation extends BaseClass {
	public CompanyInformation cmpnyinfo;
	public String expectedTitle="Checkmark Canada Cloud Payroll | Company Information";
	public String path = System.getProperty("user.dir")+readconfig.getExcelPath();

	@Test(priority = 1,dataProvider="companyinformation")
	public void verifyCompanyInformationWithValidCredentials(String cmpnyname,String tradename,String phneno,String add1,String add2,String city,String province,String postalcode,String fedAc,String pension) throws Exception {

		test = report.startTest("Verify to Company Information Test");
		test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());

		cmpnyinfo = PageFactory.initElements(driver, CompanyInformation.class);
		cmpnyinfo.CompanySetupClick.click();
		cmpnyinfo.CompanyInformationClick.click();
		Thread.sleep(1000);
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle, "Title Displayed");
		System.out.println("The title is: "+actualtitle);
		cmpnyinfo.CompanyName.clear();
		cmpnyinfo.CompanyName.sendKeys(cmpnyname);
		cmpnyinfo.TradeName.clear();
		cmpnyinfo.TradeName.sendKeys(tradename);
		cmpnyinfo.TradenameOnChequesAndReportsCheckbox.click();
		cmpnyinfo.PhoneNo.clear();
		cmpnyinfo.PhoneNo.sendKeys(phneno);
		cmpnyinfo.AddressLine1.clear();
		cmpnyinfo.AddressLine1.sendKeys(add1);
		cmpnyinfo.AddressLine2.clear();
		cmpnyinfo.AddressLine2.sendKeys(add2);
		cmpnyinfo.City.clear();
		cmpnyinfo.City.sendKeys(city);
		cmpnyinfo.PensionPlanregNo.clear();
		cmpnyinfo.PensionPlanregNo.sendKeys(pension);
		cmpnyinfo.CompanyInfoSaveBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
    @DataProvider(name = "companyinformation")
	public String[][] getMonthlyDates() throws Exception {
		int row = excel.getRowCount(path, "CompanyInformation");
		int cel = excel.getCellCount(path, "CompanyInformation", 1);
		String chequeDates[][] = new String[row][cel];

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < cel; j++) {
				chequeDates[i - 1][j] = excel.getCellData(path, "CompanyInformation", i, j);
				
			}
		}
		return chequeDates;

	}
	
	
	
	
	
	
	
}
