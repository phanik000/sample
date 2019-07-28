package companysetup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseclass.BaseClass;
import com.utilities.ObjectRepository;

public class CompanyInformation extends BaseClass {

@FindBy(xpath=ObjectRepository.CompanySetupClick)
public WebElement CompanySetupClick;

@FindBy(xpath=ObjectRepository.CompanyInformationClick)
public WebElement CompanyInformationClick;

@FindBy(xpath=ObjectRepository.CompanyInformationPageTitle)
public WebElement CompanyInformationPageTitle;

@FindBy(xpath=ObjectRepository.CompanyName)
public WebElement CompanyName;

@FindBy(xpath=ObjectRepository.TradeName)
public WebElement TradeName;

@FindBy(xpath=ObjectRepository.TradenameOnChequesAndReportsCheckbox)
public WebElement TradenameOnChequesAndReportsCheckbox;

@FindBy(xpath=ObjectRepository.PhoneNo)
public WebElement PhoneNo;
@FindBy(xpath=ObjectRepository.AddressLine1)
public WebElement AddressLine1;
@FindBy(xpath=ObjectRepository.AddressLine2)
public WebElement AddressLine2;
@FindBy(xpath=ObjectRepository.City)
public WebElement City;
@FindBy(xpath=ObjectRepository.Province)
public WebElement Province;
@FindBy(xpath=ObjectRepository.PostalCode)
public WebElement PostalCode;
@FindBy(xpath=ObjectRepository.FederalAc)
public WebElement FederalAc;
@FindBy(xpath=ObjectRepository.CompanyInfoSaveBtn)
public WebElement CompanyInfoSaveBtn;

@FindBy(xpath=ObjectRepository.CompanyInfoClearBtn)
public WebElement CompanyInfoClearBtn;

@FindBy(xpath=ObjectRepository.CompanyInfoCancelBtn)
public WebElement CompanyInfoCancelBtn;

@FindBy(xpath=ObjectRepository.PensionPlanregNo)
public WebElement PensionPlanregNo;



















}





























