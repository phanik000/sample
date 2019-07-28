package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import utils.Orep;

public class LaunchPage  {
	@FindBy(xpath=Orep.LaunchPagePaycycle)
	@CacheLookup
	public WebElement LaunchPagePaycycle;
	
	
	@FindBy(xpath=Orep.LaunchPageProcessPay)
	@CacheLookup
	public WebElement LaunchPageProcessPay;
	
	@FindBy(xpath=Orep.LaunchPageProcessPaynextbutton)
	@CacheLookup
	public WebElement LaunchPageProcessPaynextbutton;

	@FindBy(xpath=Orep.LaunchPageTimesheetnextbutton)
	@CacheLookup
	public WebElement LaunchPageTimesheetnextbutton;
	
	
	@FindBy(xpath=Orep.Employee)
	@CacheLookup
	public WebElement Employee;
	
	public void selectEmployee() {
		Employee.click();
	}
	@FindBy(xpath=Orep.PayCheckbox)
	@CacheLookup
	public WebElement PayCheckbox;
	
	public void checkboxPay() {
		boolean b=PayCheckbox.isSelected();
		if(b==false) {
			PayCheckbox.click();
		}
	}
	//EI
	@FindBy(xpath=Orep.TAXEI)
	@CacheLookup
	public WebElement TAXEI;
	//TAXCPP
	@FindBy(xpath=Orep.TAXCPP)
	@CacheLookup
	public WebElement TAXCPP;
	//TAXQPP
	@FindBy(xpath=Orep.TAXQPP)
	@CacheLookup
	public WebElement TAXQPP;
	//TAXIT
	@FindBy(xpath=Orep.TAXIT)
	@CacheLookup
	public WebElement TAXIT;
	//TAXQTax
	@FindBy(xpath=Orep.TAXQTax)
	@CacheLookup
	public WebElement TAXQTax;
	//TAXQPIP
	@FindBy(xpath=Orep.TAXQPIP)
	@CacheLookup
	public WebElement TAXQPIP;
	
	public void TAXEI() throws InterruptedException {
		String eivalue=	TAXEI.getAttribute("value");
		System.out.println("TAXEI :"+eivalue);
		}
	public void TAXCPP() throws InterruptedException {
		Thread.sleep(2000);
		String eivalue=	TAXCPP.getAttribute("value");
		System.out.println("TAXCPP :"+eivalue);
		}
	public void TAXQPP() throws InterruptedException {
		String eivalue=	TAXQPP.getAttribute("value");
		System.out.println("TAXQPP :"+eivalue);
		}
	public void TAXIT() throws InterruptedException {
		String eivalue=	TAXIT.getAttribute("value");
		System.out.println("TAXIT :"+eivalue);
		}
	public void TAXQTax() throws InterruptedException {
		String eivalue=	TAXQTax.getAttribute("value");
		System.out.println("TAXQTax :"+eivalue);
		}
	public void TAXQPIP() throws InterruptedException {
		Thread.sleep(1000);
		String eivalue=	TAXQPIP.getAttribute("value");
		System.out.println("TAXQPIP :"+eivalue);
		}
	
	// *******EMPLOYEE EARNINGS*******//
	@FindBy(xpath=Orep.DashboardReports)
	public WebElement DashboardReports;
	
	@FindBy(xpath=Orep.EmployeeEarnings)
	public WebElement EmployeeEarnings;
	
	@FindBy(xpath=Orep.EmployeeSelect)
	public WebElement EmployeeSelect; 
	
	@FindBy(xpath=Orep.EarningsRegister)
	public WebElement EarningsRegister;
	
	@FindBy(xpath=Orep.ReportsChequeDateList)
	public WebElement ReportsChequeDateList;
	
	@FindBy(xpath=Orep.ReportsEmployeesList)
	public WebElement ReportsEmployeesList;
	
	@FindBy(xpath=Orep.ProcessPayEmpList)
	public WebElement ProcessPayEmpList;
	
	@FindBy(xpath=Orep.ProcessPay_Taxes)
	public List<WebElement> ProcessPay_Taxes;
	
	@FindBy(xpath=Orep.Process_OtherDeduc)
	public List<WebElement> Process_OtherDeduc;
	
	@FindBy(xpath=Orep.Process_AddtlInc)
	public List<WebElement> Process_AddtlInc;
	
	
	
}