package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import utils.Orep;

public class CompanySetup {

	@FindBy(xpath = Orep.companysetupclick)
	@CacheLookup
	public WebElement companysetupclick;

	@FindBy(xpath = Orep.departmentsclick)
	@CacheLookup
	public WebElement departmentsclick;

	@FindBy(xpath = Orep.addnewdepartmentsclick)
	@CacheLookup
	public WebElement addnewdepartmentsclick;

	@FindBy(xpath = Orep.enterdepartmentName)
	@CacheLookup
	public WebElement enterdepartmentName;

	@FindBy(xpath = Orep.departmentsaveBtn)
	@CacheLookup
	public WebElement departmentsaveBtn;

	@FindBy(xpath = Orep.companysetupStale)
	public WebElement companysetupStale;

	public void enterDepartmentName(String deptname) {
		enterdepartmentName.sendKeys(deptname);
	}

	public void saveDepartment() {
		departmentsaveBtn.click();
	}

	@FindBy(xpath = Orep.HourCategory)
	@CacheLookup
	public WebElement HourCategory;

	@FindBy(xpath = Orep.AddFromListButton)
	@CacheLookup
	public WebElement AddFromListButton;

	@FindBy(xpath = Orep.SelectFromList)
	@CacheLookup
	public WebElement SelectFromList;

	@FindBy(xpath = Orep.AddButtonList)
	@CacheLookup
	public WebElement AddButtonList;

	@FindBy(xpath = Orep.AdditionalIncome)
	@CacheLookup
	public WebElement AdditionalIncome;

	@FindBy(xpath = Orep.AddFromListAddtlIncome)
	@CacheLookup
	public WebElement AddFromListAddtlIncome;

	@FindBy(xpath = Orep.EmptyClickAddtlIncome)
	@CacheLookup
	public WebElement EmptyClickAddtlIncome;

	@FindBy(xpath = Orep.AdditonalIncomeAddbtn)
	@CacheLookup
	public WebElement AdditonalIncomeAddbtn;

	@FindBy(xpath = Orep.OtherDeductions)
	@CacheLookup
	public WebElement OtherDeductions;

	@FindBy(xpath = Orep.AddFromlistBtn)
	@CacheLookup
	public WebElement AddFromlistBtn;

	@FindBy(xpath = Orep.EmptyClickOtherDeduc)
	@CacheLookup
	public WebElement EmptyClickOtherDeduc;

	@FindBy(xpath = Orep.AddButton)
	@CacheLookup
	public WebElement AddButton;

	// confirm pop-up
	@FindBy(xpath = Orep.PopupOK)
	@CacheLookup
	public WebElement PopupOK;
}
