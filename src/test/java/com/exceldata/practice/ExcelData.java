package com.exceldata.practice;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	@DataProvider (name="TN")
	
	public Object [][] dp() throws IOException {
		Object [] [] data = ExcelData.ExcelDataTN("TN");
		return data;
	}

	
	public static Object [][] ExcelDataTN(String sheetname) throws IOException {
		
		FileInputStream ip = new FileInputStream("C:\\Users\\parth\\eclipse-workspace\\Automation_practice\\src\\test\\java\\com\\exceldata\\practice\\Data.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook (ip);
	    XSSFSheet sheet = workbook.getSheet(sheetname);
	    int rows = sheet.getLastRowNum();
	    int cols = sheet.getRow(0).getLastCellNum();
	    Object [] [] data = new Object [rows][cols];// rows and cols used to define the size of the object [][] array
	    for (int i =0; i<rows; i++) { // getting row number 
	    	XSSFRow row = sheet.getRow(i+1); // value will be inputed in the object [][] array.
	    
	    for (int j=0;j<cols;j++) { // getting cell value of the particular row 
	    	XSSFCell cell = row.getCell(j);
	    	
	    	CellType celltype = cell.getCellType();
	    			switch (celltype) {
	    			case STRING :
	    			data[i][j]= cell.getStringCellValue();
	    			break;
	    			
	    			case NUMERIC :
	    			data[i][j] = Integer.toString((int)cell.getNumericCellValue());
	    			break;
	    				
	    }
	    }
	}
	    return data;
}
}
