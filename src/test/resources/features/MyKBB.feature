Feature:My KBB

  Background:
    Given user click MyKBB icon and user click on firstSignin button

  @smoke
  Scenario: Verifying My KBB login

    And user enters valid email and password
    And user click Signin button to see its account
    Then user is successfully logged in


  @smoke
  Scenario Outline: invalid username and password
    When user enters invalid "<username>" and "<password>"
    And user clicks Signin button
    Then user see "<error message>"
    Examples:
      | username                | password          |error message  |
      |                         | MyKBBProject2022* |This field is required.|
      | ummuhangenc14@gmail.com | MyKBBProject2022  |Sorry, we recognize your email address but not your password. Did you forget your password?  |
      | ummuhangenc14@gmail.co  | MyKBBProject2022* |Sorry, we don't recognize that email address. Please try another email address or use one of the third-party accounts to sign in. |

