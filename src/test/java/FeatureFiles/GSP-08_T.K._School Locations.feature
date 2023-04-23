Feature: Add Locations Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    When User navigate to LeftNav
      | setup       |
      | schoolSetup |
      | locations   |

  @Tugba
  Scenario: Positive Create
    And Click add button
    And Enter required informations
      | nameInput | TechnoStudy |
      | shortName | Techno      |
      | capacity  | 150         |
    And Click to save button
    Then Success message should be displayed

  @Tugba @Negative
  Scenario: Negative Create
    And Click add button
    And Enter required informations
      | nameInput | TechnoStudy |
      | shortName | Techno      |
      | capacity  | 150         |
    And Click to save button
    Then Unsuccessful message should be displayed

  @Tugba
  Scenario: Positive Edit
    And Click edit button and change name
      | TechnoStudy | NewTechnoStudy |
    And Click to save button
    Then Success message should be displayed

  @Tugba
  Scenario: Positive Delete
    And Click delete button
      | NewTechnoStudy |
    Then Success message should be displayed

  @Tugba @Negative
  Scenario: Negative Delete
    Then There is no date with this name
      | NewTechnoStudy |