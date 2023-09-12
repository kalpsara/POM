package week8.day1.assignments.testcases;

import org.testng.annotations.Test;

import week8.day1.assignments.base.ProjectSpecificMethod;
import week8.day1.assignments.pages.LoginPage;

public class LoginTC extends ProjectSpecificMethod {
	
//	LoginPage lp=new LoginPage(driver);
	@Test
	
	public void runLogin() {
	new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA();
		
	}

}
