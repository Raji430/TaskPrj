package com.file.task;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques5Task13 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\rajie\\eclipse-workspace\\TaskPrj\\src\\main\\java\\com\\file\\task\\Ques4WriteData.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data= new String[rowCount][columnCount];
		
		// Get into row
		
		for(int i=0;i<rowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
		// Get into cell
			
			for(int j=0;j<columnCount;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				//read the data from excel
				
				//data[i-1][j] = cell.getStringCellValue(); 				
							
				if(cell.getCellType()==CellType.STRING) {

					System.out.print(cell.getStringCellValue()+ "\t");

					}else

					System.out.print(cell.getNumericCellValue() + "\t");

					}	
			System.out.println();
			}		
		
		book.close();

	}

}
