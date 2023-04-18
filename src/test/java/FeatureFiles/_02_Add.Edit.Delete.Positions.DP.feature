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
      | nameInput   | ty  |
      | codeInputDP | 678 |
    And  Click on the element in Dialog
      | saveButton |
      | sortDP     |
      | sortDP     |
      | editButton |

    And  Enter a new name and code name in Dialog Content
      | nameInput   | tc   |
      | codeInputDP | 1237 |
    Then Click on the element in Dialog
      | saveButton     |
      | trashButtonDP  |
      | deleteButtonDP |

    And  User should see succesfully information

  Scenario: Positive Test Case see to massage
    And Click on the element LeftNav
      | setup       |
      | schoolSetup |
      | departments |
    Then Click on the element in Dialog
      | addButtonDp |
    And  Enter a new name and code name in Dialog Content
      | nameInput   | tyy  |
      | codeInputDP | 6789 |
    And  Click on the element in Dialog
      | saveButton |
    And User should see succesfully created

  Scenario: Negative Test Case see to error massage
    And Click on the element LeftNav
      | setup       |
      | schoolSetup |
      | departments |
    Then Click on the element in Dialog
      | addButtonDp |
    And  Enter a new name and code name in Dialog Content
      | nameInput   | tyy  |
      | codeInputDP | 6789 |
    And  Click on the element in Dialog
      | saveButton |
    And User should see succesfully error

  Scenario: Positive Test Case see to updated massage

    And Click on the element LeftNav
      | setup       |
      | schoolSetup |
      | departments |
    Then Click on the element in Dialog
      | addButtonDp |
    And  Enter a new name and code name in Dialog Content
      | nameInput   | ty  |
      | codeInputDP | 678 |
    And  Click on the element in Dialog
      | saveButton |
      | sortDP     |
      | sortDP     |
      | editButton |

    And  Enter a new name and code name in Dialog Content
      | nameInput   | tc   |
      | codeInputDP | 1237 |
    Then Click on the element in Dialog
      | saveButton |
    And User should see succesfully updated

