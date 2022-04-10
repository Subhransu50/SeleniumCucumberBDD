package stepDefinations;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.TestContextDependancyInjection;

public class Hooks {

	TestContextDependancyInjection testContextDI;
	public Hooks(TestContextDependancyInjection testContextDI)
	{
		this.testContextDI=testContextDI;
	}
	@After
	public void afterScenario() throws Exception
	{
	//	testContextDI.baseTest.driver.quit();
		testContextDI.baseTest.WebDriverManager().quit();
	}
	@AfterStep
	public void addScreenshot(Scenario scenario) throws Exception
	{
		WebDriver driver=testContextDI.baseTest.WebDriverManager();
		if(scenario.isFailed())
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			/*File DestFile=new File("path of file");
			FileUtils.copyFile(src, DestFile);*/
			byte[] fileContent=FileUtils.readFileToByteArray(src);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}
