package org.junit;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.base.BaseClassPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseJunit  extends BaseClassPOM{
	public static WebDriver driver;
	@BeforeClass
	public static void beforeClassMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://adactinhotelapp.com/");
	}
	@AfterClass
	public static  void afterClassMethod() {
driver.close();
	}
	@Before
	public  void beforeMethod() {
	Date date = new Date();
	System.out.println(date);
	}
	@After
	public void afterMethod() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs,new File("hotel.png"));
	Date date = new Date();
	System.out.println(date);
	}
	@Test
	//Login Page
	public void tc0() {
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("OviyaGautham");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@Test
	//Search Page
	public void tc1() {
		WebElement btnLocation = driver.findElement(By.id("location"));
		btnLocation.click();
		BaseClassPOM bc = new BaseClassPOM();
		bc.selectByIndex(btnLocation, 4);
		WebElement btnRooms = driver.findElement(By.id("room_nos"));
		btnRooms.click();
		bc.selectByIndex(btnRooms, 3);
		WebElement CheckIn = driver.findElement(By.id("datepick_in"));
		CheckIn.sendKeys("24/04/2021");
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.sendKeys("29/04/2021");
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
	public void tc3() {
		BaseClassPOM bc = new BaseClassPOM();
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
	txtFirstName.sendKeys("Kural");
	WebElement  txtLastName= driver.findElement(By.id("last_name"));
	txtLastName.sendKeys("G");
	WebElement txtAddress = driver.findElement(By.id("address"));
	txtAddress.sendKeys("Lalgudi,Trichy");
	WebElement txtccNumb = driver.findElement(By.id("cc_num"));
	txtccNumb.sendKeys("1234567891231456");
	WebElement btnCCType = driver.findElement(By.id("cc_type"));
	btnCCType.click();
	WebElement btnExpMon = driver.findElement(By.id("cc_exp_month"));
	btnExpMon.click();
	bc.selectByIndex(btnExpMon, 6);
	WebElement btnExpYear = driver.findElement(By.id("cc_exp_year"));
	btnExpYear.click();
	bc.selectByIndex(btnExpYear, 10);
	WebElement txtCVV = driver.findElement(By.id("cc_cvv"));
	txtCVV.sendKeys("524");
	WebElement btnBook = driver.findElement(By.id("book_now"));
	btnBook.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}