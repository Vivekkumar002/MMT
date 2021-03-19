Feature: To check login Functionality of flipakrt

  Scenario Outline: 
    Given browser should open
    And user is on flipkart login page
    When user provide valid <username> and <password>
    And click on login button
    Then user navigates to home page of flipkart

    
    Examples:
    |username|password|
    |7052919090|Vivek@705291|