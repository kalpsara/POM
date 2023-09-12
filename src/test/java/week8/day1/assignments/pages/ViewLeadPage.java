
package week8.day1.assignments.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{

	
	public LeadsPage clickDeleteLead() {
		
		getDriver().findElement(By.linkText("Delete")).click();
		return new LeadsPage();
	}
	
	public EditLeadPage clickEditLead() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

		
		WebElement editButton = getDriver().findElement(By.linkText("Edit"));
		wait.until(ExpectedConditions.elementToBeClickable(editButton));
		editButton.click();
		return new EditLeadPage();
	}
	
	public DuplicateLeadPage clickDuplicateLead() {
		
		getDriver().findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
		
	}
	
	

}
