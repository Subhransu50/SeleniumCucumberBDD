package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
public WebDriver driver;
WebDriverWait wait;
	public LandingPage(WebDriver driver)
	{
		
		this.driver=driver;
		wait=new WebDriverWait(this.driver,30);
	}
	
	
	private  By inputSearch=By.xpath("//input[@type='search']");
	private By fruitName=By.cssSelector("h4.product-name");
	private By topDeals=By.linkText("Top Deals");
	 
	public LandingPage searchItem(String itemaName) throws Exception
	{
		driver.findElement(inputSearch).sendKeys(itemaName);
		Thread.sleep(3000);
		return new LandingPage(driver);
	}
	public String getProductName() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(fruitName));
		String fName=driver.findElement(fruitName).getText();
		return fName;
	}
	public String extractFruitName(String fruitName)
	{
		String[] frtArray=fruitName.split("-");
		String fName=frtArray[0].trim();
		return fName;
	}
	public LandingPage clickTopDeals()
	{
		driver.findElement(topDeals).click();
		return new LandingPage(driver);
	}
	
}
