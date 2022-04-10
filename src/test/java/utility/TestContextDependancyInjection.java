package utility;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectsManager;

public class TestContextDependancyInjection {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public BaseTest baseTest;
	
	public PageObjectsManager pageObjectsManager;
	public WebDriverTestCommonUtility webDriverTestCommonUtility;
	//public 
	public TestContextDependancyInjection() throws Exception
	{
		baseTest=new BaseTest();
		pageObjectsManager=new PageObjectsManager(baseTest.WebDriverManager());
		webDriverTestCommonUtility=new WebDriverTestCommonUtility(baseTest.WebDriverManager());
	}
}
