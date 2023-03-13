package Ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ai.Expertia.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@class='ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn']")
	private WebElement button_AccessForFree;
	
	public void clickOnAccessForFree() {
		button_AccessForFree.click();
	}

}
