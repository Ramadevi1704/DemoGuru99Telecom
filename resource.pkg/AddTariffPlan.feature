Feature: To test the add tariff plan and add tariff plan to customer functionality

  Scenario Outline: To test add tariff plan functionality
    Given the user is in add tariff plan page
    When the user fill in valid tariff plan details "<Monthly>","<Freeloc>","<FreeInter>","<Freesms>","<Localper>","<InterPer>","<SmsChar>"
    And the user clicks submit button in add tariff plan page
    Then then user should see the success message

    Examples: 
      | Monthly | Freeloc | FreeInter | Freesms | Localper | InterPer | SmsChar |
      |     200 |     100 |        50 |     100 |       10 |       30 |       2 |

  @tag
  Scenario: To test the add tariff plan to customer functionality
    Given the user is in add tariff plan to customer page
    When the user selected the approved tariff plans 
     | customer_id    | 244295           |
    And the user clicks add tariff plans to customer
    Then the congratulation tariff plan assigned message should be displayed
