package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proposenewtime 
{
	public WebDriver driver;
	@FindBy(xpath = "//button[text()='Propose New Time']")
	private WebElement propsenew;
	
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement date;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[4]")
	private WebElement hourdropdown;
	
	@FindBy(xpath = "(//div[@class=' css-1tdpez0-option'])[5]")
	private WebElement selecthour;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement proposebutton;
	
	public Proposenewtime(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getpropsenew()
	{
		return propsenew;
	}
	public WebElement getdate()
	{
		return date;
	}
	public WebElement gethourdropdown()
	{
		return hourdropdown;
	}
	public WebElement getselecthour()
	{
		return selecthour;
	}
	public WebElement getproposebutton()
	{
		return proposebutton;
	}
	public Proposenewtime ClickPropose() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement prop = propsenew;
		Thread.sleep(2000);
		prop.click();
		return new Proposenewtime(driver);
	}
	public Proposenewtime sendDate(String Date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement senddate = date;
		Thread.sleep(2000);
		senddate.sendKeys(Date);
		return new Proposenewtime(driver);
	}
	public Proposenewtime clickhrdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hr = hourdropdown;
		Thread.sleep(2000);
		hr.click();
		return new Proposenewtime(driver);
	}
	public Proposenewtime selectHR() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement selecthr = selecthour;
		Thread.sleep(2000);
		selecthr.click();
		return new Proposenewtime(driver);
	}
	public Proposenewtime clickProposeButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement pnt = proposebutton;
		Thread.sleep(2000);
		pnt.click();
		return new Proposenewtime(driver);
	}
}
