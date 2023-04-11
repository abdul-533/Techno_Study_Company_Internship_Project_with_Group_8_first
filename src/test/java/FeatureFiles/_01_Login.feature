Feature: Login Functionality

  Scenario: Login with walid username and password
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully
