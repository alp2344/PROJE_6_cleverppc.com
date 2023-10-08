Feature: Adding a new address to the user account

  Background: Login
    Given Navigate To Presta Shop 4
    When Click On The Element
      | singInClick |
    Then Enter Data in Text Box
      | email    | w.smith12@gmail.com |
      | password | Ws1933              |
    And Click On The Element
      | SubmitLogin |
    And Verification Is In Progress
      | myAccountSuccess | Welcome to your account. |

  Scenario: US03_NewAddr
    Given Click On The Element
      | siteMap     |
      | myAddresses |
      | newAddress  |
    When Enter Data in Text Box
      | address1 | 300 Central Park |
      | city     | NewYork          |
    Then Click On The Element
      | idState |
    And Enter Data in Text Box
      | postCode    | 44100       |
      | phone       | 19999999999 |
      | phoneMobile | 19999999995 |
    And Click On The Element
      | submitAddress |
    And Verification Is In Progress
      | addressSuccess | Your addresses are listed below. |