package webProjects;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appointmentfullflow 
{
	public static void main(String[] args) throws Throwable
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
		//Appointment Request
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]"));
		Thread.sleep(2000);
		Actions act1=new Actions(driver);
		act1.moveToElement(ele1).build().perform();
		Thread.sleep(2000);
		ele1.click();
		driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
		Thread.sleep(2000);
		 WebElement dropdown = driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]"));
		 Thread.sleep(2000);
		 dropdown.click();
		 Thread.sleep(2000);
		 List<WebElement> options = driver.findElements(By.cssSelector(".css-1tdpez0-option"));
		 int count = options.size();
		 for (int i = 0; i <count ; i++) 
		 {
			 String text = options.get(i).getText();
			 if (text.equalsIgnoreCase("Michela")) 
			 {
				 options.get(i).click();
				 break;
			}
		}
		
		WebElement refresh = driver.findElement(By.xpath("//div[@class='refresh-appointment-list-icon-parent']"));
		Thread.sleep(2000);
		refresh.click();
		Thread.sleep(2000);
		List<WebElement> approve = driver.findElements(By.cssSelector(".appointment-request-btn"));
		int count2 = options.size();
		 for (int i = 0; i <count2 ; i++) 
		 {
			 String text = approve.get(i).getText();
			 if (text.equalsIgnoreCase("Approve")) 
			 {
				 approve.get(i).click();
				 break;
			}
		}
		Thread.sleep(2000);
		WebElement woff = driver.findElement(By.cssSelector(".dialog-btn.dialog-btn-type-bordered"));
		Thread.sleep(2000);
		woff.click();
		Thread.sleep(3000);
		
		//Appointments
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
		 driver.findElement(By.cssSelector(".ri-refresh-line.refresh-appointment-list-icon")).click();
		 Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[9]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
		Thread.sleep(6000);
		 WebElement button = driver.findElement(By.xpath("//button[@class='zm-btn joinWindowBtn btn btn-primary btn-block btn-lg submit zm-btn--default zm-btn__outline--blue']"));
		 Thread.sleep(2000);
		 button.click();
		 WebElement zoom = driver.findElement(By.xpath("//button[@class='zm-btn join-audio-by-voip__join-btn zm-btn--primary zm-btn__outline--white zm-btn--lg']"));
		 Thread.sleep(2000);
		 zoom.click();
		 Thread.sleep(2000);
		 Thread.sleep(2000);
		 WebElement leave = driver.findElement(By.xpath("//div[@class='footer__leave-btn-container']"));
		 Thread.sleep(2000);
		 leave.click();
		 Thread.sleep(2000);
		 WebElement left = driver.findElement(By.xpath("//*[@id=\"wc-footer\"]/div[2]/div[2]/div[3]/div/div/button[1]"));
		 Thread.sleep(2000);
		 left.click();
		 Thread.sleep(2000);
		 WebElement ele9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[2]"));
		 Thread.sleep(2000);
			Actions act2=new Actions(driver);
			act2.moveToElement(ele9).build().perform();
			Thread.sleep(2000);
			ele9.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='dialog-btn dialog-btn-type-filled']")).click();
	}

	}

