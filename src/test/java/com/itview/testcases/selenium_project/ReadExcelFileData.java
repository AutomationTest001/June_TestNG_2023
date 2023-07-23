package com.itview.testcases.selenium_project;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileData {

	public static void main(String[] args) throws Exception{

		//File Excel -> Workbook - > Sheet - > Rows -> Cells -> Data
		
		DataFormatter df=new DataFormatter();

		FileInputStream fi = new FileInputStream(".\\TestData\\FDCal.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet sht=wb.getSheetAt(0);
		 int rowCount=sht.getLastRowNum();	 
		 System.out.println(rowCount);
		
		for(int i=1;i<=rowCount;i++) {
		
		XSSFRow row=sht.getRow(i);
		
		XSSFCell cell0=row.getCell(0);
		XSSFCell cell1=row.getCell(1);
		XSSFCell cell2=row.getCell(2);
		
		System.out.println(cell0+ " | "+cell1+" | "+cell2);
		
		
		}
		
		
		
	


	}

}
