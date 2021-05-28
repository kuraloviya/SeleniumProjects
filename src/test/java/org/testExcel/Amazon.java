package org.testExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws IOException {
	File f =new File("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx");
FileInputStream stream =new FileInputStream(f);
Workbook book = new XSSFWorkbook(stream);	
Sheet sheet = book.createSheet("Amazon product");  ///here create sheet.... should come.. because there is no amazon sheet
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone mobile phone",Keys.ENTER);
List<WebElement> productNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for (int i = 0; i <productNames.size(); i++) {
	WebElement webElement = productNames.get(i);
	String text = webElement.getText();
	Row createRow = sheet.createRow(i);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue(text);
	System.out.println(text);
}
FileOutputStream stream2 = new FileOutputStream(f);
book.write(stream2);
System.out.println("done!!!!!!");
driver.close();







}
}
