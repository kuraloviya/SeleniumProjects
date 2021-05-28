package org.POM;

import org.base.BaseClassPOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginGreens extends BaseClassPOM {
	
	
	public LoginGreens() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className  ="blue_text")
	public WebElement ScrollDown;
	
	public WebElement getScrollDown() {
		return ScrollDown;
	}
	
}


