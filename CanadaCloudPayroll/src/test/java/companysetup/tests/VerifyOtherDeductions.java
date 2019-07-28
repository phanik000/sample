package companysetup.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelUtil;

import companysetup.pages.OtherDeductions;

public class VerifyOtherDeductions extends BaseClass {
	public Select s;
	public String attributeid;
	public String radioclick="Fixed %";
	ExcelUtil excel = new ExcelUtil();
	List<WebElement> ele1;
	public String path = System.getProperty("user.dir") + readconfig.getExcelPath();

	public OtherDeductions deductions;
	String expectedtitle = "Checkmark Canada Cloud Payroll | Deductions";

	@Test(priority = 1)
	public void verifyOtherDeductionsAddFromList() throws Exception {
		test = report.startTest("Verify OtherDeductions Add From List Test");
		test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
		deductions = PageFactory.initElements(driver, OtherDeductions.class);
		deductions.CompanySetupClick.click();
		Thread.sleep(1000);
		deductions.OtherDeductionsClick.click();
		Assert.assertEquals(driver.getTitle(), expectedtitle);
		deductions.AddFromlistBtn.click();
		deductions.selectFromList();
		deductions.AddButton.click();
		deductions.PopupOK.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifyOtherDeductionsCreateNew() throws IOException, Exception {
		test = report.startTest("Verify OtherDeduction CreateNew Test");
		test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
		Thread.sleep(2000);
		deductions.CreateNewBtn.click();
		Thread.sleep(2000);
		String deducname = excel.getCellData(path, "Other Deductions", 1, 0);
		deductions.EnterOtherDeductionName.sendKeys(deducname);
		/*List<WebElement> ele = new ArrayList<WebElement>();
		ele.add(deductions.SelectFixedAmount);
		ele.add(deductions.SelectFixedPercent);
		ele.add(deductions.SelectVariableAmount);

		int size = ele.size();
		System.out.println("the size is: " + size);
		for (WebElement e : ele) {
			attributeid = e.getAttribute("id");
			System.out.println("attribute id are: " + attributeid);
			if (attributeid.contains("Fixed %")) {
				Thread.sleep(1000);
				e.click();
				System.out.println("Toggle Button is set to ON");
			Thread.sleep(3000);

			} else {
				System.out.println("Toggle Button is set to OFF");
			}
		}
		
		if (attributeid.isEmpty()) {
			deductions.EnterFixedAmountValue.sendKeys("200");
			Thread.sleep(2000);
			s = new Select(deductions.SelectPayPeriod);
			s.selectByIndex(1);
			System.out.println("Fixed Amount Values Entered");
			Thread.sleep(3000);

			System.out.println("values are in enabled mode");
		} else {
			System.out.println("values are in disabled mode");
		}
		if (attributeid.endsWith("%")) {
			deductions.EnterFixedPercentValue.sendKeys("10");
			Thread.sleep(2000);
			s = new Select(deductions.SelectTotalWages);
			s.selectByIndex(1);
			System.out.println("Fixed % Values entered");
			Thread.sleep(3000);
			System.out.println("values are in enabled mode");

		} 
*/
	String radiobtnclick=excel.getCellData(path, "Other Deductions", 1,1);
	String Fixedamountenter=excel.getCellData(path, "Other Deductions",1,2);
	String payperiodselect=excel.getCellData(path, "Other Deductions",1,3);
	String Fixedpercententer=excel.getCellData(path, "Other Deductions", 1, 4);
	String Fixedpercenttotalwagesselect=excel.getCellData(path, "Other Deductions", 1, 5);
	
	String limittypeselect=excel.getCellData(path, "Other Deductions", 1, 5);
	String limitamount=excel.getCellData(path, "Other Deductions", 1, 5);
	
	String employeematchselect=excel.getCellData(path, "Other Deductions", 1, 5);
	String employeematchamount=excel.getCellData(path, "Other Deductions", 1, 5);
	
		if(deductions.SelectVariableAmount.getAttribute("id").contains(radiobtnclick)) {
			deductions.SelectVariableAmount.click();
			System.out.println("vairiable amount checked");
		}
		else {
			System.out.println("vairiable amount unchecked");
		}
		
		if(deductions.SelectFixedAmount.getAttribute("id").contains(radiobtnclick)) {
			deductions.SelectFixedAmount.click();
			System.out.println("Fixed amount checked");
			deductions.EnterFixedAmountValue.sendKeys(Fixedamountenter);
			Thread.sleep(1000);
			s = new Select(deductions.SelectPayPeriod);
			s.selectByVisibleText(payperiodselect);
			System.out.println("Fixed Amount Values Entered");
			Thread.sleep(1000);
			s = new Select(deductions.SelectLimitType);
			s.selectByVisibleText(limittypeselect);
			deductions.EnterLimitTypeAmount.sendKeys(limitamount);
			
		}else {
			System.out.println("Fixed amount unchecked");

		}
		
		if(deductions.SelectFixedPercent.getAttribute("id").contains(radiobtnclick)) {
			deductions.SelectFixedPercent.click();
			System.out.println("Fixed percent checked");

			deductions.EnterFixedPercentValue.sendKeys(Fixedpercententer);
			Thread.sleep(2000);
			s = new Select(deductions.SelectTotalWages);
			s.selectByVisibleText(Fixedpercenttotalwagesselect);
			System.out.println("Fixed % Values entered");
			Thread.sleep(2000);
			System.out.println("values are in enabled mode");
			s = new Select(deductions.SelectLimitType);
			s.selectByVisibleText(limittypeselect);
			deductions.EnterLimitTypeAmount.sendKeys(limitamount);
			
		}else {
			
			System.out.println("Fixed percent unchecked");
		}
		
		
		
		
		
		
		
		
		
		
/*//7T7
		if (deductions.EnterFixedAmountValue.getAttribute("id").contains("7T7")) {
			
			  deductions.EnterFixedAmountValue.sendKeys("200"); Thread.sleep(2000); 
			  s=new Select(deductions.SelectPayPeriod);
			  s.selectByIndex(1);
			  System.out.println("Fixed Amount Values Entered");
			   Thread.sleep(3000);
			
			System.out.println("values are in enabled mode");
		}else {
			System.out.println("values are in disabled mode");
		}
//8T8		
		 if (deductions.EnterFixedPercentValue.getAttribute("id").contains("disabled")) {
			deductions.EnterFixedPercentValue.sendKeys("10");
			Thread.sleep(2000);
			s = new Select(deductions.SelectTotalWages);
			s.selectByIndex(1);
			System.out.println("Fixed % Values entered");
			Thread.sleep(3000);
			System.out.println("values are in enabled mode");

		}else {
			System.out.println("values are in disabled mode");

		}
*/		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//Deduct Before Check box Selection
		ele1 = new ArrayList<WebElement>();
		ele1.add(deductions.TaxDeductBeforecheckbox);
		ele1.add(deductions.EIDeductBeforecheckbox);
		ele1.add(deductions.CPPDeductBeforecheckbox);
		ele1.add(deductions.QPPDeductBeforecheckbox);
		ele1.add(deductions.QPIPDeductBeforecheckbox);
		
		int deductbeforesize=ele1.size();
		System.out.println("deduct before size is :"+deductbeforesize);
		for(int j=0;j<deductbeforesize;j++) {
	WebElement deductattribute=	ele1.get(j);
	String attribute=deductattribute.getAttribute("id");
	System.out.println("deduct before attribute text is: "+attribute);
		if(attribute.contains("QPP")) {
			deductattribute.click();
			Thread.sleep(3000);
			System.out.println("checked");

		}else {
			System.out.println("unchecked");

		}
	}
	}
}
