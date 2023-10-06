package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ProposeNewTimeInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//i[@class='ri-refresh-line refresh-appointment-list-icon']")
	private WebElement refresh;
	
	@FindBy(xpath = "(//button[@class='appointment-request-btn'])[2]")
	private WebElement Proposenewtime;
	
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement calendarDate;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[4]")
	private WebElement hourdropdown;
	
	@FindBy(xpath = "(//div[@class=' css-1tdpez0-option'])[5]")
	private WebElement selectdate;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement Proposebutton;
	
	public ProposeNewTimeInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getProposenewtime()
	{
		return Proposenewtime;
	}
	public WebElement getcalendarDate()
	{
		return calendarDate;
	}
	public WebElement gethourdropdown()
	{
		return hourdropdown;
	}
	public WebElement getselectdate()
	{
		return selectdate;
	}
	public WebElement getProposebutton()
	{
		return Proposebutton;
	}
	public ProposeNewTimeInDL refreshbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement icon = refresh;
		Thread.sleep(2000);
		icon.click();
		return new ProposeNewTimeInDL(driver);
	}
	public ProposeNewTimeInDL proposenewtime() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement pnt = Proposenewtime;
		 Thread.sleep(2000);
		 pnt.click();
		 return new ProposeNewTimeInDL(driver);
	}
	public ProposeNewTimeInDL Datewidget(String date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date2 = calendarDate;
		Thread.sleep(2000);
		date2.sendKeys(date);
		return new ProposeNewTimeInDL(driver);
	}
	public ProposeNewTimeInDL Hourdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hr = hourdropdown;
		Thread.sleep(2000);
		hr.click();
		return new ProposeNewTimeInDL(driver);
	}
	public ProposeNewTimeInDL selectHRdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement selecthr = selectdate;
		Thread.sleep(2000);
		selecthr.click();
		return new ProposeNewTimeInDL(driver);
	}
	public ProposeNewTimeInDL proposebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement pop = Proposebutton;
		Thread.sleep(2000);
		pop.click();
		return new ProposeNewTimeInDL(driver);
	}
	
}
