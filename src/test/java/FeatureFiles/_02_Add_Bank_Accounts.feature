Feature: Add Bank Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    When User navigate to Bank Account
      | setup        |
      | parameters   |
      | bankAccounts |

  Scenario: Create new Bank Accounts

    And Click on element add button

    And Enter required information
      | nameInput      | Group_8             |
      | ibanInput      | 8888 8888 8888 8888 |
      | integCodeInput | 008                 |
    And Click to save button
    Then Success message should be displayed

  @Negative
  Scenario:  User shouldn't  be able to add (create) new Bank Account with same data
    And Click on element add button

    And Enter required information
      | nameInput      | Group_8             |
      | ibanInput      | 8888 8888 8888 8888 |
      | integCodeInput | 008                 |
    And Click to save button
    Then Unsuccessful message should be displayed

  Scenario: User should be able to Edit Bank Account
    And Click to edit button and change inputs
      | nameInput      | Group_08            |
      | ibanInput      | 9999 9999 9999 9999 |
      | integCodeInput | 009                 |
    And Click to save button
    Then Success message should be displayed

  Scenario: User should be able to Delete Bank Account

    And  Click to delete button
      | Group_08 |

    Then Success message should be displayed

  @Negative
  Scenario: User shouldn't be able to access deleted Bank Account
    And  Click to search button
      | searchInput | Group_08 |
    Then There is no date message should be displayed