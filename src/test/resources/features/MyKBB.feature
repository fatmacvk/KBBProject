Feature:My KBB

  Background: chrome testing

  @smoke
  Scenario: Verifying My KBB login

    Given user click MyKBB icon
    When user click on Signin button
    And user enters valid email and password
    And user click Signin button to see its account
    Then user is successfully logged in



    @smoke
    Scenario Outline: Invalid Login and message validation
      Given user click MyKBB icon
      When user click on Signin button
      And user enters invalid "<Email>" and "<Password>"
      And user click Signin button to see its account
      Then user see "<ErrorMessage>"

      Examples:
      | Email| Password| ErrorMessage|
      |ummuhangenc14@gmail.co| MyKBBProject2022|Invalid Email|
#      |ummuhangenc14@gmail.com| MyKBBProject2022|Invalid Password|
#      |ummuhangenc14@gmail.com|                 |Please fill out this field|
#      |                       | MyKBBProject2022*|This field is required|


