package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AppointmentRequestTabInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentReq;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentReq1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public AppointmentRequestTabInDL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAppointmentReq()
	{
		return AppointmentReq;
	}
	public WebElement getAppointmentReq1()
	{
		return AppointmentReq1;
	}
	public WebElement getHamurger()
	{
		return Hamurger;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public AppointmentRequestTabInDL AppointmentRequest() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentReq;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new AppointmentRequestTabInDL(driver);
	}
	public AppointmentRequestTabInDL AppointmentRequest1() throws InterruptedException
	{
		Thread.sleep(2000);
		AppointmentReq1.click();
		return new AppointmentRequestTabInDL(driver);
	}
	public AppointmentRequestTabInDL Hamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamurger.click();
		return new AppointmentRequestTabInDL(driver);
	}
	public AppointmentRequestTabInDL CrossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new AppointmentRequestTabInDL(driver);
	}
}
