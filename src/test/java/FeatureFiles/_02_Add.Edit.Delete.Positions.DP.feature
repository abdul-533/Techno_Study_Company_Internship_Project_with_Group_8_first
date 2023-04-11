Feature: Add Edit Delete Positions from DP

    Scenario: A,E,D Positions from DP functionality

    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    When Click Setup from LeftNav
    Then Click SchoolSetup from LeftNav
    Then Click Departments from LeftNav
    Then Click Add button int the School Department
    And  Enter a new name and code name from the School Deparment
    And  Click save button
    Then Click edit button
    And  After edit enter a new name and code name from the new School Department category
    Then Click save button
    Then click delete button
    And  User should see succesfull information


