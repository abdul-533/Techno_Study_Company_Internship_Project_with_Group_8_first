Feature: Nationalities Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
    When User navigate to LeftNav
      | education         |
      | edSetup           |
      | subjectCategories |

    Scenario: Sending new Subject Category
      And Click on element add button
      And Enter required informations
        | nameInput | GalataSaray |
        | code      | 190545      |
      And Click to save button
      Then Success message should be displayed

      Scenario:  Sending new Subject Category delete

        And  Click to delete button
          | GalataSaray |
        Then There is no date message should be displayed

        Scenario: Subject Category  new update
          And Click on element add button
          And Enter required informations

            | nameInput | 8grouP |
            | code      | G8888  |

          And Click to save button
          Then Already exist should be displayed

          Scenario: Creating the Active



