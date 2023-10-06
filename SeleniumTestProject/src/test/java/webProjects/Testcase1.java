package webProjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import genericUtilities.BaseClass;

public class Testcase1 extends BaseClass{

	@Test
	public static void Test() throws Throwable 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Clinic Admin']")).click();
		
		   driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
		   driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("india");
		   driver.findElement(By.xpath("//ul/li[@data-flag-key='flag_no_1']/span[text()='India']")).click();
		   driver.findElement(By.xpath("//input[@class='form-control text-control']")).sendKeys("phoneNumber");
	}
}
