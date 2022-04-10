package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	
	WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	
	public PageObjectsManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	public OffersPage getOfferPage()
	{
		offersPage=new OffersPage(driver);
		return offersPage;
	}
}
