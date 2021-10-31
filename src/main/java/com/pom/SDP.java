package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SDP {
public static WebDriver driver;

private Login L;
private Search_Hotel Sh;
private Select_Hotel SH;
private Book_Hotel bh;
private Order_page op;
private My_Itinerary mi;


public SDP(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
	
}
public static WebDriver getDriver() {
	return driver;
}
public Login getL() {
	L=new Login(driver);
	return L;
}
public Select_Hotel getSH() {
	SH=new Select_Hotel(driver);
	return SH;
}
public Search_Hotel getSh() {
	Sh=new Search_Hotel(driver);
	return Sh;
}
public Book_Hotel getBh() {
	bh=new Book_Hotel(driver);
	return bh;
}

public Order_page getOp() {
	op=new Order_page(driver);
	return op;
}

public My_Itinerary getMi() {
	mi=new My_Itinerary(driver);
	return mi;
}

}
