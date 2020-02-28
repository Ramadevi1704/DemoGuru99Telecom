package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Cucu.Cucum.Hooks;

public class AddCustomerStep {

	public AddCustomerStep() {
		PageFactory.initElements(Hooks.driver,this);
	}

	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomerLink;

	@FindBy(xpath="//Label[text()='Done']")
	private WebElement backgroundDone;

	@FindBy(id="fname")
	private WebElement firstName;

	@FindBy(id="lname")
	private WebElement lastName;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(name="addr")
	private WebElement address;

	@FindBy(id="telephoneno")
	private WebElement phoneNumber;

	@FindBy(name="submit")
	private WebElement submit;
    
	public WebElement getAddCustomerLink() {
		return addCustomerLink;
	}

	public WebElement getBackgroundDone() {
		return backgroundDone;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
