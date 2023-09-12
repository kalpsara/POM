package week7.day2.assignments.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public HomePage clickCRMSFA() {
		WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.linkText("CRM/SFA"))));
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	
	
	public LoginPage clickLogout(){
		
		return new LoginPage();
	}

}
