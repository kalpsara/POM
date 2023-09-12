package week8.day1.assignments.pages;

import org.openqa.selenium.By;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	
	public LoginPage enterUsername() {
		getDriver().findElement(By.id("username")).sendKeys("DemoSalesManager");
		return new LoginPage(); 
	}
	
	public LoginPage enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		return new LoginPage();
	}

	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
        return new WelcomePage();
	}

}
