package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Adactin.Runner;
import com.Baseclass.Base_Class;
import com.configuration.Helper;
import com.pom.SDP;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Base_Class{
public static WebDriver driver=Runner.driver;
SDP s=new SDP(driver);
@Given("^user Launches Adactin Url$")
public void user_Launches_Adactin_Url() throws Throwable {
	String url = Helper.getinstance().getinstanceCR().geturl();
	geturl(url);
   
   thread(4000);
}
@When("^user Enter \"([^\"]*)\" In Username Field$")
public void user_Enter_In_Username_Field(String username) throws Throwable {
	inputvalue(s.getL().getUsername(), username);
}

@When("^user Enter  \"([^\"]*)\" In Password Field$")
public void user_Enter_In_Password_Field(String password) throws Throwable {

	inputvalue(s.getL().getPassword(), password);
	}




@Then("^user Click Login Button And Navigate To Search Hotel Page$")
public void user_Click_Login_Button_And_Navigate_To_Search_Hotel_Page() throws Throwable {
  click(s.getL().getLogin());
    
}

@When("^user Select Location In Dropdown LIst$")
public void user_Select_Location_In_Dropdown_LIst() throws Throwable {
	
	byvalue(s.getSh().getLocation(), "Sydney");
	
    
}

@When("^user Select Hotel In Dropdown LIst$")
public void user_Select_Hotel_In_Dropdown_LIst() throws Throwable {
  
	byvalue(s.getSh().getHotels(), "Hotel Hervey");
}

@When("^user Select Room Type In Dropdown LIst$")
public void user_Select_Room_Type_In_Dropdown_LIst() throws Throwable {
	byvalue(s.getSh().getRoom_type(), "Super Deluxe");
    
}

@When("^user Select Room No In Dropdown LIst$")
public void user_Select_Room_No_In_Dropdown_LIst() throws Throwable {
	byvalue(s.getSh().getRoom_nos(), "1");
    
}

@When("^user Enter Check In Date In Check In Field$")
public void user_Enter_Check_In_Date_In_Check_In_Field() throws Throwable {
  
	inputvalue(s.getSh().getDatepick_in(), "20/10/2021");
}

@When("^user Enter Check Out Date In Check Out Field$")
public void user_Enter_Check_Out_Date_In_Check_Out_Field() throws Throwable {
	inputvalue(s.getSh().getDatepick_out(), "21/10/2021");
    
}

@When("^user Select Adult Room In Dropdown LIst$")
public void user_Select_Adult_Room_In_Dropdown_LIst() throws Throwable {
	byvalue(s.getSh().getAdult_room(), "1");
    
}

@When("^user Select Children Per Room In Dropdown LIst$")
public void user_Select_Children_Per_Room_In_Dropdown_LIst() throws Throwable {
	byvalue(s.getSh().getChild_room(), "0");

	thread(4000);
}

@Then("^user Click Search Hotel Button And Navigate To Select Hotel Page$")
public void user_Click_Search_Hotel_Button_And_Navigate_To_Select_Hotel_Page() throws Throwable {
	click(s.getSh().getSubmit());
    
}

@When("^user Select The Radio Button for Select Hotel$")
public void user_Select_The_Radio_Button_for_Select_Hotel() throws Throwable {
  
	click(s.getSH().getSelect());
}

@Then("^user Click Continue and Navigate to Book Hotel Page$")
public void user_Click_Continue_and_Navigate_to_Book_Hotel_Page() throws Throwable {
	click(s.getSH().getContinue());
    
}

@When("^user Enter Firstname In Firstname Field$")
public void user_Enter_Firstname_In_Firstname_Field() throws Throwable {
	inputvalue(s.getBh().getFirstname(), "Vengatesh");
    
}

@When("^user Enter Lastname In Lastname Field$")
public void user_Enter_Lastname_In_Lastname_Field() throws Throwable {
  
	inputvalue(s.getBh().getLastname(), "Balu");
	thread(4000);
}

@When("^user Enter Billing Address In Billing Address Field$")
public void user_Enter_Billing_Address_In_Billing_Address_Field() throws Throwable {
	String getaddress = Helper.getinstance().getinstanceCR().getaddress();
	inputvalue(s.getBh().getAddress(), getaddress);
	thread(4000);
}

@When("^user Select Credit Card No in Dropdown LIst$")
public void user_Select_Credit_Card_No_in_Dropdown_LIst() throws Throwable {
	String card_no = Helper.getinstance().getinstanceCR().card_no();
	inputvalue(s.getBh().getCard_no(), card_no);
	thread(4000);
    
}

@When("^user Select Expiry Month in Expiry Month Dropdown Field$")
public void user_Select_Expiry_Month_in_Expiry_Month_Dropdown_Field() throws Throwable {
  
	byvalue(s.getBh().getCctype(), "VISA");
	byvalue(s.getBh().getExpmonth(), "2");
}

@When("^user Select Expiry Year in Expiry Year Dropdown Field$")
public void user_Select_Expiry_Year_in_Expiry_Year_Dropdown_Field() throws Throwable {
	byvalue(s.getBh().getExpyear(), "2022");
	thread(4000);
    
}

@When("^user Enter Cvv No in Cvv Field$")
public void user_Enter_Cvv_No_in_Cvv_Field() throws Throwable {
  
	String cvv = Helper.getinstance().getinstanceCR().cvv();
	inputvalue(s.getBh().getCcv(), cvv);
	thread(4000);
}

@Then("^user Click the Book Now Button And Navigate to Order Page$")
public void user_Click_the_Book_Now_Button_And_Navigate_to_Order_Page() throws Throwable {
	click(s.getBh().getBooknow());
	thread(4000);
	screenshot();
	thread(4000);
}

@Then("^user Click My Itinerary Button And Navigate To My Itinerary Page$")
public void user_Click_My_Itinerary_Button_And_Navigate_To_My_Itinerary_Page() throws Throwable {
  
	click(s.getOp().getItinerary());
}

@When("^user Click The Checkbox from The Booked Hotel List$")
public void user_Click_The_Checkbox_from_The_Booked_Hotel_List() throws Throwable {
	click(s.getMi().getSelect_check());
	thread(4000);
    
}

@When("^user Click The Cancel Button To Cancel T he Booking$")
public void user_Click_The_Cancel_Button_To_Cancel_T_he_Booking() throws Throwable {
  
	click(s.getMi().getCancel());
	thread(4000);
	simple(driver);
}

@Then("^user Click The Logout Button and Navigate to Logout\\.$")
public void user_Click_The_Logout_Button_and_Navigate_to_Logout() throws Throwable {
	click(s.getMi().getLogout());
    
}

}
