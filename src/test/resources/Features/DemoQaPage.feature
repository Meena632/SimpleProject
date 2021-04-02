Feature: ToolsQA Registration functionality
Scenario: To validate submit Functionality with invalid Name and address
    Given User Launch the browser
    When User enters the fullname and Email 
    When User enters the  current Address and permenant address 
    When User Clicks the submit button
   Then User validate the submit failure page