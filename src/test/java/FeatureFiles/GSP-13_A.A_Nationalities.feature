Feature: Nationalities Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    When User navigate to LeftNav
      | setup         |
      | parameters    |
      | nationalities |

  @Abdul
  Scenario: Create new Nationalities
    And Click on element add button
    And Enter required informations
      | nameInput | Group_8 |
    And Click to save button
    Then Success message should be displayed

  @Abdul @Negative
  Scenario:  User shouldn't  be able to add (create) new Nationalities with same name
    And Click on element add button
    And Enter required informations
      | nameInput | Group_8 |
    And Click to save button
    Then Unsuccessful message should be displayed

  @Abdul
  Scenario: User should be able to Edit Nationalities
    And Click to edit button and change name
      | Group_8 | Group_008 |
    Then Success message should be displayed

  @Abdul
  Scenario: User should be able to Delete Nationalities

    And  Click to delete button
      | Group_008 |

    Then Success message should be displayed

  @Abdul @Negative
  Scenario: User shouldn't be able to access deleted Nationalities
    And  Click to search button
      | searchInput | Group_008 |
    Then There is no date message should be displayed