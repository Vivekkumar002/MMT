
Feature: to validate search functionality on flipkart
 
  Scenario Outline: 
    Given flipkart website has been launched
    And user have logged in with valid <username> and <password>
    When user click on search box
    And input <text> for desired product and hit enter
    Then it navigates to a page having desired product

    Examples:
    |username|password|text|
    |7052919090|Vivek@1|earphone|