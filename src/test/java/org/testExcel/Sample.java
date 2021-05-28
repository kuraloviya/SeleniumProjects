package org.testExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Sample {
	public static void main(String[] args) throws  IOException {
		File f =new File("C:\\Users\\Hp world\\Desktop\\Selenium excel\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell =row.getCell(j);
			int type = cell.getCellType();
			if(type==1) {
				String string = cell.getStringCellValue();
				System.out.println(string);
			}
			if(type==0) {
				double d = cell.getNumericCellValue();
				long l=(long)d;
				String string = String.valueOf(l);
				System.out.println(string);
			}
		}
	}
	}
}