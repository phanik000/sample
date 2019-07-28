package companysetup.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.baseclass.BaseClass;
import com.utilities.ObjectRepository;

public class LedgerAccounts extends BaseClass {


@FindBy(xpath = ObjectRepository.CompanySetupClick)
@CacheLookup
public WebElement CompanySetupClick;

@FindBy(xpath = ObjectRepository.LedgerAccountsClick)
@CacheLookup
public WebElement LedgerAccountsClick;

@FindBy(xpath = ObjectRepository.SelectPayrollCategoriesLedger)
@CacheLookup
public WebElement SelectPayrollCategoriesLedger;

@FindBy(xpath = ObjectRepository.EditActionBtnLedger)
@CacheLookup
public List<WebElement> EditActionBtnLedger;

@FindBy(xpath = ObjectRepository.EditActionBtnLedgerStale)
@CacheLookup
public List<WebElement> EditActionBtnLedgerStale;

@FindBy(xpath = ObjectRepository.SaveEditAccountNo)
@CacheLookup
public List<WebElement> SaveEditAccountNo;



@FindBy(xpath = ObjectRepository.EnterLedgerAccountNumbers)
@CacheLookup
public List<WebElement> EnterLedgerAccountNumbers;

@FindBy(xpath = ObjectRepository.EnterLedgerAccountNumbersStale)
@CacheLookup
public List<WebElement> EnterLedgerAccountNumbersStale;



@FindBy(xpath = ObjectRepository.SizeOfItems)
@CacheLookup
public WebElement SizeOfItems;





















}
