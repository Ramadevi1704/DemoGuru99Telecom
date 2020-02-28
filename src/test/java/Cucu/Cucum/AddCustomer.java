package Cucu.Cucum;

import java.util.Map;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddCustomerStep;

public class AddCustomer{
	
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		AddCustomerStep page1=new AddCustomerStep();
	    page1.getAddCustomerLink().click();
		
	}
	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
		//page1.findElement(By.xpath("//Label[text()='Done']")).click();
		//page1.findElement(By.id("fname")).sendKeys("test");
		//page1.findElement(By.id("lname")).sendKeys("selenium"));
		//page1.findElement(By.id("email")).sendKeys("test@gmail.com");
		//page1.findElement(By.name("addr")).sendKeys("chennai");
		//page1.findElement(By.id("telephoneno")).sendKeys("342156");
		//List<String> customerDetailsList = customerDetails.asList(String.class);
		//page1.findElement(By.xpath("//Label[text()='Done']")).click();
		//page1.findElement(By.id("fname")).sendKeys(customerDetailsList.get(0));
		//page1.findElement(By.id("lname")).sendKeys(customerDetailsList.get(1));
		//page1.findElement(By.id("email")).sendKeys(customerDetailsList.get(2));
		//page1.findElement(By.name("addr")).sendKeys(customerDetailsList.get(3));
		//page1.findElement(By.id("telephoneno")).sendKeys(customerDetailsList.get(4));
		AddCustomerStep page1=new AddCustomerStep();
		Map<String,String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		page1.getBackgroundDone().click();
		page1.getFirstName().sendKeys(customerDetailsMap.get("firstName"));
		page1.getLastName().sendKeys(customerDetailsMap.get("lastName"));
		page1.getEmail().sendKeys(customerDetailsMap.get("emailaddress"));
		page1.getAddress().sendKeys(customerDetailsMap.get("adress"));
		page1.getPhoneNumber().sendKeys(customerDetailsMap.get("phoneNo"));
	}

	@When("the user clicks in submit button")                                                                                                                
	public void the_user_clicks_in_submit_button() {
		AddCustomerStep page1=new AddCustomerStep();
		page1.getSubmit().click();
	}
}
