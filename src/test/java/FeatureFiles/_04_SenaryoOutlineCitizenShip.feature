Feature: Citizenship with scenario outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

    Scenario Outline: Citizenship create
      When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
      Then Success message should be displayed

      When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
      Then Already exist message should be displayed
      And Click on close button

      When User delete the "<CitizenshipName>"
      Then Success message should be displayed
      Examples:
        | CitizenshipName   | ShortName  |
        | yasin0011           | yas0011     |
        | yasin0111          | yas0111      |
        | yasin0211           | yas0211      |
        | yasin0311           | yas0311      |
        | yasin0411           | yas0411      |
