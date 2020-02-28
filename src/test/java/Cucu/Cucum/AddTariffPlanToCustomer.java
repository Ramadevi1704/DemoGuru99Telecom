package Cucu.Cucum;

import java.util.Map;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddTariffPlantoCustomerStep;

public class AddTariffPlanToCustomer {

	@Given("the user is in add tariff plan to customer page")
	public void the_user_is_in_add_tariff_plan_to_customer_page() {
		AddTariffPlantoCustomerStep page4= new AddTariffPlantoCustomerStep();
		page4.getAddTariffPlanCustomer().click();
	}

	@When("the user selected the approved tariff plans")
	public void the_user_selected_the_approved_tariff_plans(DataTable customerid){
		AddTariffPlantoCustomerStep page4= new AddTariffPlantoCustomerStep();
		Map<String,String> customeridMap = customerid.asMap(String.class, String.class);
		page4.getEnterCustomerId().sendKeys(customeridMap.get("customer_id"));
		page4.getSubmitBtn().click();

	}

	@When("the user clicks add tariff plans to customer")
	public void the_user_clicks_add_tariff_plans_to_customer() {
		AddTariffPlantoCustomerStep page4= new AddTariffPlantoCustomerStep();
		page4.getPlanSelection().click();
	}

	@Then("the congratulation tariff plan assigned message should be displayed")
	public void the_congratulation_tariff_plan_assigned_message_should_be_displayed() {
		AddTariffPlantoCustomerStep page4= new AddTariffPlantoCustomerStep();
		Assert.assertTrue(page4.getVerifyPlanAssignedMsg().isDisplayed());
	}


}
