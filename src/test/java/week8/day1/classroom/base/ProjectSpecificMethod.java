package week8.day1.classroom.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import week8.day1.classroom.utils.ReadExcelFile;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	public  ChromeDriver driver;
	
	public RemoteWebDriver getDriver() {
		return tlDriver.get();
	}


	public void setDriver(ChromeDriver driver) {
		tlDriver.set(new ChromeDriver());
	}

	public static final ThreadLocal<RemoteWebDriver> tlDriver=new ThreadLocal<RemoteWebDriver>();
	
	public static ThreadLocal<RemoteWebDriver> getTldriver() {
		return tlDriver;
	}



	@BeforeMethod
	@Parameters({ "url" })
	public void preCondition(String url) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//driver = new ChromeDriver(options);
		setDriver(driver);
		getDriver().get(url);
		getDriver().manage().window().maximize();
	}

	@AfterMethod
	public void postCondition() {

		driver.close();
	}

	public  String fileName;

	@BeforeMethod(alwaysRun = true)
	public void setFileName() {
		fileName = "Lead.xlsx";
	}

	@BeforeMethod
	@DataProvider(name = "dataProvider")
	public Object[][] sendData() throws IOException {
		Object[][] excelData = ReadExcelFile.readExcel(fileName);
		return excelData;
	}

}
