Feature: Adding Products to Cart

  Scenario: US04_AddToCart
    Given Navigate To Presta Shop 4
    When Hover On The Element
      | womanHover |
    Then Click On The Element
      | summerDresses |
    And Hover On The Element
      | productHover3 |
    And Click On The Element
      | addToCard3        |
      | proceedToCheckout |
    And Verification Is In Progress
      | addToName  | Printed Chiffon Dress |
      | totalPrice | $23.40                |