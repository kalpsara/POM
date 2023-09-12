package week8.day1.classroom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week8.day1.classroom.base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
	
	

	public CreateLeadPage enterCompanyName(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterfirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		return this;
	}

	public CreateLeadPage enterlastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	public ViewLeadPage clickCreate() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
