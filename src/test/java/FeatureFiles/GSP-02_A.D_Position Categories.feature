Feature: Add Edit Delete Positions from HR

  Background: : Login with walid username and password
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully

  Scenario: As an Admin User I should be able to Add Position to HR
    When User navigate to Position Categories
      | humanResourcesLeftNav  |
      | SetupAtHumanResources  |
      | positionCategoriesAtHR |
    Then Click on element add button
    And Enter name at Position Category
      | nameInput | TechnoStudyGR8 |
    Then Click to save button
    Then Success message should be displayed

    Scenario: Edit Function from HR
      When User navigate to Position Categories
    | humanResourcesLeftNav  |
    | SetupAtHumanResources  |
    | positionCategoriesAtHR |
      Then Click to edit button and change name HR
      |nameInput| TechnoStudyGR88 |
      Then Success message should be displayed

      Scenario: Delete Function from HR
        When User navigate to Position Categories
          | humanResourcesLeftNav  |
          | SetupAtHumanResources  |
          | positionCategoriesAtHR |
        Then Click to delete button HR
          | TechnoStudyGR88 |
        Then Success message should be displayed

        Scenario: Positive Test 1
          When User navigate to Position Categories
            | humanResourcesLeftNav  |
            | SetupAtHumanResources  |
            | positionCategoriesAtHR |
          Then User should be able to see the position category list

  Scenario: Positive Test Function from HR
    When User navigate to Position Categories
      | humanResourcesLeftNav  |
      | SetupAtHumanResources  |
      | positionCategoriesAtHR |

    Then Click to search button HR

  Scenario: Negative Test Function from HR
    When User navigate to Position Categories
      | humanResourcesLeftNav  |
      | SetupAtHumanResources  |
      | positionCategoriesAtHR |
    And Enter name at Position Category HR

    Then already exists message should be displayed



