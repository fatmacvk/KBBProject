Feature:Best Cars

  Background: chrome testing

@regression
  Scenario Outline: Verifying the best cars


    When user hover the CarReviews
    And user click the best cars
    And user click the See Lists button
    And user click the "<number>" and the best compact "<car>"
#    Then the top three best compact cars is displayed successfully.
    Examples:
    | number | car |
    | first| 2022 Mercedes-Benz A-Class |
#    | second| 2022 Honda Civic|
#    | third| 2022 Mercedes-Benz C-Class|



