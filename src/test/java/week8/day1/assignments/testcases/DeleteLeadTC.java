package week8.day1.assignments.testcases;

import org.testng.annotations.Test;

import week8.day1.assignments.base.ProjectSpecificMethod;
import week8.day1.assignments.pages.LoginPage;

public class DeleteLeadTC extends ProjectSpecificMethod {

	@Test
public void runDeleteLead()throws InterruptedException {

	new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeads().findLead()
			.enterFirstName().findLeadWithFieldsEntered().clickLeadList().clickDeleteLead();

}

}
