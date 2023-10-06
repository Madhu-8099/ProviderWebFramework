package webProjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProviderWeb2 {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
	    WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(opt);
	   driver.get("https://myclnq.co/stage/provider/#/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("(//div[@class='role-box'])[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
	   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
	   driver.findElement(By.xpath("//ul/li[@data-flag-key='flag_no_1']/span[text()='India']")).click();
	   driver.findElement(By.xpath("//input[@class='form-control text-control']")).sendKeys("8073798644");
	 driver.findElement(By.xpath("//button[@class='btn text-white continue ml-3 mt-2']")).click();
	 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[1]")).sendKeys("7");
	 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[2]")).sendKeys("2");
	 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[3]")).sendKeys("0");
	 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[4]")).sendKeys("7");
	 driver.findElement(By.xpath("//button[@class='btn text-white continue']")).click();
	 WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[2]"));
	 Thread.sleep(2000);
	 ele.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
	 Thread.sleep(2000);
	 //List<WebElement> element = driver.findElements(By.cssSelector(".call-btn.call-btn-start"));
	 //int count = element.size();
	// for (int i = 0; i < count; i++) 
	 //{}
			Thread.sleep(2000);
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			//WebElement note = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[17]")));
			WebElement note = driver.findElement(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[16]"));
			 Thread.sleep(2000);
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", note);
		 Thread.sleep(2000);
		// break;
		
	 
		
	

	} 
}

