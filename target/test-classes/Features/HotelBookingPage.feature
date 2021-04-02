Feature: AdacinHotel Login Functionality
Scenario: To validate Login Functionality with valid username and invalid password
    Given User Launch the browser
    When User enters the username and password
    |userName|password|
    |Meenatchi|Ranju@91|
  
     And User clicks the login button
  

 Scenario: TC01-To validate Search hotel Functionality with required details
     When User select the location 
    And User select the hotel
    And User select the roomtype 
    And User select the no of rooms
#    And User select the Check In Date
#    And User select the Check Out Date
    And User select Adults per room
    And User click the search Button
    
    
    Scenario: TC02-To validate confirm booking Functionality with click radio button and continue button
    When User select the radiobutton
    And User click the continue button
    
    Scenario: TC03-To validate confirm booking Functionality with required data
    When User enters the firstname and lastname and address
    And User enters the credit card no
    And User select the card type
    And User select card expiry date
    And User enter the CVV number
    And user click the Booknow button
    Then User validate Booking failure page