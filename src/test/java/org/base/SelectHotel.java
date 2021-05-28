package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClassPOM {
	public SelectHotel() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_2")
	public WebElement btnSelect;
	@FindBy(id="continue")
public WebElement btnContinue;
	public WebElement getBtnSelect() {
		return btnSelect;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
}
