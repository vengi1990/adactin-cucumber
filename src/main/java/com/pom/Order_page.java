package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_page {
public static WebDriver driver;

@FindBy(id="logout")
private WebElement logout;

@FindBy(id="my_itinerary")
private WebElement itinerary;

public WebElement getItinerary() {
	return itinerary;
}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getLogout() {
	return logout;
}
public Order_page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
}
}
