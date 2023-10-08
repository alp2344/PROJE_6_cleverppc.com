Feature: Ordering and Payment

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

  Scenario: US07_Checkout
    Given Click On The Element
      | dresses |
    When Hover On The Element
      | productHover1 |
    Then Click On The Element
      | addToCard1       |
      | continueShopping |
    And Hover On The Element
      | shoppingCard |
    And Click On The Element
      | buttonOrderCard |
      | checkoutButton1 |
      | checkoutButton1 |
      | checkBox        |
      | checkoutButton2 |
      | paypalButton    |
    And Verification is performed and the previous page is returned.
     # | paypalMessage | Things don't appear to be working at the moment. Please try again later. |
      | paypalMessage | Şu anda bir şeylerin yolunda gitmediği görülüyor. |
    And Click On The Element
      | creditCardButton |
    And Verification is performed and the previous page is returned.
      | creditCardMessage | Invalid request (1). |
    And Click On The Element
      | bankWire      |
      | confirmButton |
    And Verification Is In Progress
      | alertCompleteMessage | Your order on Xu Clothing is complete. |
