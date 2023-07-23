package com.selenium.samplecode;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception{


		FileInputStream fi=new FileInputStream(".\\TestData\\FDCal.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet st=wb.getSheetAt(0);
		
		System.out.println(st.getRow(0).getCell(0));
		
	}

}
