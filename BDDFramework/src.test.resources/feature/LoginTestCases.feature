#Sample Feature Definition Template
Feature: Facebook login fu ctionality

  @Smoke
  Scenario Outline: valid with valid credentials
    Given User on login page
    When user enters usename as "username"
    And enters password as "password"
    And user click on signin
    Then close the browser

    Examples: 
      | username | pwd      |
      | sai      | sai      |

  #@Regression
  #Scenario Outline: Login Data driven
    #Given User on login page
    #When user enters usename as "username"
    #And enters password as "password"
    #And user click on signin
    #Then user logged in sucessfully
#
    #Examples: 
      #| username | pwd      |
      #| siva     | sai      |
      #
#
      #@Regression @Smoke
  #Scenario Outline: Login Data driven
    #Given User on login page
    #When user enters usename as "username"
    #And enters password as "password"
    #And user click on signin
    #Then user logged in sucessfully
#
    #Examples: 
      #| username | pwd      |
      #| siva     | sai      |
      #
      