Feature: Search with parametre
  @webdriverSearch
  Scenario: TC03_User searches in the google page
    Given User is in google page
    And User searches "webdriver" word
    Then User checks the word "webdriver" in the search