Feature: Add Edit Delete Positions from HR-ATTESTATIONS

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    And Click on the element HR-ATTESTATIONS LeftNav
      | humanResourcesLeftNav |
      | SetupAtHumanResources |
      | SetupAtAttestations   |
    Then Click on the element to HR-ATTESTATIONS in Dialog
      | addButton |
@Aykut
  Scenario: A,E,D Positions from HR-ATTESTATIONS functionality
    And  Enter a new name to HR-ATTESTATIONS in Dialog Content
      | nameInput | Aykuttechno |
    And  Click on the element to HR-ATTESTATIONS in Dialog
      | saveButton             |
      | diyezClick             |
      | diyezClick             |
      | editButtonAttestations |

    And  Enter a new name to HR-ATTESTATIONS in Dialog Content
      | nameInput | Aykuttech |

    Then Click on the element to HR-ATTESTATIONS in Dialog
      | saveButton                 |
      | deleteImageBtnAttestations |
      | deleteDialogBtn            |

    And  User should see succesfully information frame
  @Aykut @Negative
  Scenario: Negative Test Case see to same name
    And  Enter a new name to HR-ATTESTATIONS in Dialog Content
      | nameInput | Aykuttechno |
    And  Click on the element to HR-ATTESTATIONS in Dialog
      | saveButton |
    Then Click on the element to HR-ATTESTATIONS in Dialog
      | addButton |
    And  Enter a new name to HR-ATTESTATIONS in Dialog Content
      | nameInput | Aykuttechno |
    And  Click on the element to HR-ATTESTATIONS in Dialog
      | saveButton |

    Then  User should see succesfully error message
  @Aykut
  Scenario: Positive Test Case see to created

    And  Enter a new name to HR-ATTESTATIONS in Dialog Content
      | nameInput | Aykuttechno1 |
    And  Click on the element to HR-ATTESTATIONS in Dialog
      | saveButton |
    Then  User should see succesfully create message

