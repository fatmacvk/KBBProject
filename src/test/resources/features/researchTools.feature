Feature:research tools



  Scenario: Verifying the research tools


    When I hover on the research tools
    And I click the car finder
    And I click the compare cars
    And I click the vehicle history report in research tools
    And I click the car values
    And I click the car loans
    And I click the insurance
    And I click the check my credit
    And I click the extended warranty
    Then I click the recalls

  @tag
  Scenario: Verifying New Car Price Quote

    When I hover on the research tools
    And I click the car research
    And I select make to a new car
    And I select model the car
    And I select trim the car
    And I enter the zipcode
    When I click the findDealer button
    Then I verify the closest dealer

