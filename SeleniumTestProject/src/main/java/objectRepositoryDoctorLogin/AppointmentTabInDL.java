package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;
import objectRepository.AppointmentRequestPage;

public class AppointmentTabInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[2]")
	private WebElement Appointments;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[2]")
	private WebElement Appointment1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public AppointmentTabInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAppointments()
	{
		return Appointments;
	}
	public WebElement getAppointment1()
	{
		return Appointment1;
	}
	public WebElement getHamurger()
	{
		return Hamurger;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public AppointmentTabInDL AppointmentsTab() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = Appointments;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new AppointmentTabInDL(driver);
	}
	public AppointmentTabInDL Appoinments() throws InterruptedException
	{
		Thread.sleep(2000);
		Appointment1.click();
		 return new AppointmentTabInDL(driver);
	}
	public AppointmentTabInDL Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new AppointmentTabInDL(driver);
	}
	public AppointmentTabInDL crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new AppointmentTabInDL(driver);
	}
}
