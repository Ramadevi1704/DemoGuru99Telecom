package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Cucu.Cucum.Hooks;

public class AddTariffPlanPageStep {
	
		public AddTariffPlanPageStep() {
			PageFactory.initElements(Hooks.driver,this);
		}

		@FindBy(xpath="(//a[text()='Add Tariff Plan'])[1]")
		private WebElement addTariffPlan;
		
		@FindBy(id=("rental1"))
		private WebElement monthlyRental;
		
		@FindBy(id=("local_minutes"))
		private WebElement freeLocalMinutes;
		
		@FindBy(id=("inter_minutes"))
		private WebElement freeInterMinutes;
		
		@FindBy(id=("sms_pack"))
		private WebElement freeSMSpack;
		
		@FindBy(id=("minutes_charges"))
		private WebElement localPerMinute;
		
		@FindBy(id=("inter_charges"))
		private WebElement interPerMinute;
		
		@FindBy(id=("sms_charges"))
		private WebElement smsPerCharge;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement Submit;
		
		@FindBy(tagName="h2")
		private WebElement verifymessage;

		public WebElement getAddTariffPlan() {
			return addTariffPlan;
		}

		public WebElement getMonthlyRental() {
			return monthlyRental;
		}

		public WebElement getFreeLocalMinutes() {
			return freeLocalMinutes;
		}

		public WebElement getFreeInterMinutes() {
			return freeInterMinutes;
		}

		public WebElement getFreeSMSpack() {
			return freeSMSpack;
		}

		public WebElement getLocalPerMinute() {
			return localPerMinute;
		}

		public WebElement getInterPerMinute() {
			return interPerMinute;
		}

		public WebElement getSmsPerCharge() {
			return smsPerCharge;
		}

		public WebElement getSubmit() {
			return Submit;
		}

		public WebElement getVerifymessage() {
			return verifymessage;
		}
		
		
		
		
		
	}
