package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Cucu.Cucum.Hooks;

public class AccessPageStep {
	
	public AccessPageStep() {
		PageFactory.initElements(Hooks.driver,this);
	}
	
	@FindBy(tagName="h3")
	private WebElement verifySuccessMsg;

	public WebElement getVerifySuccessMsg() {
		return verifySuccessMsg;
	}

	

	
	
	

}
