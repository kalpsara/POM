package week8.day1.assignments.pages;

import org.openqa.selenium.By;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public LeadsPage clickLeads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}

}
