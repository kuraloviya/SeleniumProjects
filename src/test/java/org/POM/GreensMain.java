package org.POM;

import org.base.BaseClassPOM;
import org.openqa.selenium.WebElement;

public class GreensMain extends BaseClassPOM {

public static void main(String[] args) throws InterruptedException {
	BaseClassPOM b = new BaseClassPOM();
	getDriver();
	LaunchingUrl("http://www.greenstechnologys.com/");
	LoginGreens Login = new LoginGreens();
	WebElement ScrollDown = Login.getScrollDown();
	b.ScrollDown("true" , ScrollDown);

}
	

}
