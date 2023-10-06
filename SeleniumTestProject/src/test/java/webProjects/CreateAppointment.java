package webProjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAppointment {

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
	 WebElement ele = driver.findElement(By.xpath("//li/div[2]/div[@title='Appointment']"));
	 Thread.sleep(2000);
	 ele.click();
	 driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
	 driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
	 driver.findElement(By.xpath("//button[text()='Create appointment']")).click();
	 driver.findElement(By.id("react-select-11-input")).click();
	 WebElement ele1 = driver.findElement(By.xpath("(//div[@class=' css-a6qsyf-option'])[3]"));
	 Thread.sleep(2000);
	 ele1.click();
	 driver.findElement(By.id("react-select-12-input")).sendKeys("1234567898");
	 driver.findElement(By.id("react-select-12-option-0")).click();
	 driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys("madhu");
	 driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys("H B");
	 Thread.sleep(2000);
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("document.body.style.zoom='85%'");
	Thread.sleep(3000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,800)");
	 Thread.sleep(2000);
	 //JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		//jse2.executeScript("document.body.style.zoom='80%'");
		//Thread.sleep(2000);
	
		/*WebElement btn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebDriverWait wait=new WebDriverWait(driver,  Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		Thread.sleep(2000);
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
	 hread.sleep(2000);
	 WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("dialog-btn dialog-btn-type-filled")));
	 Thread.sleep(2000);
	 element.click();*/
	 
	}
}
