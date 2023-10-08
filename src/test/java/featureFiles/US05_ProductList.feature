Feature: Checking the Number of Listed Items

#  Background: Login
#    Given Navigate To Presta Shop 4
#    When Click On The Element
#      | singInClick |
#    Then Enter Data in Text Box
#      | email    | w.smith@gmail.com |
#      | password | Ws1933            |
#    And Click On The Element
#      | SubmitLogin |
#    And Verification Is In Progress
#      | myAccountSuccess | Welcome to your account. |

  Scenario: US05_ProductList
    Given Navigate To Presta Shop 4
    When Click On The Element
      | dresses |
    Then Verifying that it is equal to 5
      | headingCounter |
      | headingCount   |
    And Is the length of the list equal to 5
