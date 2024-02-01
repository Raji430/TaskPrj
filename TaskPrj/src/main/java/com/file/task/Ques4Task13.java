package com.file.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques4Task13 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		
		Object[][] data = {
				
				{"EmployeeName","ID","Salary"},  // 1 array
				{"Jack",1,40000},   
				{"John",2,50000},
				{"Jessy",3,60000}			
		};
		
		int rowCount =0;
		
		for(Object[] row1 : data) {
			
			XSSFRow row = sheet.createRow(rowCount++);	
			
			int columnCount=0;
			
			for(Object col: row1) {
				
				XSSFCell cell = row.createCell(columnCount++);
				
				if(col instanceof String) {
					cell.setCellValue((String) col);
				} else if(col instanceof Integer) {
					cell.setCellValue((Integer) col);
				}
				
				
			}
		}
		
		try(
			FileOutputStream output= new FileOutputStream("C:\\Users\\rajie\\eclipse-workspace\\TaskPrj\\src\\main\\java\\com\\file\\task\\Ques4WriteData.xlsx");)
		{
			book.write(output);
			System.out.println("File created Successfully");
		}

	}

}
