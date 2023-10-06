package objectRepositoryDoctorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentsInDL 
{
	public WebDriver driver;
	@FindBy(xpath = "//th[@class='col-6 dashboard-appointment']")
	private WebElement AppointmentTab;
	
	@FindBy(xpath = "//i[@class='ri-filter-3-fill appointment-filter me-3']")
	private WebElement PatientFilter;
	
	@FindBy(xpath = "(//input[@class='appointment-checkbox'])[1]")
	private WebElement AllButton;
	
	@FindBy(xpath = "(//input[@class='appointment-checkbox'])[2]")
	private WebElement VideoButton;
	
	@FindBy(xpath = "(//input[@class='appointment-checkbox'])[3]")
	private WebElement AudioButton;
	
	@FindBy(xpath = "(//input[@class='appointment-checkbox'])[4]")
	private WebElement HouseButton;
	
	@FindBy(xpath = "//button[@class='appointment-filter-btn appointment-ok-btn']")
	private WebElement OkayButton;
	
	public  AppointmentsInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAppointmentTab()
	{
		return AppointmentTab;
	}
	public WebElement getPatientFilter()
	{
		return PatientFilter;
	}
	public WebElement getAllButton()
	{
		return AllButton;
	}
	public WebElement getVideoButton()
	{
		return VideoButton;
	}
	public WebElement getAudioButton()
	{
		return AudioButton;
	}
	public WebElement getHouseButton()
	{
		return HouseButton;
	}
	public WebElement getOkayButton()
	{
		return OkayButton;
	}
	public AppointmentsInDL AppointmentTabA() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement app = AppointmentTab;
		Thread.sleep(2000);
		app.click();
		Thread.sleep(2000);
		return new AppointmentsInDL(driver);
	}
	public AppointmentRequestInDD PatientFilterA() throws InterruptedException
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
	public AppointmentRequestInDD AllButtonA() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement all = AllButton;
		Thread.sleep(2000);
		all.click();
		Thread.sleep(2000);
		OkayButton.click();
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
		WebElement all = AllButton;
		Thread.sleep(2000);
		all.click();
		Thread.sleep(2000);
		WebElement video = VideoButton;
		Thread.sleep(2000);
		video .click();
		Thread.sleep(2000);
		OkayButton.click();
		return new AppointmentRequestInDD(driver);
	}
	public AppointmentRequestInDD AudioButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement patient = PatientFilter;
		Thread.sleep(2000);
		patient.click();
		Thread.sleep(2000);
		WebElement video = VideoButton;
		Thread.sleep(2000);
		video .click();
		Thread.sleep(2000);
		WebElement audio = AudioButton;
		Thread.sleep(2000);
		audio.click();
		Thread.sleep(2000);
		OkayButton.click();
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
		WebElement audio =  AudioButton;
		Thread.sleep(2000);
		audio.click();
		Thread.sleep(2000);
		WebElement house = HouseButton;
		Thread.sleep(2000);
		house.click();
		Thread.sleep(2000);
		OkayButton.click();
		return new AppointmentRequestInDD(driver);
	}
}
