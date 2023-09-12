package week8.day1.classroom.testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week8.day1.classroom.base.ProjectSpecificMethod;
import week8.day1.classroom.pages.CreateLeadPage;
import week8.day1.classroom.pages.LoginPage;

public class CreateLeadTC extends ProjectSpecificMethod {

	public ChromeDriver driver;

	  @Test(dataProvider = "dataProvider") 
		public void runCreateLead(String...data) {
			
			new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeads().createLead()
			.enterCompanyName(data[0]).enterfirstName(data[1]).enterlastName(data[2]).clickCreate();
			
			
		}

}
