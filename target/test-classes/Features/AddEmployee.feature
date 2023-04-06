Feature: Employee
@testcase2
  Scenario: Valid Admin login
    Given open the browser and launch HRMS application
    When User enters valid email and valid password
    And click on login button
    And user clicks on PIM option
   And user clicks on add employee button
    And user enters firstname and middlename and lastname
    And user clicks on save button