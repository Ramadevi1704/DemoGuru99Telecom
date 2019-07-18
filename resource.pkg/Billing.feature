@tag
Feature: To test the billing functionality

  @tag1
  Scenario: To test the bill generation functionality
    Given the user is in pay billing page
    When the user clicks the submit button
      | customer_id | 244295 |
    Then the billing details should be displayed
