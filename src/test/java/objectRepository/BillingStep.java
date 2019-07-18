package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucu.Cucum.Hooks;

public class BillingStep {

	public BillingStep() {
		PageFactory.initElements(Hooks.driver,this);
	}

	@FindBy(xpath="(//a[text()=\"Pay Billing\"])[1]")
	private WebElement billingPage;

	@FindBy(id="customer_id")
	private WebElement enterCustId;

	@FindBy(name="submit")
	private WebElement submitBtn;

	@FindBy(tagName="h3")
	private WebElement planDetails;

	public WebElement getBillingPage() {
		return billingPage;
	}

	public WebElement getEnterCustId() {
		return enterCustId;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getPlanDetails() {
		return planDetails;
	}


}
