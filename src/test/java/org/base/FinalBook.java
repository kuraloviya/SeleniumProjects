package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalBook extends BaseClassPOM {
	public FinalBook() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	public WebElement txtFirstName;
	@FindBy(id="last_name")
	public WebElement txtLastName;
	@FindBy(id="address")
	public WebElement txtAddress;
	@FindBy(id="cc_num")
	public WebElement txtccNumb;
	@FindBy(id="cc_type")
	public WebElement btnCCType;
	@FindBy(id="cc_exp_month")
	public WebElement btnExpMon ;
	@FindBy(id="cc_exp_year")
	public WebElement btnExpYear ;
	@FindBy(id="cc_cvv")
	public WebElement txtCVV ;
	@FindBy(id="book_now")
	public WebElement btnBook;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtccNumb() {
		return txtccNumb;
	}
	public WebElement getBtnCCType() {
		return btnCCType;
	}
	public WebElement getBtnExpMon() {
		return btnExpMon;
	}
	public WebElement getBtnExpYear() {
		return btnExpYear;
	}
	public WebElement getTxtCVV() {
		return txtCVV;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
}
