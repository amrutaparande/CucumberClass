Feature: Login Functionalities
  Scenario: Valid Admin login
    Given open the browser and launch HRMS application
    When User enters valid email and valid password
    And click on login button
    Then user is logged in successfully into application
    And Close the browser

