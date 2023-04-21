Feature: Nationalities Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    When User navigate to LeftNav
      | education         |
      | edSetup           |
      | subjectCategories |

  Scenario: Create new Subject Categories
    And Click on element add button
    And Enter required informations
      | nameInput | _Group__008 |
      | code      | 008_group_8 |
    And Click to save button
    Then Success message should be displayed

  @Negative
  Scenario:  User shouldn't  be able to add (create) new Subject Categories with same name
    And Click on element add button
    And Enter required informations
      | nameInput | _Group__008 |
      | code      | 008_group_8 |
    And Click to save button
    Then Unsuccessful message should be displayed

  Scenario: User should be able to Edit Subject Categories
    And Click to edit button and change name
      | _Group__008 | _Group__00800 |
    Then Success message should be displayed

  Scenario: User should be able to Subject Categories

    And  Click to delete button
      | _Group__00800 |

    Then Success message should be displayed

  @Negative
  Scenario: User shouldn't be able to access deleted Subject Categories
    And  Click to search button
      | searchInput | _Group__00800 |
    Then There is no date message should be displayed