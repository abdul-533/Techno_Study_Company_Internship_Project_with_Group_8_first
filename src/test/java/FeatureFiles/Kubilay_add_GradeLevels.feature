Feature: Login Functionality

  Background: : Login with walid username and password
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully

    Scenario: Create discounts account, add,edit and delete this account
      When User navigate to discounts
      | setupK |
      | parameters |
      | gradeLevels  |
      And Click on element add buttons
      When create a name,short name and order complications
      Then Success message should be displayed


