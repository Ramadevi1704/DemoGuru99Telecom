Feature: To test add customer functionality

  Scenario: To test the generate customer ID functionality
    Given the user is in add customer page
    When the user fill in valid customer details
      | firstName    | test           |
      | lastName     | selenium       |
      | emailaddress | test@gmail.com |
      | adress       | chennai        |
      | phoneNo      |         746489 |
    And the user clicks in submit button
    Then the user should see the customer id generated
