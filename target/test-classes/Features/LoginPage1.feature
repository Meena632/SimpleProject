Feature: Validation of LoginPage in FaceBook 
Scenario: TC01- To validate Login Functionality with invalid Username and Password
    Given User Launch the browser
    When User enters the username and password
    And User Clicks the login button 
    Then User validate the Login failure page
    
    Scenario: TC02- To validate Login Functionality with invalid Username and Password
    Given User Launch the browser
    When User enters the username and password
    And User Clicks the login button 
    Then User validate the Login failure page
    
    Scenario Outline: scenario description
    	 Given User Launch the browser
    When User enters the"<userName>"and "<passWord>"
    And User Clicks the login button 
    Then User validate the Login failure page
    		
    		Examples:
    		|userName|passWord|
    		|greens|meenu123|
    		|selva|selva123|
    		