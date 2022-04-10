package utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTestCommonUtility {
	public WebDriver driver;
	WebDriverWait wait;
	public WebDriverTestCommonUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SwitchWindow()
	{
		Set<String> totalWindow=driver.getWindowHandles();
		   // driver.switchTo().window(totalWindow[0]);
		    Iterator<String> i1=totalWindow.iterator();
		    i1.next();
		    String childWindow=i1.next();
		    driver.switchTo().window(childWindow);
	  
	}
	
}
