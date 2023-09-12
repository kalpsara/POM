package week8.day1.assignments.pages;

import org.openqa.selenium.By;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod{
	public EditLeadPage enterCompanyName() {
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys("SSDUM_updated");
		return this;
	}

	/*
	 * public EditLeadPage enterfirstName(String fname) {
	 * getDriver().findElement(By.id("updateLeadForm_firstName")).sendKeys(fname);
	 * 
	 * return this; }
	 * 
	 * public EditLeadPage enterlastName(String lname) {
	 * getDriver().findElement(By.id("updateLeadForm_lastName")).sendKeys(lname); return
	 * this; }
	 */
	
	public ViewLeadPage clickUpdate() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
