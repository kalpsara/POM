package week8.day1.classroom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week8.day1.classroom.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	

	public LoginPage enterUsername() {
		getDriver().findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this; 
	}
	
	public LoginPage enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
        return new WelcomePage();
	}

}
