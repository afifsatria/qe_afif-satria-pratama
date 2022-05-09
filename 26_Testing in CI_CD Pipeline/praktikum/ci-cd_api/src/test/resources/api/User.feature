Feature: User As an admin I want to see detail of resources and user So that I can manage resources and user

  Scenario: As a admin I have be able to get detail Resources - GET
    Given I set GET api endpoints Detail Resources
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for Detail Resources


  Scenario: As a admin I have be able to get detail User - GET
    Given I set GET api endpoints Detail User
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
