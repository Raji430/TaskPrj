package com.file.task;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques2Task13 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook();		
				
		FileOutputStream file = new FileOutputStream("C:\\Users\\rajie\\eclipse-workspace\\TaskPrj\\src\\main\\java\\com\\file\\task\\Test1.xlsx ");
		System.out.println("New file created successfully");
		
		XSSFSheet sh = book.createSheet("Sheet1");
		System.out.println("New sheet created successfully");
		book.write(file);
		
	}

}
