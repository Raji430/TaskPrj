package com.file.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques3Task13 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet(); 		
		
		Object[][] data= {
				{"Name","Age","Email"},
				{"John Doe",30,"john@test.com"},
				{"John Doe",28,"john@test.com"},
				{"Bob smith",35,"jacky@examle.com"},
				{"swapnil",37,"joe@example.com"}
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
			FileOutputStream output= new FileOutputStream("C:\\Users\\rajie\\eclipse-workspace\\TaskPrj\\src\\main\\java\\com\\file\\task\\Ques3WriteData.xlsx");)
		{
			book.write(output);
			System.out.println("File created Successfully");
		}

	}

}
