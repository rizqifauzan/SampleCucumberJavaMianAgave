Feature: Test Automation Web

  @web
  Scenario:Test Login Web Normal
    Given open web login page
    And user input Username "John Doe"
    And user input Password "ThisIsNotAPassword"
    And user click Login  button
    And the user will be redirected to the menu toggle

  @web
  Scenario:Test Login Web with username and password invalid
    Given open web login page
    And user input Username "John Doe"
    And user input Password "ThisIsNotAPassword12"
    And user click Login  button
    And the user will see login failed "Login failed! Please ensure the username and password are valid."

  @web
  Scenario:Test Boundaries of comment limit
    Given open web login page
    And user input Username "John Doe"
    And user input Password "ThisIsNotAPassword"
    And user click Login  button
    And the user will be redirected to the menu toggle
    And user fills in comment form "null"
