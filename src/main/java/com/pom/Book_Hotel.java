package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
public static WebDriver driver;


@FindBy(id="first_name")
private WebElement firstname;

@FindBy(id="last_name")
private WebElement lastname;

@FindBy(id="cc_type")
private WebElement cctype;

@FindBy(id="cc_exp_month")
private WebElement Expmonth;

@FindBy(id="cc_exp_year")
private WebElement Expyear;

@FindBy(id="address")
private WebElement address;



@FindBy(id="cc_num")
private WebElement card_no;

@FindBy(id="cc_cvv")
private WebElement ccv; 
@FindBy(id="book_now")
private WebElement booknow;



public Book_Hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}


public static WebDriver getDriver() {
	return driver;
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getCctype() {
	return cctype;
}

public WebElement getExpmonth() {
	return Expmonth;
}

public WebElement getExpyear() {
	return Expyear;
}
public WebElement getAddress() {
	return address;
}


public WebElement getCard_no() {
	return card_no;
}


public WebElement getCcv() {
	return ccv;
}
public WebElement getBooknow() {
	return booknow;
}


}
