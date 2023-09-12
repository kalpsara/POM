package week8.day1.assignments.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class FindLeadPage extends ProjectSpecificMethod {

	public FindLeadPage enterFirstName() {
		WebElement firstName = getDriver().findElement(By.xpath(
				"//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name='firstName']"));
		firstName.clear();
		firstName.sendKeys("k");
		return this;

	}

	public FindLeadPage findLeadWithFieldsEntered() {

		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public ViewLeadPage clickLeadList() throws InterruptedException {
		System.out.println("Inside clickLeadList");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

		WebElement firstRecord = getDriver()
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		wait.until(ExpectedConditions.elementToBeClickable(firstRecord));
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click()", firstRecord);
		//firstRecord.click();
		return new ViewLeadPage();

	}

}
