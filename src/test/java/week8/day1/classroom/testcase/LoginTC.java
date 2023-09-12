package week8.day1.classroom.testcase;

import org.testng.annotations.Test;

import week7.day2.assignments.base.ProjectSpecificMethod;
import week7.day2.assignments.pages.LoginPage;

public class LoginTC extends ProjectSpecificMethod {
	
	LoginPage lp=new LoginPage();
	@Test
	
	public void runLogin() {
		lp.enterUsername().enterPassword().clickLogin().clickCRMSFA();
		
	}

}
