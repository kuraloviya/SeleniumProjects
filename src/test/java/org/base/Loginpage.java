package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage extends BaseClassPOM {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	public WebElement txtuser;
	@FindBy(id="password")
	public WebElement txtPass;
	@FindBy(id="login")
	public WebElement btnLogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}

	
	













