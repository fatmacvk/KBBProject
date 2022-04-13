Feature:CarValues

@carTag
Scenario: Verifying the Price New/Used Model

When user hover over CarValue
And user click the Price NewOrUsed
And user click my Cars Value
And user click InstantCashOffer

  @carTag
  Scenario: Verifying the Price New or Used Model

    When user hover over CarValue
    And user click the Price NewOrUsed
    And user select the year for a vehicle
    And user select the model for a vehicle
    And user select the make for a vehicle
    And user enter zip code for a vehicle
    And user click next button
    Then user verify the selected car