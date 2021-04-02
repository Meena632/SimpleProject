Feature: FaceBook Login functionality
Scenario: To validate Login Functionality with invalid Username and Password
    Given User Launch the browser
    When User enters the username and password
    When User Clicks the login button 
    Then User validate the Login failure page