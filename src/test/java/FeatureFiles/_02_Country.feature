

Feature: Country Functionality

  @SmokeTest @SundayTest @Regression
  Scenario: Create Counrty

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And  Navigate to country page
    When Create a country
    Then Success message should be displayed