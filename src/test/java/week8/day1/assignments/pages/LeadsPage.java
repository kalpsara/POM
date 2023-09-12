package week8.day1.assignments.pages;

import org.openqa.selenium.By;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
	public CreateLeadPage createLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	public FindLeadPage findLead() {
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
		
	}
	public MergeLeadPage mergeLead() {
		getDriver().findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}

}
