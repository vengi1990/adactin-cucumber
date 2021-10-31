package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Itinerary {
 public static WebDriver driver;
 

@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")
 private WebElement select_check;
 
 @FindBy(xpath="(//input[@type='submit'])[2]")
 private WebElement cancel;
 
 @FindBy(xpath="//a[text()='Logout']")
 private WebElement logout;
 



public My_Itinerary(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
 
 
 public static WebDriver getDriver() {
	return driver;
}

public WebElement getSelect_check() {
	return select_check;
}

public WebElement getCancel() {
	return cancel;
}

public WebElement getLogout() {
	return logout;
}

}
