Feature: Add Edit Delete Positions from DP

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button

  Scenario: A,E,D Positions from DP functionality
    And Click on the element LeftNav
      | setup       |
      | schoolSetup |
      | departments |
    Then Click on the element in Dialog
      | addButtonDp |
    And  Enter a new name and code name in Dialog Content
      |nameInputDP| ty  |
      |codeInputDP| 678 |
    And  Click on the element in Dialog
      | saveButtonDP |
      | sortDP       |
      | sortDP       |
      | editButtonDP |

    And  Enter a new name and code name in Dialog Content
      |nameInputDP| tc  |
      |codeInputDP| 1237 |
    Then Click on the element in Dialog
      | saveButtonDP   |
      | trashButtonDP  |
      | deleteButtonDP |

    And  User should see succesfully information


