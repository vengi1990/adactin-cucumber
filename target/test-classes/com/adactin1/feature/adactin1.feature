Feature: Hotel Booking Application In Adactin Website 
#Background:

@smokeTest	
Scenario: Login Page 
	Given user Launches Adactin Url 
	When user Enter "vengi1990" In Username Field 
	And user Enter  "vengat@17" In Password Field 
	Then user Click Login Button And Navigate To Search Hotel Page 


@sanityTest
Scenario: Search Hotel Page 

	When user Select Location In Dropdown LIst 
	And user Select Hotel In Dropdown LIst 
	And user Select Room Type In Dropdown LIst 
	And user Select Room No In Dropdown LIst 
	And user Enter Check In Date In Check In Field 
	And user Enter Check Out Date In Check Out Field 
	And user Select Adult Room In Dropdown LIst 
	And user Select Children Per Room In Dropdown LIst 
	Then user Click Search Hotel Button And Navigate To Select Hotel Page 
@sanityTest	
Scenario: Select Hotel Page 

	When user Select The Radio Button for Select Hotel 
	Then user Click Continue and Navigate to Book Hotel Page 
@sanityTest	
Scenario: Book Hotel Page 

	When user Enter Firstname In Firstname Field 
	And user Enter Lastname In Lastname Field 
	And user Enter Billing Address In Billing Address Field 
	And user Select Credit Card No in Dropdown LIst 
	And user Select Expiry Month in Expiry Month Dropdown Field 
	And user Select Expiry Year in Expiry Year Dropdown Field 
	And user Enter Cvv No in Cvv Field 
	Then user Click the Book Now Button And Navigate to Order Page 
@sanityTest	
Scenario: Order Page 

	Then user Click My Itinerary Button And Navigate To My Itinerary Page 
@regressionTest	
Scenario: My Itinerary Page 

	When user Click The Checkbox from The Booked Hotel List 
	And user Click The Cancel Button To Cancel T he Booking 
	Then user Click The Logout Button and Navigate to Logout. 
	
	
	
	
      