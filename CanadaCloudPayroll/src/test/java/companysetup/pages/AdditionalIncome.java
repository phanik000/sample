package companysetup.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.baseclass.BaseClass;
import com.utilities.ObjectRepository;

public class AdditionalIncome extends BaseClass{
	

@FindBy(xpath = ObjectRepository.CompanySetupClick)
@CacheLookup
public WebElement CompanySetupClick;

@FindBy(xpath=ObjectRepository.AdditionalIncomeClick)
@CacheLookup
public WebElement AdditionalIncomeClick;

@FindBy(xpath =ObjectRepository.AddFromListAddtlIncome)
@CacheLookup
public WebElement AddFromListAddtlIncome;


@FindBy(xpath =ObjectRepository.SelectFromlistAddtlIncome)
@CacheLookup
public WebElement SelectFromlistAddtlIncome;

@FindBy(xpath = ObjectRepository.AdditonalIncomeAddbtn)
@CacheLookup
public WebElement AdditonalIncomeAddbtn;

@FindBy(xpath=ObjectRepository.EditSelecedAdditionalBtn)
@CacheLookup
public WebElement EditSelecedAdditionalBtn;

@FindBy(xpath=ObjectRepository.CreateNewAdditionalBtn)
@CacheLookup
public WebElement CreateNewAdditionalBtn;

@FindBy(xpath=ObjectRepository.DeleteAdditionalBtn)
@CacheLookup
public WebElement DeleteAdditionalBtn;

@FindBy(xpath=ObjectRepository.CancelAdditionalBtn)
@CacheLookup
public WebElement CancelAdditionalBtn;

//calculation method for categories
@FindBy(xpath=ObjectRepository.EnterCategoryTextCreate)
@CacheLookup
public WebElement EnterCategoryTextCreate;


@FindBy(xpath=ObjectRepository.EnterCategoryTextEdit)
@CacheLookup
public WebElement EnterCategoryTextEdit;

@FindBy(xpath=ObjectRepository.VariableAmountClick)
@CacheLookup
public WebElement VariableAmountClick;


//fixed amount related elements
@FindBy(xpath=ObjectRepository.FixedAmountClick)
@CacheLookup
public WebElement FixedAmountClick;

@FindBy(xpath=ObjectRepository.FixedAmountEnterText)
@CacheLookup
public WebElement FixedAmountEnterText;

@FindBy(xpath=ObjectRepository.FixedAmountSelectPeriod)
@CacheLookup
public WebElement FixedAmountSelectPeriod;




//fixed percent of sales related elements
@FindBy(xpath=ObjectRepository.FixedPercentsalesClick)
@CacheLookup
public WebElement FixedPercentsalesClick;

@FindBy(xpath=ObjectRepository.FixedPercentofsalesEnterText)
@CacheLookup
public WebElement FixedPercentofsalesEnterText;


//mileage related elements

@FindBy(xpath=ObjectRepository.MileageClick)
@CacheLookup
public WebElement MileageClick;

@FindBy(xpath=ObjectRepository.MileageTextEnter)
@CacheLookup
public WebElement MileageTextEnter;



//piece of work related elements
@FindBy(xpath=ObjectRepository.PieceworkClick)
@CacheLookup
public WebElement PieceworkClick;

@FindBy(xpath=ObjectRepository.PieceworkTextEnter)
@CacheLookup
public WebElement PieceworkTextEnter;


//confirm pop-up
@FindBy(xpath=ObjectRepository.ConfirmPopupBtn)
@CacheLookup
public WebElement ConfirmPopupBtn;


//Exempt from

@FindBy(xpath=ObjectRepository.ExepmtFromTaxList)
@CacheLookup
public List<WebElement> ExepmtFromTaxList;


@FindBy(xpath=ObjectRepository.ExepmtFedTax)
@CacheLookup
public WebElement ExepmtFedTax;
@FindBy(xpath=ObjectRepository.ExepmtProvTax)
@CacheLookup
public WebElement ExepmtProvTax;
@FindBy(xpath=ObjectRepository.ExepmtEI)
@CacheLookup
public WebElement ExepmtEI;
@FindBy(xpath=ObjectRepository.ExepmtCPP)
@CacheLookup
public WebElement ExepmtCPP;
@FindBy(xpath=ObjectRepository.ExepmtQPP)
@CacheLookup
public WebElement ExepmtQPP;
@FindBy(xpath=ObjectRepository.ExepmtWSIB)
@CacheLookup
public WebElement ExepmtWSIB;
@FindBy(xpath=ObjectRepository.ExepmtEHT)
@CacheLookup
public WebElement ExepmtEHT;
@FindBy(xpath=ObjectRepository.ExepmtQPIP)
@CacheLookup
public WebElement ExepmtQPIP;
@FindBy(xpath=ObjectRepository.ExepmtOmitFromNet)
@CacheLookup
public WebElement ExepmtOmitFromNet;
@FindBy(xpath=ObjectRepository.ExepmtNonVacationable)
@CacheLookup
public WebElement ExepmtNonVacationable;
@FindBy(xpath=ObjectRepository.ExepmtIncludeInWages)
@CacheLookup
public WebElement ExepmtIncludeInWages;

@FindBy(xpath=ObjectRepository.CreateNewSaveBtn)
@CacheLookup
public WebElement CreateNewSaveBtn;













public void selectFromList() {
	SelectFromlistAddtlIncome.click();
    SelectFromlistAddtlIncome.sendKeys(Keys.chord(Keys.CONTROL, "a"));


}















}
