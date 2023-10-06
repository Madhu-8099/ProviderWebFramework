package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentsPage 
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
	

	public AppointmentsPage(WebDriver driver)
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
	public AppointmentsPage AppointmentPage() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentPage;
		 Thread.sleep(2000);
		 ele.click();
		 return new AppointmentsPage(driver);
	}
	public AppointmentsPage Appointment1() throws InterruptedException
	{
		Thread.sleep(2000);
		Appointment1.click();
		return new AppointmentsPage(driver);
	}
	public AppointmentsPage Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		Dashboard.click();
		return new AppointmentsPage(driver);
	}
	public AppointmentsPage crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new AppointmentsPage(driver);
	}
}
