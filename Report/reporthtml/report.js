$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin1.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking Application In Adactin Website",
  "description": "",
  "id": "hotel-booking-application-in-adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Background:"
    }
  ],
  "line": 5,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-application-in-adactin-website;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launches Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"vengi1990\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter  \"vengat@17\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click Login Button And Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_Launches_Adactin_Url()"
});
formatter.result({
  "duration": 8343072043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vengi1990",
      "offset": 12
    }
  ],
  "location": "Stepdef.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 3085814195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vengat@17",
      "offset": 13
    }
  ],
  "location": "Stepdef.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 532295113,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Click_Login_Button_And_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3590815833,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-application-in-adactin-website;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select Location In Dropdown LIst",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select Hotel In Dropdown LIst",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Room Type In Dropdown LIst",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select Room No In Dropdown LIst",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter Check In Date In Check In Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter Check Out Date In Check Out Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select Adult Room In Dropdown LIst",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select Children Per Room In Dropdown LIst",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click Search Hotel Button And Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_Select_Location_In_Dropdown_LIst()"
});
formatter.result({
  "duration": 1155663618,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Hotel_In_Dropdown_LIst()"
});
formatter.result({
  "duration": 193599136,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Room_Type_In_Dropdown_LIst()"
});
formatter.result({
  "duration": 194896218,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Room_No_In_Dropdown_LIst()"
});
formatter.result({
  "duration": 95097575,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Enter_Check_In_Date_In_Check_In_Field()"
});
formatter.result({
  "duration": 364712897,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Enter_Check_Out_Date_In_Check_Out_Field()"
});
formatter.result({
  "duration": 103152293,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Adult_Room_In_Dropdown_LIst()"
});
formatter.result({
  "duration": 123023464,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Children_Per_Room_In_Dropdown_LIst()"
});
formatter.result({
  "duration": 4098975138,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Click_Search_Hotel_Button_And_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2938691578,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-application-in-adactin-website;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user Select The Radio Button for Select Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user Click Continue and Navigate to Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_Select_The_Radio_Button_for_Select_Hotel()"
});
formatter.result({
  "duration": 104857463,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Click_Continue_and_Navigate_to_Book_Hotel_Page()"
});
formatter.result({
  "duration": 1577473572,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Book Hotel Page",
  "description": "",
  "id": "hotel-booking-application-in-adactin-website;book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Enter Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select Credit Card No in Dropdown LIst",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select Expiry Month in Expiry Month Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select Expiry Year in Expiry Year Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter Cvv No in Cvv Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click the Book Now Button And Navigate to Order Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_Enter_Firstname_In_Firstname_Field()"
});
formatter.result({
  "duration": 3016872828,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Enter_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 6046871900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Enter_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 4246747275,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Credit_Card_No_in_Dropdown_LIst()"
});
formatter.result({
  "duration": 4159163396,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Expiry_Month_in_Expiry_Month_Dropdown_Field()"
});
formatter.result({
  "duration": 297405835,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Select_Expiry_Year_in_Expiry_Year_Dropdown_Field()"
});
formatter.result({
  "duration": 4149585315,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Enter_Cvv_No_in_Cvv_Field()"
});
formatter.result({
  "duration": 4118341455,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_Click_the_Book_Now_Button_And_Navigate_to_Order_Page()"
});
formatter.result({
  "duration": 13034170850,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Order Page",
  "description": "",
  "id": "hotel-booking-application-in-adactin-website;order-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "user Click My Itinerary Button And Navigate To My Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_Click_My_Itinerary_Button_And_Navigate_To_My_Itinerary_Page()"
});
formatter.result({
  "duration": 1209494998,
  "status": "passed"
});
});