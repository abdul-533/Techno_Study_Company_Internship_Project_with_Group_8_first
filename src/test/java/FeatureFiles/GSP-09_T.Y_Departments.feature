Feature: Add Edit Delete Positions from DP

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    And Click on the element LeftNav
      | setup       |
      | schoolSetup |
      | departments |
@Tolunay
  Scenario: A,E,D Positions from DP functionality

    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | ty  |
      | codeInput | 678 |
    And  Click on the element in Dialog
      | saveButton |
      | diyezClick |
      | diyezClick |
      | editButton |

    And  Enter a new name and code name in Dialog Content
      | nameInput | tc   |
      | codeInput | 1237 |
    Then Click on the element in Dialog
      | saveButton      |
      | deleteImageBtn  |
      | deleteDialogBtn |

    And  User should see succesfully information
  @Tolunay
  Scenario: Positive Test Case see to massage

    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | tyy  |
      | codeInput | 6789 |
    And  Click on the element in Dialog
      | saveButton |
    And User should see succesfully created
  @Tolunay @Negative
  Scenario: Negative Test Case see to error massage

    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | tyz  |
      | codeInput | 67890 |
    Then Click on the element in Dialog
      | saveButton |
    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | tyz  |
      | codeInput | 67890 |
    And  Click on the element in Dialog
      | saveButton |
    And User should see error name msg
  @Tolunay
  Scenario: Positive Test Case see to updated massage

    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | ty  |
      | codeInput | 678 |
    And  Click on the element in Dialog
      | saveButton |
      | diyezClick |
      | diyezClick |
      | editButton |

    And  Enter a new name and code name in Dialog Content
      | nameInput | tc   |
      | codeInput | 1237 |
    Then Click on the element in Dialog
      | saveButton |
    And User should see succesfully updated
  @Tolunay @Negative
  Scenario: Negative Test Case see to can't left blank!

    Then Click on the element in Dialog
      | addButton |
      | nameInput |
      | codeInput |
    Then User should see this field cannot left blank
  @Tolunay
  Scenario: Negative Test Case see to same code

    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | tyyz  |
      | codeInput | 56789 |
    Then Click on the element in Dialog
      | saveButton |
    Then Click on the element in Dialog
      | addButton |
    And  Enter a new name and code name in Dialog Content
      | nameInput | tcz  |
      | codeInput | 56789 |
    And  Click on the element in Dialog
      | saveButton |
    And User should see error code msg