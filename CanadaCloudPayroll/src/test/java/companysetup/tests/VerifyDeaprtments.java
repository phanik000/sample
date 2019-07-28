package companysetup.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelUtil;

import companysetup.pages.Deaprtments;
import signin.pages.SignIn;

public class VerifyDeaprtments extends BaseClass {

	public Select s;
	public int size;
	public List<WebElement> deptlist;

	public Deaprtments dept;
	public SignIn sign;
	public ExcelUtil excel = new ExcelUtil();
	String expectedtitle = "Checkmark Canada Cloud Payroll | Departments";
	public String path = System.getProperty("user.dir") + readconfig.getExcelPath();

	@Test(priority = 1)
	public void verifyToAddDepartments() throws IOException, InterruptedException {
		try {
			test = report.startTest("Verify to addDepartments Test");
			test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());

			dept = PageFactory.initElements(driver, Deaprtments.class);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("arguments[0].click()", dept.CompanySetupClick);
			jse2.executeScript("arguments[0].click()", dept.DepartmentsClick);

			String dep = driver.getTitle();

			Assert.assertEquals(dep, expectedtitle);
			size = excel.getRowCount(path, "departments");
			System.out.println("the dept size is: " + size);
			System.out.println("the department title is: " + dep);
			for (int row = 1; row <= size; row++) {
				jse2.executeScript("arguments[0].click()", dept.addnewdepartmentsclick);
				Thread.sleep(1000);
				String deptname = excel.getCellData(path, "departments", row, 0);
				Thread.sleep(1000);
				dept.enterdepartmentName.sendKeys(deptname);
				Thread.sleep(1000);
				dept.departmentsaveBtn.click();
				Thread.sleep(2000);
			}
			dept.JobTitleCLick.click();
		} catch (Exception e) {
			System.out.println("add dept exception is: " + e);
		}
	}

	@Test(priority = 2, dataProvider = "addJobTitle")
	public void verifyToAddJobTitle(String deptname, String jobtitle) throws IOException, InterruptedException {

		try {
			test = report.startTest("Verify to AddJobTitle Test");
			test.log(LogStatus.INFO, "Test Started" + test.getStartedTime());
			Thread.sleep(2000);
			dept.addnewJobtitleclick.click();
			Thread.sleep(2000);
			s = new Select(dept.selectListOfDepartment);
			s.selectByVisibleText(deptname);
			Thread.sleep(2000);
			dept.jobTitleTextbox.sendKeys(jobtitle);
			Thread.sleep(2000);
			dept.jobTitleSaveBtn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("add jobtitle exception is: " + e);
		}

	}

		@DataProvider(name = "addJobTitle")

	public String[][] emPersonalInfo() throws Exception {
		int row = excel.getRowCount(path, "departments");
		int cel = excel.getCellCount(path, "departments", 1);
		String chequeDates[][] = new String[row][cel];

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < cel; j++) {
				chequeDates[i - 1][j] = excel.getCellData(path, "departments", i, j);
			}

		}
		return chequeDates;

	}

}
