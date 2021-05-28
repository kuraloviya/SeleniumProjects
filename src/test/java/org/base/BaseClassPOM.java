package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassPOM {
	//Instance variable
  public static WebDriver driver;
 //1.Browser Launch
 public static void  getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
 //2.Launching URL
 public static void LaunchingUrl(String Url) {
	driver.get(Url);
}
//3.Enter value to text box
 public static void enterText(WebElement element,String data) {
element.sendKeys(data);
}
 //4.double click
 public void doubleclick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.doubleClick(element).perform();
}
//5.Right click-----context click
public void contextclick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.contextClick(element).perform();
}
//6.MoveToElement
public void moveToElement(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).perform();
}
//7.dragAnddrop
public void dragAnddrop(WebElement source,WebElement target) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(source, target).perform();
}
//8.KeyDown---KeyUp
public void KeyDown(WebElement element,String data) {
	Actions ac = new Actions(driver);
ac.keyDown(element,Keys.SHIFT).sendKeys(element,data ).keyUp(element, Keys.SHIFT).perform();
}
//9.getText
public void getText(WebElement element) {
element.getText();
}
//10.getAttribute(value)
public void getAttribute(WebElement element ,String value) {
element.getAttribute(value);
}
//11.button click
public void btnclick(WebElement element) {
	element.click();
}

//13.dropDown---selectbyValue
public void selectByValue(WebElement element,String data) {
	Select s = new Select(element);
	s.selectByValue(data);
}
//14.selectByVisibleText
public void selectByVisibleText(String txt, WebElement element) {
 Select s = new Select(element);
 s.selectByVisibleText(txt);
}
//15.dropDown---selectbyIndex
public void selectByIndex(WebElement element, int i) {
Select s= new Select(element);
s.selectByIndex(i);	
}
//16.Getting value from excel
public static String getValueFromExcel(String pathname,String SheetName,int rowNo,int cellNo) throws IOException {
	File f= new File(pathname);
	FileInputStream stream = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet(SheetName);
Row row = sheet.getRow(rowNo);
Cell cell = row.getCell(cellNo);
  int cellType = cell.getCellType();
String value="";
if (cellType==1) {
	value=cell.getStringCellValue();
}else if (DateUtil.isCellDateFormatted(cell)){
	Date dateCellValue = cell.getDateCellValue();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mmm-yyyy");
	 value = dateFormat.format(dateCellValue);
} else {
	double numericCellValue = cell.getNumericCellValue();
	long l = (long) numericCellValue;
value = String.valueOf(l);
}
return value;
}
//18--ScrollDown
public   void ScrollDown( String data,WebElement element)   {
	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].ScrollIntoView(data)",element );
}
//19.. Prompt Alerts
public  void alerts(String data) {
	Alert a = driver.switchTo().alert();
	a.sendKeys(data);
}
//20. Simple alert
public  void alerts() {
	Alert a = driver.switchTo().alert();
	a.accept();
}
//21. Alert Dismiss
public  void alert() {
	Alert a = driver.switchTo().alert();
	a.dismiss();
}




}






































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































