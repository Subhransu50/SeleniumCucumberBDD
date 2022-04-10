Feature: Search and Place the Order for Products

  Scenario Outline: Search Experience for product search in both Home and Offers Page
    Given User is on GreenCart landing page
    When Usersearched with shortname <Name> and extracted actual name of product
    Then User searched for <Name> shortname in offers page to check if product exists
    And perform validation in betweenlanding page and offer page result
    Examples:
    |Name|
    |Tom|
    |Beet|
    
    