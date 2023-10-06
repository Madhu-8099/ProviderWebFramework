package webProjects;

import java.awt.Dimension;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartButton {

	public static void main(String[] args) throws InterruptedException {

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
	 Thread.sleep(2000);
	 WebElement ele1 = driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[2]"));
	 Thread.sleep(2000);
	 ele1.click();
	 
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"react-select-8-option-1\"]"));
		Thread.sleep(2000);
		ele4.click();
		WebElement ele5 = driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]"));
		Thread.sleep(2000);
		ele5.click();
		Thread.sleep(2000);
		WebElement ele6 = driver.findElement(By.xpath("//div[text()='Saniya']"));
		ele6.click();
		Thread.sleep(2000);
		WebElement ele8 = driver.findElement(By.xpath("(//i[@class='ri-message-2-line chat'])[1]"));
		Thread.sleep(2000);
		ele8.click();
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("document.body.style.zoom='70%'");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type your message']")).sendKeys("hi");
	
		WebElement ele9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[2]/div/form/footer/div[2]/button/i"));
		Thread.sleep(1000);
		ele9.click();
		WebElement ele7 = driver.findElement(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[4]"));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(ele7));
		Thread.sleep(2000);
		ele7.click();
				

	}

}
