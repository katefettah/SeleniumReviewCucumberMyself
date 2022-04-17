@addremove
Feature: Add Remove Elements
  Scenario: TC05_User gets new web element by cliking AddElements
    Given User is in "https://the-internet.herokuapp.com/add_remove_elements/"
    And User clicks Add Element
    Then User checks Delete web elemnet is displayed
