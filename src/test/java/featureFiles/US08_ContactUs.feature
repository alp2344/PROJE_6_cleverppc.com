Feature: Sending an Email to the Website Team as a User

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

  Scenario: US08_ContactUs
    Given Navigate To Presta Shop 4
    When Click On The Element
      | contactUs       |
      | customerService |
      | orderReference  |
      | product         |
    And Click On The Element
      | fileUpload |
    And Adding Receipt Of Payment File
    And Enter Data in Text Box
      | message | The bank transfer has just been made, the payment receipt is attached. Will Smith |
    And Click On The Element
      | submitButton |
    And Verification Is In Progress
      | alertCompleteMessage | Your message has been successfully sent to our team. |