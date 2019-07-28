package com.utilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExcelUtil {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	
	public int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	
	public int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	
	public String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public String setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) {
	try {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		if(row==null) {
		row=ws.createRow(rownum);
		}
		cell=row.getCell(colnum,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
		if(cell==null) {
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		}else {
			cell.setCellValue(data);
		}
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
		return data;
	}catch(Exception e) {
		System.out.println("The set data exception is"+e);
		return data;
		
	}
	}
	public String setMultipleValues(String xlfile,String xlsheet,int rowno,int colno,List<String> data) throws IOException  {
try {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		
		ws=wb.getSheet(xlsheet);
		for(int i=0;i<=row.getLastCellNum();i++) {
		row=ws.getRow(rowno);
		if(row==null) {
		row=ws.createRow(rowno);
		}
		cell=row.getCell(colno,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
		if(cell==null) {
		cell=row.createCell(colno);
		cell.setCellValue(data.toString());
		}else {
			cell.setCellValue(data.toString());
		}
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
		}
		}
	catch(Exception e) {
		System.out.println("The set data exception is"+e);
		
		
	}
	
		return xlsheet;
	
	}
	
	public void setListOfData(String xlfile,String xlsheet,WebElement empele,WebElement data1,List<WebElement> data2,List<WebElement> data3,List<WebElement> data4,List<WebElement> data5,WebElement data6) {
		Select s=new Select(empele); 
		List<WebElement> e=new ArrayList<WebElement>();

		List<WebElement>empselect=s.getOptions();
		int empsize=empselect.size();
		System.out.println("Employee size is: "+empsize);
		
		e.add(data1);
		e.addAll(data2);
		e.addAll(data3);
		e.addAll(data4);
		e.addAll(data5);
		e.add(data6);
        int calculatepayvaluesize=e.size();
        
		System.out.println("The calculate pay value size is: "+calculatepayvaluesize);
		try {
			for(int r=0;r<empsize;r++) {
				WebElement emp=empselect.get(r);
				emp.click();
				String empname=emp.getText();
				setCellData(xlfile, xlsheet, r+1, 0, empname);
			
			
			for(int cell=0;cell<calculatepayvaluesize;cell++) {
				WebElement calculatepayvalues=e.get(cell);
				if(calculatepayvalues.getText().isEmpty()) {
					String attributevaluedata=calculatepayvalues.getAttribute("value");
					System.out.println("The CalculatePay Attribute values are: "+attributevaluedata);
	                setCellData(xlfile, xlsheet, r+1, cell+1, attributevaluedata);

				}
				else {
				String textvaluedata=calculatepayvalues.getText();
				System.out.println("The CalculatePay Attribute values are: "+textvaluedata);
                setCellData(xlfile, xlsheet, r+1, cell+1, textvaluedata);

				}
			}
			
		}
			
		}
		catch(Exception ex) {
			System.out.println("the exception is: "+e);
		}
		
		
	}
	
	
}
