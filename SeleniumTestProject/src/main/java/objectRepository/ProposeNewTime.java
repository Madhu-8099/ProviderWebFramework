package objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProposeNewTime 
{

	public WebDriver driver;
	@FindBy(css = ".refresh-appointment-list-icon-parent")
	private WebElement refresh;
	
	@FindBy(xpath = "//button[text()='Propose New Time']")
	private WebElement proposenewtime;
	
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement calendar;
	
	@FindBy(className  = "dialog-btn dialog-btn-type-filled")
	private WebElement propose;
	
	
	public ProposeNewTime(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, driver2);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getproposenewtime()
	{
		return proposenewtime;
	}
	public WebElement getcalendar()
	{
		return calendar;
	}
	public WebElement getpropose()
	{
		return propose;
	}
	public ProposeNewTime clickrefresh() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new ProposeNewTime(driver);
	}
	
	public ProposeNewTime propose() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = proposenewtime;
		Thread.sleep(2000);
		proposenewtime.click();
		return new ProposeNewTime(driver);
	}
	public ProposeNewTime Calendarwidget(String Date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date = calendar;
		Thread.sleep(2000);
		date.sendKeys(Date);
		return new ProposeNewTime(driver);
	}
	public ProposeNewTime clickpropose() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement prop = propose;
		Thread.sleep(2000);
		prop.click();
		return new ProposeNewTime(driver);
	}
	
}
