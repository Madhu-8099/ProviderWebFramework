package webProjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Audio 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
	WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver(opt);
	   driver.get("https://myclnq.co/stage/provider/#/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/section/div[1]")).click();
	   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
	   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
	   driver.findElement(By.xpath("//ul/li[@data-flag-key='flag_no_1']/span[text()='India']")).click();
	   driver.findElement(By.xpath("//input[@class='form-control text-control']")).sendKeys("8073798644");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[1]")).sendKeys("7");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[2]")).sendKeys("2");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[3]")).sendKeys("0");
		 driver.findElement(By.xpath("(//input[@class='form-control me-3 otp-input-field'])[4]")).sendKeys("7");
		driver.findElement(By.xpath("//button[@class='btn text-white continue']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[2]"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		ele.click();
		driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
		Thread.sleep(2000);
		 WebElement ele2 = driver.findElement(By.cssSelector(".css-19bb58m"));
		 Thread.sleep(2000);
		 ele2.click();
		 Thread.sleep(2000);
	     List<WebElement> ele3 = driver.findElements(By.cssSelector(".css-1tdpez0-option"));
		 int count1 = ele3.size();
		 for (int i = 0; i < count1; i++)
		 {
			 String text = ele3.get(i).getText();
			 if (text.equalsIgnoreCase("Michela")) 
			 {
				 ele3.get(i).click();
				 break;
			}
		}
		/* List<WebElement> Audio = driver.findElements(By.xpath("//span[contains(text(), 'AUDIO')]"));
		 int count = Audio.size();
		 int i=1; 
			while(i<count)
			{
		    WebElement element = driver.findElement(By.xpath("(//i[@class='ri-phone-line'])[2]"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		    Thread.sleep(2000);
		    element.click();
		    i++;*/
		 List<WebElement> House = driver.findElements(By.xpath("//span[contains(text(),'HOUSE CALL')]"));
		 int count = House.size();
		 int i=1;
		 while(i<count)
		 {
			 WebElement home = driver.findElement(By.xpath("//i[@class='ri-home-line']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", home);
			    Thread.sleep(2000);
			    i++;
	}
	}
}
