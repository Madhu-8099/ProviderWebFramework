package commonActions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.PropertyFileUtilities;

public class CommonActions
{
	public WebDriver driver;

public static WebDriver startBrowser(WebDriver driver) throws IOException {
if(PropertyFileUtilities.getvalueForKey("browser").equalsIgnoreCase("chrome")){
	driver=new ChromeDriver();
}
else if(PropertyFileUtilities.getvalueForKey("browser").equalsIgnoreCase("Firefox")) {
	driver=new FirefoxDriver();
}
return driver;
}
public static WebDriver openMyCLNQApplication(WebDriver driver) throws IOException {
	driver.manage().window().maximize();
	driver.get(PropertyFileUtilities.getvalueForKey("url"));
	return driver;
}


}
