package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddingEmployees;
import pages.Login;
import utils.BaseClass;
import utils.ExcelUtil;
import utils.Orep;

public class AddingEmployeesTest extends BaseClass {
	public AddingEmployees ae;
	public ExcelUtil xl = new ExcelUtil();
	
	@Test(priority=1)
	public void LoginTC() {
		iwait();
		driver.get(Orep.URL);
		maximize();
		lp = PageFactory.initElements(driver, Login.class);
		lp.EnterUserName();
		lp.EnterPassword();
		lp.clickSignin();

	}
	

	@Test(priority=2, dataProvider="EmployeeDataFromExcel")
	public void employeeCreation(String EmpFirstName,String EmpLastName,String EmpStreet,String EmpCity,String EmpProvince,String EmpSIN,String EmpDOB,String EmpPostalCode,String EmpSalPerPayPeriod,String PayFrequencyDropDown,String HourRate01,String EmpHireDate,String TaxesProvince,String IncomeDropDown,String OtherDeduction) throws Exception {
		ae= PageFactory.initElements(driver, AddingEmployees.class);
		ae.DashboardEmployeeSetup.click();
		Thread.sleep(1000);
		ae.CreateEmployee.click();
		iwait();
		ae.EmpFirstName.sendKeys(EmpFirstName);
		ae.EmpLastName.sendKeys(EmpLastName);
		ae.EmpStreet.sendKeys(EmpStreet);
		ae.EmpCity.sendKeys(EmpCity);
		selectFromDropDown(ae.EmpProvince, EmpProvince);
		ae.EmpSIN.sendKeys(EmpSIN);
		ae.EmpDOB.sendKeys(EmpDOB);
		ae.EmpPostalCode.sendKeys(EmpPostalCode);
		ae.EmpSaveButton.click();
		ae.Tab_Wages.click();
		ae.EmpSalPerPayPeriod.sendKeys(EmpSalPerPayPeriod);
		selectFromDropDown(ae.PayFrequencyDropDown, PayFrequencyDropDown);
		ae.HourRate01.sendKeys(HourRate01);
		ae.EmpHireDate.sendKeys(EmpHireDate);
		ae.Tab_Taxes.click();
		Thread.sleep(1000);
		selectFromDropDown(ae.TaxesProvince, TaxesProvince);
		ae.Tab_Income.click();
		Thread.sleep(1500);
		selectFromDropDown(ae.IncomeDropDown, IncomeDropDown);
		ae.AssignIncomeButton.click();
		Thread.sleep(1500);
		ae.OtherDeductionTab.click();
		Thread.sleep(1500);
		selectFromDropDown(ae.DropDownDeduction, OtherDeduction);
		ae.AssignDeduction.click();
		Thread.sleep(1500);
		ae.SaveButtonCommon.click();
		Thread.sleep(2000);

	}
	@DataProvider(name ="EmployeeDataFromExcel")
	
	  public String[][] emPersonalInfo() throws Exception {
		int row = xl.getRowCount(Orep.xlPath, "EmployeeData"); 
		int cel = xl.getCellCount(Orep.xlPath, "EmployeeData", 1); 
		String EmpData[][] =  new String[row][cel];
	  
	  for (int i = 1; i <= row; i++) {
		  for (int j = 0; j < cel; j++) {
			  EmpData[i - 1][j] = xl.getCellData(Orep.xlPath, "EmployeeData", i, j); 
	  }
		 
	  }
	  return EmpData;
	 
	  
	  }

}
