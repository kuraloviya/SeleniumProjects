package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFaceBook {
	WebDriver driver;
//	@Test
//	public void tc0() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe" );
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement txtUser = driver.findElement(By.id("email"));
//		txtUser.sendKeys("haiJava");
//		String attribute = txtUser.getAttribute("value");
//		Assert.assertEquals(attribute,"haiJava" );
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		txtPass.sendKeys("password");
//		String attribute2 = txtPass.getAttribute("value");
//		Assert.assertEquals(attribute2, "pasword");
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		boolean enabled = btnLogin.isEnabled();
//	if (enabled) {
//		btnLogin.click();
//	}else {
//		System.out.println("button not enabled");
//	}
//  }
	
		@Test
		public void tc1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp world\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
