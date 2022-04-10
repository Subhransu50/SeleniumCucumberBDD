package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OffersPage {
WebDriver driver;
WebDriverWait wait;
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(this.driver,30);
	}
	private  By inputSearch=By.xpath("//input[@type='search']");
	private  By vegName=By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem(String fName)
	{
		 wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearch));
		 driver.findElement(inputSearch).sendKeys(fName);
		
	}
	  public String getProductFromOffersPage()
	  {
		    /*driver.findElement(inputSearch).sendKeys(fName);
		    String fruitName= driver.findElement(vegName).getText();
		    return fruitName;*/
		  wait.until(ExpectedConditions.visibilityOfElementLocated(vegName));
		  String ok=driver.findElement(vegName).getText();
		  System.out.println("Found "+ok);
		  return driver.findElement(vegName).getText();
	  }
}
