Feature:Best Cars

  Background: chrome testing

@regression
  Scenario: Verifying the best cars


    When I hover the 'CarReviews'
    And I click the best compact cars
    Then I list each best compact car
