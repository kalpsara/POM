package week8.day1.assignments.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import week8.day1.assignments.base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod {

	public MergeLeadPage selectFromLead() throws InterruptedException {
		getDriver().findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = getDriver().getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		getDriver().switchTo().window(allhandles.get(1));
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("k");
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String leadID = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().switchTo().window(allhandles.get(0));
		return this;

	}

	public MergeLeadPage selectToLead() throws InterruptedException {
		getDriver().findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = getDriver().getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		getDriver().switchTo().window(allhandles2.get(1));
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("s");
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().switchTo().window(allhandles2.get(0));
		return this;

	}

	public ViewLeadPage clickMergeLeadButton() {
		getDriver().findElement(By.xpath("//a[text()='Merge']")).click();
		getDriver().switchTo().alert().accept();
		return new ViewLeadPage();
	}

}
