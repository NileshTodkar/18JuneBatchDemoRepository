package Ai.Expertia.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Ai.Expertia.TestBase.TestBase;

public class SignUpPage extends TestBase {
public SignUpPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='Company-name']")
	private WebElement txtbox_CompanyName;
	@FindBy(xpath="//p[@class='text-sm']")
	private WebElement txt_CompanyName;
	@FindBy(xpath="//input[@name='headquarters']")
	private WebElement txtbox_Headquarters ;
	@FindBy(xpath="//input[@name='industryType']")
	private WebElement txtbox_IndustryType;
	@FindBy(xpath="//div[@id='react-select-2-placeholder']")
	private WebElement listbox_CompanySize;
	@FindBy(xpath="//input[@name='companyWebsite']")
	private WebElement txtbox_CompanyWebSite;
	@FindBy(xpath="//textarea[@name='companyDescription']")
	private WebElement txtbox_CompanyDescription;
	@FindBy(xpath="//button[@name='Confirm & Continue']")
	private WebElement button_ConfirmAndContinue;
	
	public void enterCompanyName(String CompanyName) throws InterruptedException {
		txtbox_CompanyName.click();
		txtbox_CompanyName.sendKeys(CompanyName);
		Thread.sleep(4000);
		txt_CompanyName.click();
		Thread.sleep(4000);
		
		//Select s=new Select(txtbox_CompanyName);
		 //s.selectByIndex(0);//p[@class='text-sm']
	}
	public void enterHeadquarters(String Headquarters) throws InterruptedException {
		txtbox_Headquarters .sendKeys(Headquarters);
		Thread.sleep(2000);
	}
	public void enterIndustryType(String IndustryType) throws InterruptedException {
		txtbox_IndustryType.sendKeys(IndustryType);
		Thread.sleep(2000);
	}
	public void enterCompanySize() throws InterruptedException {
		 Select s=new Select(listbox_CompanySize);
		 s.selectByIndex(1);
		 Thread.sleep(2000);
	}
	public void enterCompanyWebSite(String CompanyWebSite) throws InterruptedException {
		txtbox_CompanyWebSite.sendKeys(CompanyWebSite);
		Thread.sleep(2000);
	}
	public void enterCompanyDescription(String CompanyDescription) throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scrollBy(1200,840)");
		txtbox_CompanyName.sendKeys(CompanyDescription);
		Thread.sleep(2000);
	}
	public void clickOnConfirmAndContinue() throws InterruptedException {
		button_ConfirmAndContinue.click();
		Thread.sleep(2000);
	}

}
