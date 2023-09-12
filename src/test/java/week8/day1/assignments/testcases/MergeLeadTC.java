package week8.day1.assignments.testcases;

import org.testng.annotations.Test;

import week8.day1.assignments.base.ProjectSpecificMethod;
import week8.day1.assignments.pages.LoginPage;

public class MergeLeadTC extends ProjectSpecificMethod {

	@Test
	public void runMergeLead() throws InterruptedException {

		new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeads().mergeLead().selectFromLead().selectToLead().clickMergeLeadButton();

	}

}