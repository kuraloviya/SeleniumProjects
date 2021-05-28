package org.junit;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.base.BaseClassPOM;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitExcel  extends BaseClassPOM{
	@BeforeClass
	public static void beforeClassMethod() {
	getDriver();	
	LaunchingUrl("http://adactinhotelapp.com/");	
	}
	@AfterClass
	public static  void afterClassMethod() {
    driver.close();
	}
//	@Before
//	public   void beforeMethod() {
//	Date date = new Date();
//	System.out.println(date);
//	}
	@After
	public  void afterMethod() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs,new File("Booking.png"));
//	Date date = new Date();
//	System.out.println(date);
	}
	@Test
	//Login Page
	public  void tc0() throws IOException {
	
		WebElement txtuser = driver.findElement(By.id("username"));
		String data=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 0);
        enterText(txtuser, data);
		WebElement txtpass = driver.findElement(By.id("password"));
		String data1=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 1);
		enterText(txtpass, data1);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnclick(btnLogin);
		}
	
	@Test
	//Search Page
	public void tc1() throws IOException {
		WebElement btnLocation = driver.findElement(By.id("location"));
		btnLocation.click();
		BaseClassPOM bc = new BaseClassPOM();
		bc.selectByIndex(btnLocation, 4);
		WebElement btnRooms = driver.findElement(By.id("room_nos"));
		btnRooms.click();
		bc.selectByIndex(btnRooms, 3);
		WebElement CheckIn = driver.findElement(By.id("datepick_in"));
		String data=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 3);
		enterText(CheckIn, data);
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		String data3=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 4);
		enterText(checkOut, data3);
		WebElement btnAdult = driver.findElement(By.id("adult_room"));
		btnAdult.click();
		bc.selectByIndex(btnAdult, 2);
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	}
	@Test
	//Select Hotel
	public void tc2() {
		WebElement btnSelect = driver.findElement(By.id("radiobutton_2"));
		btnSelect.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}
	@Test
	//Final Book
	public void tc3() throws IOException {
		BaseClassPOM bc = new BaseClassPOM();
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
	String data1=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 4);
	enterText(txtFirstName, data1);
	WebElement  txtLastName= driver.findElement(By.id("last_name"));
	String data2=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 5);
	enterText(txtLastName, data2);
	WebElement txtAddress = driver.findElement(By.id("address"));
	String data3=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 6);
enterText(txtAddress, data3);
	WebElement txtccNumb = driver.findElement(By.id("cc_num"));
	String data4=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 7);
	enterText(txtccNumb, data4);
	WebElement btnCCType = driver.findElement(By.id("cc_type"));
	btnCCType.click();
	WebElement btnExpMon = driver.findElement(By.id("cc_exp_month"));
	btnExpMon.click();
	bc.selectByIndex(btnExpMon, 6);
	WebElement btnExpYear = driver.findElement(By.id("cc_exp_year"));
	btnExpYear.click();
	bc.selectByIndex(btnExpYear, 10);
	WebElement txtCVV = driver.findElement(By.id("cc_cvv"));
	String data5=getValueFromExcel("C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\ExcelSheet\\Book1.xlsx", "Sheet1", 1, 8);
	enterText(txtCVV, data5);
	WebElement btnBook = driver.findElement(By.id("book_now"));
	btnBook.click();
	}
	
}
