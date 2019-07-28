package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilsReuse {
	public WebDriver driver;
	public JavascriptExecutor jse;
	public Alert alert;
    public Select s;
	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

	// To capture screenshot with unique name for failed test case

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	// user defined method created to check alert is present or not

	public boolean isAlertPresent() {
		try {
			alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			System.out.println("Alert text is: " + alertmsg);
			return true;
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is :" + e);
			return false;
		}

	}

	public void dropdownSelect(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);

	}

	// element to click using Java Script Executer
	public void javaScriptToClickElement(WebElement ele) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
	}

	// element to click using explicitly wait
	public void waitToClickElement(WebElement ele) {
		WebDriverWait date = new WebDriverWait(driver, 60);
		date.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

	// element to wait using thread concept
	public static void wait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
