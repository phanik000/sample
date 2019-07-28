package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pages.Login;

public class BaseClass {


	public static WebDriver driver=null;
	public Login lp;

	@BeforeClass
	@Parameters("Browser")
	public void browserSelect(String Browser) 
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("IE")) {
			driver= new InternetExplorerDriver();
		}


	}
	
	
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	//Implicit wait method
	public void iwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	public void selectFromDropDown(WebElement DropDownXpath,String VisibleTextofDropDown) {
		
		Select dropDown= new Select(DropDownXpath);
		dropDown.selectByVisibleText(VisibleTextofDropDown);
	}

	public void selectFromDropDown(WebElement DropDownXpath,int IndexofElement) {
		
		Select dropDown= new Select(DropDownXpath);
		dropDown.selectByIndex(IndexofElement);
	}
	
	@AfterClass

	public void tearDown() {
		driver.close();
	}



}


