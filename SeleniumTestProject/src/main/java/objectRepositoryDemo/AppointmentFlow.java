package objectRepositoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;


public class AppointmentFlow extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//li/div[2]/div[@title='Appointment']")
	private WebElement AppointmentPage;
	
	@FindBy(xpath="//li/div[2]/div[@title='Appointment']")
	private WebElement Appointment1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	

	public AppointmentFlow(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAppointmentPage()
	{
		return AppointmentPage;
	}
	public WebElement getAppointment1()
	{
		return Appointment1;
	}
	public WebElement getDashboard()
	{
		return Dashboard;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public AppointmentFlow AppointmentPage() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentPage;
		 Thread.sleep(2000);
		 ele.click();
		 return new AppointmentFlow(driver);
	}
	public AppointmentFlow Appointment1() throws InterruptedException
	{
		Thread.sleep(2000);
		Appointment1.click();
		return new AppointmentFlow(driver);
	}
	public AppointmentFlow Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		Dashboard.click();
		return new AppointmentFlow(driver);
	}
	public AppointmentFlow crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new AppointmentFlow(driver);
	}
}
