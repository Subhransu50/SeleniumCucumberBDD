package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

		public WebDriver driver;
		WebDriverWait wait;
		Properties prop;
		FileInputStream fis;
	public WebDriver WebDriverManager() throws Exception
	{
		if(driver==null)
		{
		prop=new Properties();
		fis=new FileInputStream("E:\\Automation\\SeleniumCloudCucumber\\src\\test\\resources\\AppConfig.properties");
		prop.load(fis);	
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumCloudCucumber\\src\\test\\resources\\Chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Automation\\SeleniumCloudCucumber\\src\\test\\resources\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));		
		wait=new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		return driver;
	  
	}
	
	
	
}
