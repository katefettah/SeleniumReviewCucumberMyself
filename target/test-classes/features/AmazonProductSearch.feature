Feature: Amazon product search
  @AmazonProductSearch
  Scenario Outline: TC06_User search product in amamzon
    Given User is in "http://amazon.com"
    And User writes "<words>" in search bar
    Then User checks the number result
    Examples:
    |words     |
    |headphones|
    |tv        |
    |baby      |