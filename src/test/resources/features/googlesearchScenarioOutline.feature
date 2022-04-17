@examples
Feature: Searching many data
  Scenario Outline: TC04_google search test
    Given User is in google page
    And User searches "<words>"
    Then User checks "<words>" i title

    Examples: Test data
    |words|
    |techproeducation|
    |selenium        |
    |webdriver       |