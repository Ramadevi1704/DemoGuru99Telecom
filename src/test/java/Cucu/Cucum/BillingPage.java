package Cucu.Cucum;

import java.util.Map;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.BillingStep;

public class BillingPage {

	@Given("the user is in pay billing page")
	public void the_user_is_in_pay_billing_page() {
		BillingStep page5=new BillingStep();
		page5.getBillingPage().click();
	}
	
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button(DataTable customerid) {
		BillingStep page5=new BillingStep();
		Map<String,String> customeridMap = customerid.asMap(String.class, String.class);
		page5.getEnterCustId().sendKeys(customeridMap.get("customer_id"));
		page5.getSubmitBtn().click();
	}

	@Then("the billing details should be displayed")
	public void the_billing_details_should_be_displayed() {
		BillingStep page5=new BillingStep();
		Assert.assertTrue(page5.getPlanDetails().isDisplayed());
	}


}
