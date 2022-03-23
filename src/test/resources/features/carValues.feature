Feature:CarValues

  Background: chrome testing

  @smoke
  Scenario: Verifying the Price New/Used Model
    When I hover over CarValue
    And I click the Price NewOrUsed
    And user click CarsValue
    And user click InstantCashOffer