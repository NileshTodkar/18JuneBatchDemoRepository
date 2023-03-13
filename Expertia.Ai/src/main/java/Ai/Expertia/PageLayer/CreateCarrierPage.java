package Ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ai.Expertia.TestBase.TestBase;

public class CreateCarrierPage extends TestBase {
	
	public CreateCarrierPage () {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='Create your Career Page!']")
	private WebElement button_CreateyourCareerPage;
	@FindBy(xpath="//button[text()='Post a Job!']")
	private WebElement button_PostAJob;
	
	public void clickOnCreateyourCareerPage() {
		button_CreateyourCareerPage.click();
	}
	public void clickOnPostAJob() {
		button_PostAJob.click();
	}
}
