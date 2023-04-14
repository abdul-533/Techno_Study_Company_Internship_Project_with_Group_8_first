Feature: Add Edit Delete Positions from HR
  Scenario: A,E,D Positions from HR functionality
    Given Navigate to test.mersys.io
    Then Enter username and password
    And Click Login Button
    And Click Human Resources from LeftNav
    And Click Setup at the Human Resources from LeftNav
    And Click Position Categories at the Human Resources from LeftNav
    Then Click Add button in the Position Categories (Dialog Content)
    And Enter a new name from the new position category
    Then Click save button
    Then Click Edit button
    And After Edit Enter a new name from the new position category
    Then Click save button
    Then Click delete button
    And Confirm delete
    Then User should see succesful information