package Ai.Expertia.TestLayer;

import org.testng.annotations.Test;

import Ai.Expertia.PageLayer.CreateCarrierPage;
import Ai.Expertia.PageLayer.LoginPage;
import Ai.Expertia.PageLayer.SignUpPage;
import Ai.Expertia.TestBase.TestBase;

public class SignupFuntionality extends TestBase {

	@Test()
	public void signupByCreateCarrierPage() throws InterruptedException {
		LoginPage login=new LoginPage();
		login.clickOnAccessForFree();
		Thread.sleep(2000);
		CreateCarrierPage c=new CreateCarrierPage();
		c.clickOnCreateyourCareerPage();
		Thread.sleep(2000);
		SignUpPage s= new SignUpPage();
		s.enterCompanyName("Amazon");
		/*s.enterHeadquarters("Pune");
		s.enterIndustryType("Marketing & Advertising");
		s.enterCompanySize();
		s.enterCompanyWebSite("https://www.amazon.in/");
		s.enterCompanyDescription("Marketing & Advertising company");*/
		s.clickOnConfirmAndContinue();
		
	}

}
