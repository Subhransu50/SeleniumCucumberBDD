package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContextDependancyInjection;

public class OfferPageStepDefinations {
	TestContextDependancyInjection testContextDI;
	public OfferPageStepDefinations(TestContextDependancyInjection testContextDI)
	{
		this.testContextDI=testContextDI;
	}
	public OfferPageStepDefinations(WebDriver driver)
	{
		
	}
	WebDriverWait wait;
	//public WebDriver driver;
	//String landingPageProductName;
	String offerPageProductName;
	/*@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\panda\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		wait=new WebDriverWait(driver,30);
		driver.manage().window().maximize();
	  
	}
	@When("Usersearched with shortname {string} and extracted actual name of product")
	public void usersearched_with_shortname_and_extracted_actual_name_of_product(String string) throws InterruptedException {
	   By inputSearch=By.xpath("//input[@type='search']");
	   By fruitName=By.cssSelector("h4.product-name");
	   driver.findElement(inputSearch).sendKeys(string);
	   Thread.sleep(3000);
	   String frt= driver.findElement(fruitName).getText();
	   String[] frtArray=frt.split("-");
	   landingPageProductName=frtArray[0].trim();
	   System.out.println(landingPageProductName+" Product Name is Extracted from home page");
	   
	}*/
	@Then("User searched for {string} shortname in offers page to check if product exists")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exists(String string) {
	    
		switchWindow();
	    By inputSearch=By.xpath("//input[@type='search']");
	    testContextDI.driver.findElement(inputSearch).sendKeys(string);
	    By vegName=By.cssSelector("tr td:nth-child(1)");
	    offerPageProductName= testContextDI.driver.findElement(vegName).getText();
	    System.out.println(offerPageProductName+" Product Name is Extracted from offers page");
	   
	}
	public OfferPageStepDefinations switchWindow()
	{
		String pageUrl="https://rahulshettyacademy.com/seleniumPractise/#/offers";
		if(testContextDI.driver.getCurrentUrl().equals(pageUrl))
		{
			
		}else
		{
		  String parentWindow=testContextDI.driver.getWindowHandle();
		    testContextDI.driver.findElement(By.linkText("Top Deals")).click();
		    Set<String> totalWindow=testContextDI.driver.getWindowHandles();
		   // driver.switchTo().window(totalWindow[0]);
		    Iterator<String> i1=totalWindow.iterator();
		    i1.next();
		    String childWindow=i1.next();
		    testContextDI.driver.switchTo().window(childWindow);
		}
		//return this;
		return new OfferPageStepDefinations(testContextDI.driver);
	}
	@Then("perform validation in betweenlanding page and offer page result")
	public void perform_validation_in_betweenlanding_page_and_offer_page_result()
	{
		Assert.assertEquals(testContextDI.landingPageProductName, offerPageProductName,"Assertion failed");
		testContextDI.driver.quit();
	}

}
