package week8.day1.assignments.pages;

import org.openqa.selenium.By;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod{

	
	public ViewLeadPage clickCreateLeadToDuplicate() {
		
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
