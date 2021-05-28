package org.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestng {
	WebDriver driver;
	@Parameters({"username","password"})
	@Test(priority = 1)
	private void tc0(String s,String s1) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(s);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(s1);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();		
	}
	@Parameters({"Location","room_nos","CheckIn","CheckOut","adult_room"})
	@Test(priority = 2)
	 public void tc1(String s,String s3,String s4,String s5,String s6) {

		WebElement Location = driver.findElement(By.id("location"));
		Select l = new Select(Location);
l.selectByVisibleText(s);
WebElement room_nos = driver.findElement(By.id("room_nos"));
Select l3 = new Select(room_nos);
l3.selectByVisibleText(s3);
WebElement CheckIn = driver.findElement(By.id("datepick_in"));
CheckIn.sendKeys(s4);
WebElement CheckOut = driver.findElement(By.id("datepick_out"));
CheckOut.sendKeys(s5);
WebElement adult_room = driver.findElement(By.id("adult_room"));
Select l4 = new Select(adult_room);
l4.selectByVisibleText(s6);
WebElement btnSearch = driver.findElement(By.id("Submit"));
btnSearch.click();
}
	@Test(priority = 3)
	public void tc2() {
		WebElement SelectHotel = driver.findElement(By.id("radiobutton_3"));
		SelectHotel.click();
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();	
	}
	@Parameters({"FirstName","LastName","Address","ccNo","EXMonth","ExYear","CVV"})
    @Test(priority = 4)
    private void tc3(String s1,String s2,String s3,String s4,String s6,String s7,String s8) {
	WebElement FirstName = driver.findElement(By.id("first_name"));
	FirstName.sendKeys(s1);
	WebElement LastName = driver.findElement(By.id("last_name"));
	LastName.sendKeys(s2);
	WebElement Address = driver.findElement(By.id("address"));
	Address.sendKeys(s3);
	WebElement ccNo = driver.findElement(By.id("cc_num"));
	ccNo.sendKeys(s4);
	WebElement ccType = driver.findElement(By.id("cc_type"));
	Select k2 = new Select(ccType);
	k2.selectByVisibleText("VISA");
	WebElement EXMonth = driver.findElement(By.id("cc_exp_month"));
	Select k = new Select(EXMonth);
	k.selectByVisibleText(s6);
	WebElement ExYear = driver.findElement(By.id("cc_exp_year"));
	Select k1 = new Select(ExYear);
	k1.selectByVisibleText(s7);
	WebElement CVV = driver.findElement(By.id("cc_cvv"));
	CVV.sendKeys(s8);
	WebElement BookNo = driver.findElement(By.id("book_now"));
	BookNo.click();
	}

	
}























