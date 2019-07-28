package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.LaunchPage;
import pages.Login;
import utils.BaseClass;
import utils.ExcelUtil;
import utils.Orep;

public class LaunchPageTest extends BaseClass {
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
	
	@Test(priority=2)
	public void getEmpTaxes() throws Exception {
		launch = PageFactory.initElements(driver, LaunchPage.class);
		iwait();
		launch.LaunchPagePaycycle.click();
		Thread.sleep(1000);
		launch.LaunchPageProcessPay.click();
		launch.checkboxPay();
		launch.LaunchPageProcessPaynextbutton.click();
		launch.LaunchPageTimesheetnextbutton.click();
		Select ele = new Select(launch.ProcessPayEmpList);
		List<WebElement> AllEmployees=ele.getOptions();
		int empSize=AllEmployees.size();
		for(int i=0;i<empSize;i++) {
			WebElement a=AllEmployees.get(i);
			a.click();
			String Ename=a.getText();
			xl.setCellData(Orep.xlPath, "Sheet1", i+1, 0 , Ename);
			Thread.sleep(2000);
			List<WebElement> merged = new ArrayList<WebElement>();
			merged.addAll(launch.ProcessPay_Taxes);
			merged.addAll(launch.Process_OtherDeduc);
			merged.addAll(launch.Process_AddtlInc);
			int listsize= merged.size();
			Thread.sleep(1000);
			for(int tax1=0;tax1<listsize;tax1++) {
				WebElement b=merged.get(tax1);
				try {
				String individualTax=b.getAttribute("value");
				if(individualTax.contains(""
						+ "")) {
					xl.setCellData(Orep.xlPath, "Sheet1", i+1, tax1+1 , "**NA**");
				}
				System.out.println("All the tax vals: "+individualTax);	
				xl.setCellData(Orep.xlPath, "Sheet1", i+1, tax1+1 , individualTax);
					
				} catch (Exception e) {
					System.err.println("Exception is "+e.getMessage());
				
				}
					}
				}
			}
			
	}







