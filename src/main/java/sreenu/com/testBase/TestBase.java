package sreenu.com.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class TestBase {
	public WebDriver driver;
	
	
	public void launchBrowser(String browser)
	{
		if(System.getProperty("os.name").contains("Windows"))
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			    driver=new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			    driver=new ChromeDriver();
			}
		}
	}
	@BeforeTest
	public void getBrowser()
	{
		launchBrowser("firefox");
	}
	public void getApplicationUrl()
	{
		driver.get("https://www.google.com/");
	}

}
