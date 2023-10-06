package objectRepositoryDoctorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AppointmentRequestInDD extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//i[@class='appointment-request-filter ri-filter-3-fill me-3']")
	private WebElement PatientFilter;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[1]")
	private WebElement All_button;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[2]")
	private WebElement Video_Call;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[3]")
	private WebElement Audio_Call;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[4]")
	private WebElement House_Call;
	
	@FindBy(xpath = "//button[@class='table-filter-btn okay-btn']")
	private WebElement Okay_button;
	
	public AppointmentRequestInDD(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPatientFilter()
	{
		return PatientFilter;
	}
	public WebElement getAll_button()
	{
		return All_button;
	}
	public WebElement getVideo_Call()
	{
		return Video_Call;
	}
	public WebElement getAudio_Call()
	{
		return Audio_Call;
	}
	public WebElement getHouse_Call()
	{
		return House_Call;
	}
	public WebElement getOkay_button()
	{
		return Okay_button;
	}
	public AppointmentRequestInDD PatientFilter1() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		WebElement patient = PatientFilter;
		Thread.sleep(2000);
		patient.click();
		Thread.sleep(2000);
		return new AppointmentRequestInDD(driver);
	}
	public AppointmentRequestInDD AllButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement all = All_button;
		Thread.sleep(2000);
		all.click();
		Thread.sleep(2000);
		Okay_button.click();
		Thread.sleep(2000);
		return new AppointmentRequestInDD(driver);
	}
	public AppointmentRequestInDD VideoCallButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement patient = PatientFilter;
		Thread.sleep(2000);
		patient.click();
		Thread.sleep(2000);
		WebElement all = All_button;
		Thread.sleep(2000);
		all.click();
		Thread.sleep(2000);
		WebElement video = Video_Call;
		Thread.sleep(2000);
		video .click();
		Thread.sleep(2000);
		Okay_button.click();
		return new AppointmentRequestInDD(driver);
	}
	public AppointmentRequestInDD AudioButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement patient = PatientFilter;
		Thread.sleep(2000);
		patient.click();
		Thread.sleep(2000);
		WebElement video = Video_Call;
		Thread.sleep(2000);
		video .click();
		Thread.sleep(2000);
		WebElement audio = Audio_Call;
		Thread.sleep(2000);
		audio.click();
		Thread.sleep(2000);
		Okay_button.click();
		return new AppointmentRequestInDD(driver);
	}
	public AppointmentRequestInDD House_Call() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement patient = PatientFilter;
		Thread.sleep(2000);
		patient.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement audio = Audio_Call;
		Thread.sleep(2000);
		audio.click();
		Thread.sleep(2000);
		WebElement house = House_Call;
		Thread.sleep(2000);
		house.click();
		Thread.sleep(2000);
		Okay_button.click();
		return new AppointmentRequestInDD(driver);
	}
}
