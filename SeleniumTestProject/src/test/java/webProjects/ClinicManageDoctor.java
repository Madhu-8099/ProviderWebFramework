package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClinicManageDoctor {

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
	 WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[4]"));
	 Thread.sleep(2000);
	 ele.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
	 Thread.sleep(2000);
	 WebElement ele1 = driver.findElement(By.xpath("//button[text()='Add Doctor']"));
	 Thread.sleep(2000);
	 ele1.click();
	 driver.findElement(By.xpath("//input[@placeholder='Doctor Name*']")).sendKeys("madhu");
	 driver.findElement(By.xpath("//input[@placeholder='Qualification*']")).sendKeys("mbbs");
	 driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("madhu@gmail.com");
	 WebElement ele2 = driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[2]"));
	 Thread.sleep(2000);
	 ele2.click();
	 Thread.sleep(2000);
	 WebElement ele3 = driver.findElement(By.id("react-select-6-input"));
	 Thread.sleep(2000);
	 ele3.sendKeys("GP");
	 Thread.sleep(2000);
	 driver.findElement(By.className("form-check-input")).click();
	 Thread.sleep(2000);
	 ele2.click();
	 driver.findElement(By.xpath("(//input[@name='fav_language'])[2]")).click();
	 Thread.sleep(2000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,600)");
	 driver.findElement(By.xpath("//input[@placeholder='Enter phone number*']")).sendKeys("1234567890");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]")).click();
	 Thread.sleep(2000);
	 WebElement ele4 = driver.findElement(By.xpath("//div[text()='2019']"));
	 Thread.sleep(2000);
	 ele4.click();
	 driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[5]")).click();
	 Thread.sleep(2000);
	 WebElement ele5 = driver.findElement(By.id("react-select-9-input"));
	 Thread.sleep(2000);
	 ele5.sendKeys("English");
	 Thread.sleep(2000);
	 WebElement ele6 = driver.findElement(By.className("form-check-input"));
	 Thread.sleep(2000);
	 ele6.click();
	 Thread.sleep(2000);
	 ele5.sendKeys("kannada");
	 Thread.sleep(2000);
	 WebElement ele8 = driver.findElement(By.xpath("//input[@class='form-check-input']"));
	 Thread.sleep(2000);
	 ele8.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[5]")).click();
	 Thread.sleep(2000);
	 WebElement ele01 = driver.findElement(By.xpath("(//div[@class='react-switch-bg'])[18]"));
	 Thread.sleep(2000);
	 ele01.click();
	 Thread.sleep(2000);
	 ele01.click();
	WebElement Done = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[13]/div[9]/button[2]"));
	Thread.sleep(2000);
	Done.click();
	Thread.sleep(2000);
	String toasttitle = driver.findElement(By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")).getText();
	 System.out.println("Text of the toast message is: "+toasttitle);
	 Assert.assertEquals(toasttitle, "Doctor added successfully");
	 
	
	}
}
