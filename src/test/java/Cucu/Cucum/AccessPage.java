package Cucu.Cucum;

import org.junit.Assert;
import cucumber.api.java.en.Then;
import objectrepository.AccessPageStep;

public class AccessPage {
	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		AccessPageStep page2= new AccessPageStep();
		Assert.assertTrue(page2.getVerifySuccessMsg().isDisplayed());

	}

}
