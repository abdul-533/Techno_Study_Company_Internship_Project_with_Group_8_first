Feature: Fields Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    When User navigate to LeftNav
      | setup      |
      | parameters |
      | fields     |

  Scenario: Create new Fields
    And Click on element add button
    And Enter required informations
      | nameInput | Group_0008 |
      | code      | 008grp     |
    And Click to save button
    Then Success message should be displayed

  @Negative
  Scenario:  User shouldn't  be able to add (create) new Fields with same name
    And Click on element add button
    And Enter required informations
      | nameInput | Group_0008 |
      | code      | 008grp     |
    And Click to save button
    Then Unsuccessful message should be displayed

  Scenario: User should be able to Edit Fields
    And Click to edit button and change name
      | Group_0008 | New_Group_0008 |
    Then Success message should be displayed

  Scenario: User should be able to Delete Fields

    And  Click to delete button
      | Group_0008 |

    Then Success message should be displayed

  @Negative
  Scenario: User shouldn't be able to access deleted Fields
    And  Click to search button
      | searchInput | Group_0008 |
    Then There is no date message should be displayed