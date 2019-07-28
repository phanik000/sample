package companysetup.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.baseclass.BaseClass;
import com.utilities.ObjectRepository;

public class OtherDeductions extends BaseClass {
	

	@FindBy(xpath = ObjectRepository.CompanySetupClick)
	@CacheLookup
	public WebElement CompanySetupClick;

	@FindBy(xpath = ObjectRepository.OtherDeductionsClick)
	@CacheLookup
	public WebElement OtherDeductionsClick;

	@FindBy(xpath = ObjectRepository.AddFromlistBtn)
	@CacheLookup
	public WebElement AddFromlistBtn;

	@FindBy(xpath = ObjectRepository.SelectAllfromlist)
	@CacheLookup
	public WebElement SelectAllfromlist;

	@FindBy(xpath = ObjectRepository.AddButton)
	@CacheLookup
	public WebElement AddButton;

	// confirm pop-up
	@FindBy(xpath = ObjectRepository.PopupOK)
	@CacheLookup
	public WebElement PopupOK;

	// CreateNew
	@FindBy(xpath = ObjectRepository.CreateNewBtn)
	@CacheLookup
	public WebElement CreateNewBtn;

	@FindBy(xpath = ObjectRepository.EnterOtherDeductionName)
	@CacheLookup
	public WebElement EnterOtherDeductionName;
	
	
	
	@FindBy(xpath = ObjectRepository.SelectVariableAmount)
	@CacheLookup
	public WebElement SelectVariableAmount;
	@FindBy(xpath = ObjectRepository.SelectFixedAmount)
	@CacheLookup
	public WebElement SelectFixedAmount;
	@FindBy(xpath = ObjectRepository.EnterFixedAmountValue)
	@CacheLookup
	public WebElement EnterFixedAmountValue;
	@FindBy(xpath = ObjectRepository.SelectPayPeriod)
	@CacheLookup
	public WebElement SelectPayPeriod;
	@FindBy(xpath = ObjectRepository.SelectFixedPercent)
	@CacheLookup
	public WebElement SelectFixedPercent;
	@FindBy(xpath = ObjectRepository.EnterFixedPercentValue)
	@CacheLookup
	public WebElement EnterFixedPercentValue;
	@FindBy(xpath = ObjectRepository.SelectTotalWages)
	@CacheLookup
	public WebElement SelectTotalWages;
	
	//Deduct Before check boxes
	@FindBy(xpath = ObjectRepository.TaxDeductBeforecheckbox)
	@CacheLookup
	public WebElement TaxDeductBeforecheckbox;
	@FindBy(xpath = ObjectRepository.EIDeductBeforecheckbox)
	@CacheLookup
	public WebElement EIDeductBeforecheckbox;
	@FindBy(xpath = ObjectRepository.CPPDeductBeforecheckbox)
	@CacheLookup
	public WebElement CPPDeductBeforecheckbox;
	@FindBy(xpath = ObjectRepository.QPPDeductBeforecheckbox)
	@CacheLookup
	public WebElement QPPDeductBeforecheckbox;
	@FindBy(xpath = ObjectRepository.QPIPDeductBeforecheckbox)
	@CacheLookup
	public WebElement QPIPDeductBeforecheckbox;
	
	
	
	
	
	
	@FindBy(xpath = ObjectRepository.SelectLimitType)
	@CacheLookup
	public WebElement SelectLimitType;
	@FindBy(xpath = ObjectRepository.EnterLimitTypeAmount)
	@CacheLookup
	public WebElement EnterLimitTypeAmount;
	@FindBy(xpath = ObjectRepository.SelectEmployeeMatchType)
	@CacheLookup
	public WebElement SelectEmployeeMatchType;
	@FindBy(xpath = ObjectRepository.EnterEmployeeMatchAmount)
	@CacheLookup
	public WebElement EnterEmployeeMatchAmount;
	@FindBy(xpath = ObjectRepository.SaveBtnOtherDeductionCreateNew)
	@CacheLookup
	public WebElement SaveBtnOtherDeductionCreateNew;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void selectFromList() {
		SelectAllfromlist.click();
		SelectAllfromlist.sendKeys(Keys.chord(Keys.CONTROL, "a"));

	}

}
