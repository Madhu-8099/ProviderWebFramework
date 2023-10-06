package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentInDashboard 
{
	public WebDriver driver;
	@FindBy(xpath="//span[text()='Appointments']")
	private WebElement Appointment;
	
	@FindBy(xpath="//i[@class='ri-filter-3-fill appointment-filter me-3']")
	private WebElement Patient_btn;
	
	@FindBy(xpath="(//input[@class='appointment-checkbox'])[1]")
	private WebElement All_btn;
	
	@FindBy(xpath="(//input[@class='appointment-checkbox'])[2]")
	private WebElement Video_btn;
	
	@FindBy(xpath="(//input[@class='appointment-checkbox'])[3]")
	private WebElement Audio_btn;
	
	@FindBy(xpath="(//input[@class='appointment-checkbox'])[4]")
	private WebElement House_call;
	
	@FindBy(xpath="//button[text()='Okay']")
	private WebElement Okay_btn;
	
	public AppointmentInDashboard(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAppointment()
	{
		return Appointment;
	}
	public WebElement getPatient_btn()
	{
		return Patient_btn;
	}
	public WebElement getAll_btn()
	{
		return All_btn;
	}
	public WebElement getVideo_btn()
	{
		return Video_btn;
	}
	public WebElement getAudio_btn()
	{
		return Audio_btn;
	}
	public WebElement getHouse_call()
	{
		return House_call;
	}
	public WebElement getOkay_btn()
	{
		return Okay_btn;
	}
	public AppointmentInDashboard Appointment() throws InterruptedException
	{
		Thread.sleep(2000);
		 Appointment.click();
		 return new AppointmentInDashboard(driver);
	}
	public AppointmentInDashboard Patient_btn() throws InterruptedException
	{
		
	    	Thread.sleep(2000);
			WebElement ele = Patient_btn;
			Thread.sleep(2000);
			ele.click();
			return new AppointmentInDashboard(driver);
		}
		public AppointmentInDashboard All_btn() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement ele1 =All_btn;
			Thread.sleep(1000);
			ele1.click();
			Thread.sleep(1000);
			Okay_btn.click();
			return new AppointmentInDashboard(driver);
		}
		public AppointmentInDashboard Video_btn() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement ele = Patient_btn;
			Thread.sleep(2000);
			ele.click();
			WebElement ele1 = All_btn;
			Thread.sleep(1000);
			ele1.click();
			Thread.sleep(2000);
			WebElement ele2 = Video_btn;
			Thread.sleep(1000);
			ele2.click();
			Thread.sleep(1000);
			Okay_btn.click();
			return new AppointmentInDashboard(driver);
		}
		public AppointmentInDashboard Audio_btn() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement ele = Patient_btn;
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			WebElement ele2 = Video_btn;
			Thread.sleep(1000);
			ele2.click();
			Thread.sleep(2000);
			WebElement ele3 = Audio_btn;
			Thread.sleep(1000);
			ele3.click();
			Thread.sleep(1000);
			Okay_btn.click();
			return new AppointmentInDashboard(driver);
		}
		public AppointmentInDashboard House_call() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement ele = Patient_btn;
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			WebElement ele3 = Audio_btn;
			Thread.sleep(1000);
			ele3.click();
			Thread.sleep(2000);
			WebElement ele4 = House_call;
			Thread.sleep(1000);
			ele4.click();
			Thread.sleep(1000);
			Okay_btn.click();
			return new AppointmentInDashboard(driver);
		}
		
	}

