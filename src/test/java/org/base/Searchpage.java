package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Searchpage extends BaseClassPOM {
	public Searchpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	public WebElement btnLocation;
	@FindBy(id="room_nos")
	public WebElement btnRooms;
	@FindBy(id="datepick_in")
	public WebElement checkin;
	@FindBy(id="datepick_out")
	public WebElement checkOut;
	@FindBy(id="adult_room")
	public WebElement btnAdult;
	@FindBy(id="Submit")
	public WebElement btnSearch;
	public WebElement getBtnLocation() {
		return btnLocation;
	}
	public WebElement getBtnRooms() {
		return btnRooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getBtnAdult() {
		return btnAdult;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
	}

