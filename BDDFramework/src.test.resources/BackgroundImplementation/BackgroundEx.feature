Feature: Checking the background implementation

  Background: user on home page
    Given user opening the browser
    Then user navigating to google home page

  Scenario: Checking the results
   
    When user type "automation"
    And click on search
    Then user navigating to result

  Scenario: Checking the results
    
    When user type "javatpoint"
    And click on search
    Then user navigating to result
