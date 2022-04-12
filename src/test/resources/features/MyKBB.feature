Feature:My KBB

  Background:
    Given user click MyKBB icon and user click on Signin button

  @smoke
  Scenario: Verifying My KBB login


    And user enters valid email and password
    And user click Signin button to see its account
    Then user is successfully logged in



  Scenario Outline: invalid username and password
    When user enters invalid "<username>" and "<password>" and clicks on login

    Examples:
      | username                | password          |
      |                         | MyKBBProject2022* |
      | ummuhangenc14@gmail.com | MyKBBProject2022  |
      | ummuhangenc14@gmail.co  | MyKBBProject2022* |

