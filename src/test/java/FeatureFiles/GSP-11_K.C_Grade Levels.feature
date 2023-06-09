Feature: Login Functionality

  Background: : Login with walid username and password
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
@Kubilay
    Scenario: Positive Test Case
      When User navigate to GradeLevels
        | setup |
        | parameters |
        | gradeLevels  |
      And Click on element add buttons
      And create a name,short name, order
        | nameInput | kubil22 |
        | shortName | kuku122 |
        | orderAdd |  34123  |
      And Click to save button
      Then Success message should be displayed
  @Kubilay @Negative
      Scenario: Negative Test Case
        When User navigate to GradeLevels
          | setup |
          | parameters |
          | gradeLevels  |
        And Click on element add buttons
        And create a name,short name, order
          | nameInput | kubil22 |
          | shortName | kuku122 |
          | orderAdd |  34123  |
        And Click to save button
        Then Default message should be displayed
  @Kubilay
    Scenario: Create discounts account, add,edit and delete this account
      When User navigate to GradeLevels
      | setup |
      | parameters |
      | gradeLevels  |
      And Click on element add buttons
      When create a name,short name and order complications
      Then Success message should be displayed
      And Click to edit and delete button and change name,shortname
      Then Success message should be displayed