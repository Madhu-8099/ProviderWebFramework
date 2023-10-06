package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AppointmentInCR extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//i[@class='ri-filter-3-line table-filter-icon'])[1]")
	private WebElement View;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[1]")
	private WebElement All;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[2]")
	private WebElement Age;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[3]")
	private WebElement Symptoms;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[4]")
	private WebElement Doctor;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[5]")
	private WebElement Type;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[6]")
	private WebElement ConsultType;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[7]")
	private WebElement Status;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[8]")
	private WebElement Consult_Fee;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[9]")
	private WebElement Schedule;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[10]")
	private WebElement PhoneNumber;
	
	@FindBy(className = "table-filter-btn okay-btn")
	private WebElement Okay;

	
	public AppointmentInCR(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getView()
	{
		return View;
	}
	public WebElement getAll()
	{
		return All;
	}
	public WebElement getAge()
	{
		return Age;
	}
	public WebElement getSymptoms()
	{
		return Symptoms;
	}
	public WebElement getDoctor()
	{
		return Doctor;
	}
	public WebElement getType()
	{
		return Type;
	}
	public WebElement getConsultType()
	{
		return ConsultType;
	}
	public WebElement getStatus()
	{
		return Status;
	}
	public WebElement getConsult_Fee()
	{
		return Consult_Fee;
	}
	public WebElement getSchedule()
	{
		return Schedule;
	}
	public WebElement getPhoneNumber()
	{
		return PhoneNumber;
	}
	public WebElement getOkay()
	{
		return Okay;
	}
	public AppointmentInCR View1() throws InterruptedException
	{
		Thread.sleep(2000);
		View.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR All1() throws InterruptedException
	{
		Thread.sleep(2000);
		All.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Age1() throws InterruptedException
	{
		Thread.sleep(2000);
		Age.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Symptoms1() throws InterruptedException
	{
		Thread.sleep(2000);
		Symptoms.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Doctor1() throws InterruptedException
	{
		Thread.sleep(2000);
		Doctor.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Type1() throws InterruptedException
	{
		Thread.sleep(2000);
		Type.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR ConsultType1() throws InterruptedException
	{
		Thread.sleep(2000);
		ConsultType.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Status1() throws InterruptedException
	{
		Thread.sleep(2000);
		Status.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Consult_Fee1() throws InterruptedException
	{
		Thread.sleep(2000);
		Consult_Fee.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR Schedule1() throws InterruptedException
	{
		Thread.sleep(2000);
		Schedule.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	public AppointmentInCR PhoneNumber1() throws InterruptedException
	{
		Thread.sleep(2000);
		PhoneNumber.click();
		Thread.sleep(2000);
		Okay.click();
		Thread.sleep(2000);
		return new AppointmentInCR(driver);
	}
	
}
