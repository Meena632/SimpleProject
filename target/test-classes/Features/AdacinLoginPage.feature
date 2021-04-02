Feature: AdacinHotel Login Functionality
Scenario: To validate Login Functionality with valid username and invalid password
    Given User Launch the browser
    When User enters the username 
    When User enters the password
    When User clicks the login button
    Then User validate the Login failure page