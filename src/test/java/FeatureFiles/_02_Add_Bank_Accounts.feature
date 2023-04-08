Feature: Add Bank Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully

  Scenario: Create Bank Accounts, edit and delete this accounts
    When User navigate to Bank Account
      | setup        |
      | parameters   |
      | bankAccounts |
    And Click on element add button

    And Enter name,IBAM,currency and integration code
      | nameInput      | Ali-533 |
      | ibanInput      | 1234567 |
      | integCodeInput | 533     |
    And Click to save button

    Then Success message should be displayed

    And Click to edit button and change name
      | nameInput | Ali-433 |

    Then Success message should be displayed

    And  Click to delete button
      | Ali-433 |

    Then Success message should be displayed



