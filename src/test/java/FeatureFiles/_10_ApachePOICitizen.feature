Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

    Scenario:  Create citizenship from Excel
      When  User Create citizenship with ApachePOI

  Scenario:  Delete citizenship from Excel
      Then  User Delete citizenship with ApachePOI