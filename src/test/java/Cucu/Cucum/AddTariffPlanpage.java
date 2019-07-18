package Cucu.Cucum;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.AddTariffPlanPageStep;

public class AddTariffPlanpage {
	@Given("the user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		AddTariffPlanPageStep page3=new AddTariffPlanPageStep();
		page3.getAddTariffPlan().click();
	}

	@When("the user fill in valid tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_valid_tariff_plan_details(String Monthly, String Freeloc, String FreeInter, String Freesms, String Localper, String InterPer, String SmsChar) {
		// we can give any for the string variable String Monthly/String String1 we gave monthly for our reference
		AddTariffPlanPageStep page3=new AddTariffPlanPageStep();
		
		page3.getMonthlyRental().sendKeys(Monthly);
		page3.getFreeLocalMinutes().sendKeys(Freeloc);
		page3.getFreeInterMinutes().sendKeys(FreeInter);
		page3.getFreeSMSpack().sendKeys(Freesms);
		page3.getLocalPerMinute().sendKeys(Localper);
		page3.getInterPerMinute().sendKeys(InterPer);
		page3.getSmsPerCharge().sendKeys(SmsChar);


	}

	@When("the user clicks submit button in add tariff plan page")
	public void the_user_clicks_submit_button_in_add_tariff_plan_page() {
		AddTariffPlanPageStep page3=new AddTariffPlanPageStep();
		page3.getSubmit().click();
	}

	@Then("then user should see the success message")
	public void then_user_should_see_the_success_message() {
		AddTariffPlanPageStep page3=new AddTariffPlanPageStep();
		Assert.assertTrue(page3.getVerifymessage().isDisplayed());

	}

}
