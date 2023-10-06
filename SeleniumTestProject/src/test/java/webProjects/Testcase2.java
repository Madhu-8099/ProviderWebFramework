package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import genericUtilities.BaseClass;

public class Testcase2 extends BaseClass{

	public static void main(String[] args)
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
		 WebDriver driver = new ChromeDriver(opt);
		 driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='role-box'])[1]")).click();
		   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
		   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
		   driver.findElement(By.xpath("//ul/li[@data-flag-key='flag_no_1']/span[text()='India']")).click();
		   driver.findElement(By.xpath("//input[@class='form-control text-control']")).sendKeys("phoneNumber");

	}
}
