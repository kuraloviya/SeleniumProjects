package org.testExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class NewExcel {
	public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx");
	FileInputStream file = new FileInputStream(f);
	Workbook workbook = new XSSFWorkbook(file);
	Sheet createsheet = workbook.createSheet("Data");
	Row CreateRow=createsheet.createRow(1);
	Cell createCell = CreateRow.createCell(1);
	createCell.setCellValue("haiiii");
	FileOutputStream fileoutput = new FileOutputStream(f);
	workbook.write(fileoutput);
	System.out.println("Doneeee");
	
	
	
	}
}