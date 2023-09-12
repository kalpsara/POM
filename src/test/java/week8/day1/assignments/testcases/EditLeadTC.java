package week8.day1.assignments.testcases;

import org.testng.annotations.Test;

import week8.day1.assignments.base.ProjectSpecificMethod;
import week8.day1.assignments.pages.LoginPage;

public class EditLeadTC extends ProjectSpecificMethod {

	

	@Test(dataProvider = "dataProvider")
	public void runEdit(String... data) throws InterruptedException {

	new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeads().findLead().enterFirstName().findLeadWithFieldsEntered().clickLeadList().clickEditLead().enterCompanyName().clickUpdate();

	}

	

}
