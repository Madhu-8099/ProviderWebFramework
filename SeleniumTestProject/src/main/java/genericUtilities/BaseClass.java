package genericUtilities;
import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Loginpage1;
import objectRepositoryDemo.MobileVerificationPage;

public class BaseClass {
   public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	ExcelFileUtility eLib=new ExcelFileUtility();
	JavaUtilities jLib=new JavaUtilities();
	WebDriverUtilities wLib=new WebDriverUtilities();
	PropertyFileUtility pLib=new PropertyFileUtility();

@Parameters("browser")
@BeforeTest
	public void setup() throws Throwable
	{

	if(driver==null) 
	{
	    FileReader fr= new FileReader("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\PropertiesFile\\environment.properties");
	   prop.load(fr);
}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		opt.addArguments("---disable-notifications");
	     driver = new ChromeDriver(opt);
	     driver.get(prop.getProperty("url"));
		}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(new FirefoxProfile());
	options.addPreference("dom.webnotifications.enabled", false);
	WebDriver driver = new FirefoxDriver(options);
	 driver.get(prop.getProperty("url"));
	}
}

/*@AfterTest
		public void closebrowser() {
			driver.close();
			System.out.println("browser close successfully");
	
		
}*/
}
	


