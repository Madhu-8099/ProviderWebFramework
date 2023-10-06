package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoctorLogin {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
	    WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(opt);
	   driver.get("https://myclnq.co/stage/provider/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/section/div[1]"));
	   Thread.sleep(2000);
	   element.click();
	   WebElement ele2 = driver.findElement(By.xpath("//div[@class='selected-flag']"));
	   Thread.sleep(2000);
	   ele2.click();
	   driver.findElement(By.className("search-box")).sendKeys("india");
	   driver.findElement(By.xpath("//li[@data-flag-key='flag_no_1']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='Enter phone number*']")).sendKeys("8073798644");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[1]")).sendKeys("7");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[2]")).sendKeys("2");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[3]")).sendKeys("0");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[4]")).sendKeys("7");
		 driver.findElement(By.xpath("//button[@class='btn text-white continue']")).click();
		 //Logout
	   WebElement ele = driver.findElement(By.xpath("//i[@class='ri-logout-box-line me-2']"));
	   Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 driver.findElement(By.xpath("//i[@class='ri-logout-box-line me-2']")).click();
		 driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
		 driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
	}
}
