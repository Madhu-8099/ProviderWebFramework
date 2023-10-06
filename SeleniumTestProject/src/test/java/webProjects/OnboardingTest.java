package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnboardingTest {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
	
	  WebDriver driver = new ChromeDriver(opt);
	   driver.get("https://myclnq.co/stage/provider/#/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("(//div[@class='role-box'])[1]")).click();
	   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
	   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
	   driver.findElement(By.xpath("//ul/li[@data-flag-key='flag_no_1']/span[text()='India']")).click();
	   driver.findElement(By.xpath("//input[@class='form-control text-control']")).sendKeys("8073798644");
	   driver.findElement(By.xpath("//span[text()='Onboard your clinic']")).click();
	   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
	   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
	   driver.findElement(By.xpath("//ul/li[@data-flag-key='flag_no_1']/span[text()='India']")).click();
	   driver.findElement(By.xpath("//input[@class='form-control text-control']")).sendKeys("3989049076");
	   driver.findElement(By.xpath("(//input[@class='form-control text-control'])[2]")).sendKeys("xqzz0e@gmail.com");
	   driver.findElement(By.xpath("//div/button[text()='Get OTP']")).click();
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[1]")).sendKeys("7");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[2]")).sendKeys("2");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[3]")).sendKeys("0");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[4]")).sendKeys("7");
		driver.findElement(By.xpath("//button[@class='btn text-white continue']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Clinic Name*']")).sendKeys("madhu");
		driver.findElement(By.xpath("//input[@placeholder='Hospital Registration Number*']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@placeholder='Enter phone number*']")).sendKeys("8105546731");
		driver.findElement(By.xpath("//input[@placeholder='Clinic Address*']")).sendKeys("Arekere");
		driver.findElement(By.xpath("//input[@placeholder='Zip Code*']")).sendKeys("560076");
		Thread.sleep(2000);
	     WebElement ele = driver.findElement(By.id("react-select-3-input"));
	     
	    ele.sendKeys("Bangalore");
	    Thread.sleep(1000);
	    
	    Actions keyDown = new Actions(driver);
	    keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	}

}
