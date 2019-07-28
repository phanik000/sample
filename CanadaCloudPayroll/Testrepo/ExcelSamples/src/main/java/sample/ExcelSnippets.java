package sample;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.ExcelUtils;

public class ExcelSnippets extends ExcelUtils {

	public static void main(String[] args) throws IOException {
		
		String xlfile="C:\\\\Users\\\\User\\\\Desktop\\\\SampleExcel.xlsx";
		String xlsheet="Sheet1";
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.ebay.com/");
		//************************************************************************//
		WebElement drop=driver.findElement(By.xpath(".//*[@id='gh-cat']"));
		Select bylist = new Select(drop);
		List<WebElement> option=bylist.getOptions();
		int Cells=getCellCount(xlfile, xlsheet, 0);
		int Rows=getRowCount(xlfile, xlsheet);
		System.out.println("The row count is "+Rows+"|| The size of Cols is "+Cells);
			int ListSize=option.size();
			System.out.println("List size: "+ListSize);
			for(int i=1;i<Rows;i++){
			for(int j=0;j<ListSize;j++) {
				WebElement a =option.get(j);
				String category=a.getText();
				setCellData("C:\\Users\\User\\Desktop\\SampleExcel.xlsx", "Sheet1", i, j, category);
				System.out.println("Options are :"+category);
			}
			}
		driver.close();
		}
		
	}	

	
	
