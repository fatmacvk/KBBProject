Feature:Car Repair

  Background: chrome testing

  @regression
  Scenario: Verifying the carRepair submenus

    Given user hoover over CarRepair
    And user click Auto Repair Prices
    And user click Car Recalls
    And user click Mainte
    And user click Find an Auto Shop
    And user click Service & Repair Guide
    And user click OBD-II Codes



  @regression
  Scenario: Verifying the Auto Repair menus

    Given user hoover over CarRepair
    When user click Auto Repair Prices
    And user select the year for a vehicle auto repair prices
    And user select the model for a vehicle auto repair prices
    And user select the make for a vehicle auto repair prices
    And user select the style for a vehicle auto repair prices
    And user click save button
    When user select a Service or Repair from the menu
    And user click See Price button
    Then user verify the Fair Repair Range for Auto Repair



