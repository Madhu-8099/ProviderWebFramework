package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Loginpage1;
import objectRepositoryDemo.MobileVerificationPage;

public class TestFrame2 {

	public static void main(String[] args) throws Throwable
	{
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("---disable-notifications");
	    WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver(opt);
	   driver.get("https://myclnq.co/stage/provider/#/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.linkText("(//div[@class='role-box'])[1]")).click();
	   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
	   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
	}

}
