package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositoryDoctorLogin.AppointmentRequestInDD;

import objectRepositoryDoctorLogin.DoctorLoginPage;

public class DoctorLogin1 {

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
	   driver.findElement(By.xpath("(//div[@class='role-box'])[2]")).click();
	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("abcd1234");
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Abcd@1234");
	   driver.findElement(By.xpath("//button[text()='Continue']")).click();
	   Thread.sleep(2000);
	  WebElement details = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[6]"));
	  Thread.sleep(2000);
	  details.click();
	  driver.findElement(By.xpath("//i[@class='ri-menu-line hamburger open-panel nav-toggle']")).click();
	  driver.findElement(By.xpath("//i[@class='ri-close-line hamburger open-panel nav-toggle']")).click();
	  Thread.sleep(2000);
	  WebElement element = driver.findElement(By.xpath("//button[@class='btn btn btn-danger text-white']"));
	  Thread.sleep(2000);
	  element .click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter Current Password']")).sendKeys("Abcd@1234");
	  driver.findElement(By.xpath("//input[@placeholder='Enter New Password']")).sendKeys("Abcd@12345");
	  driver.findElement(By.xpath("//input[@placeholder='Confirm New Password']")).sendKeys("Abcd@12345");
	  WebElement button = driver.findElement(By.xpath("//button[@class='dialog-btn dialog-btn-type-filled']"));
	  Thread.sleep(2000);
	  button.click();
	  WebElement ok = driver.findElement(By.xpath("(//button[@class='dialog-btn dialog-btn-type-filled'])[2]"));
	  Thread.sleep(2000);
	  ok.click();
	}
}
