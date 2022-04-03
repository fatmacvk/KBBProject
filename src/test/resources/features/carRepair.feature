Feature:Car Repair

  Background: chrome testing

  @regression
  Scenario Outline: Verifying the carRepair

    Given user hoover over CarRepair to click "<Submenus>"
#    Then "Submenu" is displayed successfully
   Examples:
     |Submenus|
     |Auto Repair Prices|
     |Car Recalls|
     |Mainte|
#      |  Find an Auto Shop|
#      |  Service & Repair Guide|
#      |  OBD-II Codes|

