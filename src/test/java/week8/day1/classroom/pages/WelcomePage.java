package week8.day1.classroom.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import week8.day1.classroom.base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public void clickCRMSFA() {
		
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		
	}
	
	/*
	 * public LoginPage clickLogout(){
	 * 
	 * return new LoginPage(); }
	 */

}
