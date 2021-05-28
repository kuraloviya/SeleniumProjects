package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Sample{
	@Parameters("browser")
	@Test
	private void tc0(String s) {
		if(s.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		}else if (s.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");	
		}else {
			System.out.println("Invalid Browser");
		}
	
	}
	
	}


