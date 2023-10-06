package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClinicReportsPage {

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
	 WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[5]"));
	 Thread.sleep(2000);
	 ele.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
	 Thread.sleep(2000);
	/* WebElement elemenet5 = driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]"));
	 Thread.sleep(2000);
	 elemenet5.click();
	 driver.findElement(By.id("react-select-6-option-0")).click();
	 Thread.sleep(2000);
	 elemenet5.click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("react-select-6-option-1")).click();
	 Thread.sleep(2000);
	 elemenet5.click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("react-select-6-option-2")).click();
	 Thread.sleep(2000);
	 elemenet5.click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("react-select-6-option-3")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@class='form-control generate-text'])[1]")).sendKeys("09042023");
	 Thread.sleep(2000);
	 WebElement button = driver.findElement(By.className("dialog-footer"));
	 Thread.sleep(2000);
	 button.click();*/
	 //JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.body.style.zoom='75%'");
	 Thread.sleep(2000);
	 WebElement view = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div[1]"));
	 Thread.sleep(2000);
	 view.click();
	}
}
