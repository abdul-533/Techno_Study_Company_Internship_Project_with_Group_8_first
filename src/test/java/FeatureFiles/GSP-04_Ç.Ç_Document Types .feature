Feature: Add Positions Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
@Cagla
  Scenario: Positive Create
    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |
    And Click add button
    And Enter name, stage and description
      | nameInput | cc |
    And Click save button
    Then Success message should be displayed
  @Cagla @Negative
  Scenario: Negative Create
    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |
    And Click add button
    And Enter name, stage and description
      | nameInput | cc |
    And Click save button
    Then Already exist should be displayed
  @Cagla
  Scenario: Positive Edit
    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |
    And Search name and click edit button and change Name
      | nameInput | ccc |
    Then Success message should be displayed
  @Cagla
  Scenario: Positive Delete
    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |
    And Search name and click delete buttons
      | ccc |
    Then Success message should be displayed
  @Cagla @Negative
  Scenario: Negative Delete
    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |
    And Search for the deleted name
      | ccc |
    Then No data should be displayed
