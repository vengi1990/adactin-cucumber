package com.Adactin;

import org.testng.annotations.Test;

import com.Baseclass.Base_Class;
import com.configuration.Helper;
import com.pom.SDP;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class NewTest extends Base_Class {
WebDriver driver;
SDP s=new SDP(driver);
  @BeforeMethod
  public void beforeMethod() throws Throwable {
      
		String url = Helper.getinstance().getinstanceCR().geturl();
		geturl(url);
		thread(4000);

  }
  
  @AfterMethod
  public void afterMethod() {
	  title();
  }

  @BeforeClass
  public void beforeClass() throws Throwable {
	  String browser = Helper.getinstance().getinstanceCR().getbrowser();
		browser_launch(browser);
  }
  @Test(priority = 1)
	private void login1() throws Throwable {
	
		inputvalue(s.getL().getUsername(), "vengi1990");
		inputvalue(s.getL().getPassword(), "vengat@17");
		thread(4000);
		click(s.getL().getLogin());
		

	}

	@Test(priority = 2)
	private void seachhotel() throws Throwable {
		byvalue(s.getSh().getLocation(), "Sydney");
		byvalue(s.getSh().getHotels(), "Hotel Hervey");
		byvalue(s.getSh().getRoom_type(), "Super Deluxe");
		byvalue(s.getSh().getRoom_nos(), "1");
		inputvalue(s.getSh().getDatepick_in(), "20/10/2021");
		inputvalue(s.getSh().getDatepick_out(), "21/10/2021");
		byvalue(s.getSh().getAdult_room(), "1");
		byvalue(s.getSh().getChild_room(), "0");
		thread(4000);
		click(s.getSh().getSubmit());
	}

	@Test(priority = 3)
	private void selecthotel() {
		click(s.getSH().getSelect());
		click(s.getSH().getContinue());
	}

	@Test(priority = 4)
	private void bookhotel() throws Throwable {
		inputvalue(s.getBh().getFirstname(), "Vengatesh");
		inputvalue(s.getBh().getLastname(), "Balu");
		thread(4000);
		String getaddress = Helper.getinstance().getinstanceCR().getaddress();
		inputvalue(s.getBh().getAddress(), getaddress);
		thread(4000);
		String card_no = Helper.getinstance().getinstanceCR().card_no();
		inputvalue(s.getBh().getCard_no(), card_no);
		thread(4000);
		byvalue(s.getBh().getCctype(), "VISA");
		byvalue(s.getBh().getExpmonth(), "2");
		byvalue(s.getBh().getExpyear(), "2022");
		thread(4000);
		String cvv = Helper.getinstance().getinstanceCR().cvv();
		inputvalue(s.getBh().getCcv(), cvv);
		thread(4000);
		click(s.getBh().getBooknow());
		thread(4000);
		screenshot();
		thread(4000);
	}

	@Test(priority = 5)
	private void getitinerary() throws Throwable {
		click(s.getMi().getSelect_check());
		thread(4000);
		click(s.getMi().getCancel());
		thread(4000);
		simple(s.getMi().getDriver());
		thread(4000);
		click(s.getMi().getLogout());

	}


  @AfterClass
  public void afterClass() {
		close();

  }
  

}
