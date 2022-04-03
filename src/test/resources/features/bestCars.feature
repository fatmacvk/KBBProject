Feature:Best Cars

  @regression
  Scenario: Verifying the best cars
    When I hover the 'CarReviews'
    And I click the best cars
    And I verify the first compact car
    And I verify the second compact car
    And I verify the third compact car

  Scenario: best convertible cars
    When I hover on 'CarReviews'
    And I click the best cars to see convertible cars
    And I verify the first convertible car
    And I verify the second convertible car
    And I verify the third convertible car

  Scenario: best fullsize cars

    When I hover on 'CarReviews' for fullsize car
    And I click the best cars to see fullsize cars
    And I verify the first best fullsize car
    And I verify the second fullsize car
    And I verify the third fullsize car