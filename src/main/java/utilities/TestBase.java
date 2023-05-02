package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		try 
		{
		FileInputStream f = new FileInputStream("C:\\QA\\SeleniumWorkSpace\\CucumberPomOrangeHRM\\src\\main\\java\\config\\data.properties");
		 prop = new Properties();
		
		prop.load(f);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public static void initialization() throws IOException
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumWorkSpace\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumWorkSpace\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			driver = new ChromeDriver(options);
			
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(util.loadtime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(util.implicitwait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
}


