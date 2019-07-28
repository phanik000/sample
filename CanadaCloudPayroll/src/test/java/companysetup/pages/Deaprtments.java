package companysetup.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.utilities.ObjectRepository;

public class Deaprtments extends BaseClass {
	public Select s;
	public List<WebElement> deptlist;

	// add departmnts
	@FindBy(xpath = ObjectRepository.CompanySetupClick)
	@CacheLookup
	public WebElement CompanySetupClick;

	@FindBy(xpath = ObjectRepository.DepartmentsClick)
	@CacheLookup
	public WebElement DepartmentsClick;

	@FindBy(xpath = ObjectRepository.addnewdepartmentsclick)
	@CacheLookup
	public WebElement addnewdepartmentsclick;

	@FindBy(xpath = ObjectRepository.enterdepartmentName)
	@CacheLookup
	public WebElement enterdepartmentName;

	@FindBy(xpath = ObjectRepository.departmentsaveBtn)
	@CacheLookup
	public WebElement departmentsaveBtn;

	// add jobtitle

	@FindBy(xpath = ObjectRepository.JobTitleCLick)
	@CacheLookup
	public WebElement JobTitleCLick;
	@FindBy(xpath = ObjectRepository.addnewJobtitleclick)
	@CacheLookup
	public WebElement addnewJobtitleclick;
	@FindBy(xpath = ObjectRepository.selectListOfDepartment)
	@CacheLookup
	public WebElement selectListOfDepartment;
	@FindBy(xpath = ObjectRepository.jobTitleTextbox)
	@CacheLookup
	public WebElement jobTitleTextbox;
	@FindBy(xpath = ObjectRepository.jobTitleSaveBtn)
	@CacheLookup
	public WebElement jobTitleSaveBtn;

	public void verifyToAddJobTitleDept(WebElement ele) {
	
		s = new Select(ele);
		
		deptlist = s.getOptions();
		int deptsize = deptlist.size();
		System.out.println("dept size is:"+deptsize);
		for(int i=0;i<deptsize;i++) {
		WebElement deptselect=	deptlist.get(i);
		s.selectByIndex(i);
		deptselect.click();
		String deptname = deptselect.getText();
		System.out.println("the selected dept name: " +deptname);

		
		
		}
			
			
		
		
		
	}

}
