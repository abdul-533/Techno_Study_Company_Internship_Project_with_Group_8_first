Feature: Add Positions Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully

  @Hande
  Scenario: Positive Create
    When Navigate to Positions
      | humanResourcesLeftNav |
      | SetupAtHumanResources |
      | positions             |
    And Click add button
    And Enter name and short name
      | nameInput | hhh |
      | shortName | h   |
    And Click save button
    Then Success message should be displayed

  @Hande @Negative
  Scenario: Negative Create
    When Navigate to Positions
      | humanResourcesLeftNav |
      | SetupAtHumanResources |
      | positions             |
    And Click add button
    And Enter name and short name
      | nameInput | hhh |
      | shortName | h   |
    And Click save button
    Then Already exist should be displayed

  @Hande
  Scenario: Positive Edit
    When Navigate to Positions
      | humanResourcesLeftNav |
      | SetupAtHumanResources |
      | positions             |
    And Search name and click edit button and change name
      | nameInput | hhhh |
    Then Success message should be displayed

  @Hande
  Scenario: Positive Delete
    When Navigate to Positions
      | humanResourcesLeftNav |
      | SetupAtHumanResources |
      | positions             |
    And Search name and click delete button
      | hhhh |
    Then Success message should be displayed

  @Hande @Negative
  Scenario: Negative Delete
    When Navigate to Positions
      | humanResourcesLeftNav |
      | SetupAtHumanResources |
      | positions             |
    And Search for the deleted name
      | hhhh |
    Then No data should be displayed

