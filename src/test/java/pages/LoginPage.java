package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	public LoginPage userName() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		return this;
	}

	public LoginPage password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
	

}
