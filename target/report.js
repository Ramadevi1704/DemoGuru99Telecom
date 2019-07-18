$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Rama/eclipse-workspace/Cucum/resource.pkg/AddCustomer.feature");
formatter.feature({
  "name": "To test add customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test the generate customer ID functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "rows": [
    {
      "cells": [
        "firstName",
        "test"
      ]
    },
    {
      "cells": [
        "lastName",
        "selenium"
      ]
    },
    {
      "cells": [
        "emailaddress",
        "test@gmail.com"
      ]
    },
    {
      "cells": [
        "adress",
        "chennai"
      ]
    },
    {
      "cells": [
        "phoneNo",
        "746489"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_fill_in_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks in submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_user_clicks_in_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the customer id generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessPage.the_user_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/Rama/eclipse-workspace/Cucum/resource.pkg/AddTariffPlan.feature");
formatter.feature({
  "name": "To test the add tariff plan and add tariff plan to customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test add tariff plan functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in add tariff plan page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user fill in valid tariff plan details \"\u003cMonthly\u003e\",\"\u003cFreeloc\u003e\",\"\u003cFreeInter\u003e\",\"\u003cFreesms\u003e\",\"\u003cLocalper\u003e\",\"\u003cInterPer\u003e\",\"\u003cSmsChar\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks submit button in add tariff plan page",
  "keyword": "And "
});
formatter.step({
  "name": "then user should see the success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Monthly",
        "Freeloc",
        "FreeInter",
        "Freesms",
        "Localper",
        "InterPer",
        "SmsChar"
      ]
    },
    {
      "cells": [
        "200",
        "100",
        "50",
        "100",
        "10",
        "30",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test add tariff plan functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlanpage.the_user_is_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid tariff plan details \"200\",\"100\",\"50\",\"100\",\"10\",\"30\",\"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanpage.the_user_fill_in_valid_tariff_plan_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks submit button in add tariff plan page",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanpage.the_user_clicks_submit_button_in_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanpage.then_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the add tariff plan to customer functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add tariff plan to customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlanToCustomer.the_user_is_in_add_tariff_plan_to_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selected the approved tariff plans",
  "rows": [
    {
      "cells": [
        "customer_id",
        "244295"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanToCustomer.the_user_selected_the_approved_tariff_plans(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks add tariff plans to customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanToCustomer.the_user_clicks_add_tariff_plans_to_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the congratulation tariff plan assigned message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanToCustomer.the_congratulation_tariff_plan_assigned_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/Rama/eclipse-workspace/Cucum/resource.pkg/Billing.feature");
formatter.feature({
  "name": "To test the billing functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To test the bill generation functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in pay billing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BillingPage.the_user_is_in_pay_billing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "rows": [
    {
      "cells": [
        "customer_id",
        "244295"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "BillingPage.the_user_clicks_the_submit_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the billing details should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BillingPage.the_billing_details_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});