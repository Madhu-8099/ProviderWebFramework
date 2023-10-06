package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToastMessage 
{
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
 String toasttitle = driver.findElement(By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")).getText();
 System.out.println("Text of the toast message is: "+toasttitle);
 Assert.assertEquals(toasttitle, "OTP sent!");
 
 
}
}
