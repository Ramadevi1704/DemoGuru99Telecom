package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Cucu.Cucum.Hooks;

public class AddTariffPlantoCustomerStep {

	public AddTariffPlantoCustomerStep() {
		PageFactory.initElements(Hooks.driver,this);
	}
	@FindBy(xpath="(//a[text()=\"Add Tariff Plan to Customer\"])[1]")
	private WebElement addTariffPlanCustomer;

	@FindBy(id="customer_id")
	private WebElement enterCustomerId;

	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement submitBtn;

	@FindBy(xpath="(//td[@align=\"center\"])[1]")
	private WebElement planSelection;

	@FindBy(tagName="h2")
	private WebElement verifyPlanAssignedMsg;

	public WebElement getAddTariffPlanCustomer() {
		return addTariffPlanCustomer;
	}

	public WebElement getEnterCustomerId() {
		return enterCustomerId;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getPlanSelection() {
		return planSelection;
	}

	public WebElement getVerifyPlanAssignedMsg() {
		return verifyPlanAssignedMsg;
	}



}
