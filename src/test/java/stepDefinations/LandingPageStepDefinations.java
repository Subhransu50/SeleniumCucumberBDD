package stepDefinations;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utility.TestContextDependancyInjection;

public class LandingPageStepDefinations {
	TestContextDependancyInjection testContextDI;
	public LandingPageStepDefinations(TestContextDependancyInjection testContextDI)
	{
		this.testContextDI=testContextDI;
	}
	
	  By inputSearch=By.xpath("//input[@type='search']");
	  By fruitName=By.cssSelector("h4.product-name");
	  
	
	WebDriverWait wait;
	public WebDriver driver;
	String landingPageProductName;
	String offerPageProductName;
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() throws Exception {
		testContextDI.baseTest.WebDriverManager();
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\panda\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		testContextDI.driver =new ChromeDriver();
		testContextDI.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		wait=new WebDriverWait(testContextDI.driver,30);
		testContextDI.driver.manage().window().maximize();
		testContextDI.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  */
		
	}
	//@When("Usersearched with shortname {string} and extracted actual name of product")
	@When("^Usersearched with shortname (.+) and extracted actual name of product$")
	public void usersearched_with_shortname_and_extracted_actual_name_of_product(String string) throws Exception {
	
		 
		  /* testContextDI.driver.findElement(inputSearch).sendKeys(string);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(fruitName));	 
		   String frt= testContextDI.driver.findElement(fruitName).getText();
		 String[] frtArray=frt.split("-");
		   testContextDI.landingPageProductName=frtArray[0].trim();*/
		
		//LandingPage landingPage=new LandingPage(testContextDI.driver);
		LandingPage landingPage=testContextDI.pageObjectsManager.getLandingPage();
	 String frt= landingPage.searchItem(string)
			 .getProductName();  
	 testContextDI.landingPageProductName=landingPage.extractFruitName(frt);
	   System.out.println(testContextDI.landingPageProductName+" Product Name issss Extracted from home page");
	   
	}
	/*@Then("User searched for {string} shortname in offers page to check if product exists")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exists(String string) {
	    
	    String parentWindow=driver.getWindowHandle();
	    driver.findElement(By.linkText("Top Deals")).click();
	    Set<String> totalWindow=driver.getWindowHandles();
	   // driver.switchTo().window(totalWindow[0]);
	    Iterator<String> i1=totalWindow.iterator();
	    i1.next();
	    String childWindow=i1.next();
	    driver.switchTo().window(childWindow);
	    By inputSearch=By.xpath("//input[@type='search']");
	    driver.findElement(inputSearch).sendKeys(string);
	    By vegName=By.cssSelector("tr td:nth-child(1)");
	    offerPageProductName= driver.findElement(vegName).getText();
	    System.out.println(offerPageProductName+" Product Name is Extracted from offers page");
	    
	}
	@Then("perform validation in betweenlanding page and offer page result")
	public void perform_validation_in_betweenlanding_page_and_offer_page_result()
	{
		Assert.assertEquals(landingPageProductName, offerPageProductName,"Assertion failed");
	    driver.quit();
	}*/

}
