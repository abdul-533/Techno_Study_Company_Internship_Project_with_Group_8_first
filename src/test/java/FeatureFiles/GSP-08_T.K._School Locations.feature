Feature: Add Locations Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully

  Scenario: Positive Create
    When Navigate to Locations
      | setup       |
      | schoolSetup |
      | locations   |
    And Click add button
    And Enter name, short name, location type and capacity
      | nameInput | TechnoStudy |
      | shortName | Techno      |
      | capacity  | 150         |
    And Click save button
    Then Success message should be displayed

  Scenario: Negative Create
    When Navigate to Locations
      | setup       |
      | schoolSetup |
      | locations   |
    And Click add button
    And Enter name, short name, location type and capacity
      | nameInput | TechnoStudy |
      | shortName | Techno      |
      | capacity  | 150         |
    And Click save button
    Then Already exist should be displayed

  Scenario: Positive Edit
    When Navigate to Locations
      | setup       |
      | schoolSetup |
      | locations   |
    And Click edit button and change name
    Then Success message should be displayed

  Scenario: Positive Delete
    When Navigate to Locations
      | setup       |
      | schoolSetup |
      | locations   |
    And Click delete button
    Then Success message should be displayed

   Scenario: Negative Delete
     When Navigate to Locations
       | setup       |
       | schoolSetup |
       | locations   |
     And Click delete button
     Then No data should be displayed