Feature: Login
  As a user
  I want to login
  So that I can access my homepage Bookstore

  Background:
    Given I am on the login page

  @Login
  Scenario Outline: Login scenario
    When I input "<username>" username
    And I input "<password>" password
    And click login button
    Then I get the "<result>"
    Examples:
      |username|password|result|
      |Hakim001|Valid@01|profile page|
      |Hakim001|Valid@02|login page|
      |Hakim002|Valid@01|login page|
      |Hakim002|Valid@02|login page|
      |Hakim001|        |field empty|
      |        |Valid@01|field empty|
      |        |        |field empty|


#  Scenario: As a user I have to be able to login in BooksStore
#    Given I am on the login page
#    When I input valid username
#    And I input valid password
#    And click login button
#    Then I go to profile page


#  Scenario: Failed login
#    Given I am on the login page
#    When I input protected username
#    And I input valid password
#    And click login button
#    Then error message "Epic sadface: Sorry, this user has been locked out."