Feature: Google search

  Background: User goes to the Google page
    Given User goes to the Google page
  @techproeducation
   Scenario: TC01_User search Techproeducation in google
    And User writes Techproeducation to search bar
    Then User checks title of search
  @seleniumsearch
    Scenario: TC02_User search Selenium in google
      And User writes Selemium in search bar
      Then User checks the number result of the title

