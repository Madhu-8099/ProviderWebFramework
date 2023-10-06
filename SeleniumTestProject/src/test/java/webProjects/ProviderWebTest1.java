package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProviderWebTest1 {

	public static void main(String[] args) { 
		String url="https://www.amazon.in/";
		WebDriver driver;
	   driver =new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rolex watches");
	   driver.findElement(By.id("nav-search-submit-button")).click();
	   
	}

}
