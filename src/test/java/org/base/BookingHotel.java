package org.base;

import org.openqa.selenium.WebElement;

public class BookingHotel extends BaseClassPOM {
	public static void main(String[] args) {
		BaseClassPOM bc = new BaseClassPOM();
		bc.getDriver();
		bc.LaunchingUrl("http://adactinhotelapp.com/");
		Loginpage login = new Loginpage();
		//UserName
		WebElement txtuser = login.getTxtuser();
		enterText(txtuser,"OviyaGautham");
		//Password
		WebElement txtPass = login.getTxtPass();
		enterText(txtPass,"123456789");
		//Login
		WebElement btnLogin = login.getBtnLogin();
		bc.btnclick(btnLogin);
		Searchpage search = new Searchpage();
		WebElement btnLocation = search.getBtnLocation();
		bc.btnclick(btnLocation);
		bc.selectByIndex(btnLocation, 3);
		WebElement btnRooms = search.getBtnRooms();
		bc.btnclick(btnRooms);
		bc.selectByIndex(btnRooms, 5);
		WebElement checkin = search.getCheckin();
		checkin.clear();
		bc.enterText(checkin,"24/04/2021");
		WebElement checkOut = search.getCheckOut();
		checkOut.clear();
		bc.enterText(checkOut,"29/04/2021");
		WebElement btnAdult = search.getBtnAdult();
		bc.btnclick(btnAdult);
		bc.selectByIndex(btnAdult, 3);
		WebElement btnSearch = search.getBtnSearch();
		bc.btnclick(btnSearch);
		SelectHotel Select = new SelectHotel();
		WebElement btnSelect = Select.getBtnSelect();
		bc.btnclick(btnSelect);
		WebElement btnContinue = Select.getBtnContinue();
		bc.btnclick(btnContinue);
		FinalBook Final = new FinalBook();
		WebElement txtFirstName = Final.getTxtFirstName();
		bc.enterText(txtFirstName, "Kural");
		WebElement txtLastName = Final.getTxtLastName();
		bc.enterText(txtLastName, "G");
		WebElement txtAddress = Final.getTxtAddress();
		bc.enterText(txtAddress, "Lalgudi,Trichy");
		WebElement txtccNumb = Final.getTxtccNumb();
		bc.enterText(txtccNumb,"1234567891231456");
		WebElement btnCCType = Final.getBtnCCType();
		bc.btnclick(btnCCType);
		bc.selectByIndex(btnCCType, 2);
		WebElement btnExpMon = Final.getBtnExpMon();
		bc.btnclick(btnExpMon);
		bc.selectByIndex(btnExpMon, 4);
		WebElement btnExpYear = Final.getBtnExpYear();
		bc.btnclick(btnExpYear);
		bc.selectByIndex(btnExpYear, 11);
		WebElement txtCVV = Final.getTxtCVV();
		bc.enterText(txtCVV, "589");
		WebElement btnBook = Final.getBtnBook();
		bc.btnclick(btnBook);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
