Feature: User Login Feature

  Scenario Outline: US02_Login
    Given Navigate To Presta Shop 4
    When Click On The Element
      | singInClick |
    Then Enter Data in Text Box
      | email    | <UserEmail> |
      | password | <Password>  |
    And Click On The Element
      | SubmitLogin |
    And Verification Is In Progress
      | <Success> | <Messages> |

    Examples:
      | UserEmail           | Password | Success             | Messages                 |
      | w.smith12@gmail.com | Ws1933   | myAccountSuccess    | Welcome to your account. |
      | wsmith@gmail.com    | Ws1933   | errorAccountSuccess | There is 1 error         |
      | w.Smith@gmail.com   | wS1933   | errorAccountSuccess | There is 1 error         |
      | w.Smith@gmail.com   | Ws1930   | errorAccountSuccess | There is 1 error         |
      | w.smith@gmail.cm    | Ws1933   | errorAccountSuccess | There is 1 error         |