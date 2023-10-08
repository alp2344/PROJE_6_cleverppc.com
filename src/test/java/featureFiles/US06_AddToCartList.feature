Feature: Checking Added Items to the Cart

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

  Scenario: US06_AddToCartList
    Given Click On The Element
      | dresses |
    When Hover On The Element
      | productHover1 |
    Then Click On The Element
      | addToCard1       |
      | continueShopping |
    And Hover On The Element
      | productHover2 |
    And Click On The Element
      | addToCard2       |
      | continueShopping |
    And Hover On The Element
      | productHover3 |
    And Click On The Element
      | addToCard3       |
      | continueShopping |
    And Hover On The Element
      | shoppingCard |
    And Click On The Element
      | buttonOrderCard |
    And Is the length of the list equal to 3