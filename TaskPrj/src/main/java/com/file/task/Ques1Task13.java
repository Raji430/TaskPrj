package com.file.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques1Task13 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook();		
				
		FileOutputStream file = new FileOutputStream("C:\\Users\\rajie\\eclipse-workspace\\TaskPrj\\src\\main\\java\\com\\file\\task\\Test.xlsx ");
		System.out.println("New file created successfully");
		book.write(file);
		
	}

}
