Feature:  Add-Edit-Delete Discounts under Parameters Setup

  Background: Login with walid username and password
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully

  Scenario: User Add Discount
    When User navigate to discounts Alperen
      | setup      |
      | parameters |
      | discounts  |
    Then Click on element add button
    And  User should enter necessary informations to the new discounts
      | description    | TechnoStudyGR9 |
      | integrationCod | 35             |
      | priority       | 53             |
    Then Click to save button
    And Success message should be displayed

  Scenario: User Edit Discount
    When User navigate to discounts Alperen
      | setup      |
      | parameters |
      | discounts  |

    Then Click to edit button and change name discounts
      | description | TechnoStudyGR99 |
    Then Click to save button
    And Success message should be displayed

  Scenario: User Delete Discount
    When User navigate to discounts Alperen
      | setup      |
      | parameters |
      | discounts  |
    Then Click to delete button Discounts
    Then Success message should be displayed
