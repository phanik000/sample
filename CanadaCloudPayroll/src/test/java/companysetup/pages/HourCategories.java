package companysetup.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.utilities.UtilsReuse;

public class HourCategories extends BaseClass {
	public UtilsReuse util = new UtilsReuse();

	public HourCategories(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "(//*[@class='hasSubmenu'])[1]")
	@CacheLookup
	public WebElement companysetupclick;

	@FindBy(xpath = "//*[@href=\"/CanadaCloudPayroll/HourCategories\"]")
	@CacheLookup
	public WebElement hourcategoryClick;

	@FindBy(xpath = "//*[@id='btnHourAddFromList']")
	@CacheLookup
	public WebElement addfromlistBtn;

	@FindBy(xpath = "//*[@id='ListCategoryMaster']")
	@CacheLookup
	public WebElement selectfromlist;

	@FindBy(xpath = "//*[@id='LoadHourCatList']")
	@CacheLookup
	public WebElement addfromlist;

	@FindBy(xpath = "//*[@id='btnCreateNewHour']")
	@CacheLookup
	public WebElement createnewBtn;

	// enter hour category text
	@FindBy(xpath = "//*[@id='txtHourCatName']")
	@CacheLookup
	public WebElement enterHourcategorytext;

	// To enable save btn
	@FindBy(xpath = "//*[text()='Hour Category ']")
	@CacheLookup
	public WebElement Hourcategorytextclick;

	// Before save we have to ENTER using KEYS or CLICK ANY ELEMENT TO GET SAVE
	@FindBy(xpath = "//*[@id='updateHourCat']")
	@CacheLookup
	public WebElement saveHourcategorybtn;

	// select category from list to delete or edit
	@FindBy(xpath = "//*[@id='ListCategory']")
	@CacheLookup
	public WebElement selectcategorylist;

	// delete category
	@FindBy(xpath = "//*[@id='btnhourDelete']")
	@CacheLookup
	public WebElement deletecategory;
	
	
	
	
	
	//confirm pop-up
	@FindBy(xpath="//*[@class='confirm']")
	@CacheLookup
	public WebElement confirmBtn;

	public void companySetupClick() {
		companysetupclick.click();
	}

	public void clickHourCategory() {
		hourcategoryClick.click();

	}

	public void addFromListBtn() {
		addfromlistBtn.click();
	}

	public void selectFromList() {
selectfromlist.click();
selectfromlist.sendKeys(Keys.chord(Keys.CONTROL, "a"));


	}

	public void addList() {
		addfromlist.click();
	}

	public void confirmbtnclick() {
		confirmBtn.click();

	}
	public void createNewCategory() {
		createnewBtn.click();
	}

	public void enterHourCateggoryText(String text) {
		enterHourcategorytext.sendKeys(text);
	}

	public void HourCategory() {
		Hourcategorytextclick.click();
	}

	public void saveCategory() {
		saveHourcategorybtn.click();
	}

	public void selectCategoryList(String selectcategory) {
		util.dropdownSelect(selectcategorylist, selectcategory);

	}

	public void deleteCategory() {
		deletecategory.click();
	}

}
