package objectRepositoryDoctorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class CreateAppointmentsPage extends BaseClass
{
	public WebDriver driver;
	@FindBy(className = "appointment-card-filter-view-col-2-create-btn-view")
	private WebElement CreateAppointmentButton;
	
	@FindBy(id = "react-select-10-input")
	private WebElement PhoneNumber;
	
	@FindBy(xpath = " //div[@class=' css-a6qsyf-option']")
	private WebElement clickphonenumber;
	
	@FindBy(xpath = "//input[@placeholder='First Name*']")
	private WebElement Firstname;
	
	@FindBy(xpath = "//input[@placeholder='Last Name*']")
	private WebElement Lastname;
	
	@FindBy(xpath = "//div[@class='d-flex align-items-center me-2']")
	private WebElement Genderbutton;
	
	@FindBy(xpath = "//input[@placeholder='Address (Optional)']")
	private WebElement Address;
	
	@FindBy(xpath = "(//div[@class='symptom-common symptom-inactive'])[2]")
	private WebElement BackPain;
	
	@FindBy(xpath = "(//div[@class='symptom-common symptom-inactive'])[9]")
	private WebElement Fever;
	
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement Widget;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[5]")
	private WebElement Hourdropdown;
	
	@FindBy(id = "react-select-14-option-11")
	private WebElement selecthour;
	
	@FindBy(xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[6]")
	private WebElement Minutedropdown;
	
	@FindBy(xpath = "//div[@id='react-select-12-option-5']")
	private WebElement selectminute;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement Appointmentmessage;
	
	public CreateAppointmentsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateAppointmentButton()
	{
		return CreateAppointmentButton;
	}
	public WebElement getPhoneNumber()
	{
		return PhoneNumber;
	}
	public WebElement getclickphonenumber()
	{
		return clickphonenumber;
	}
	public WebElement getFirstname()
	{
		return Firstname;
	}
	public WebElement getLaststname()
	{
		return  Lastname;
	}
	public WebElement getGenderbutton()
	{
		return Genderbutton;
	}
	public WebElement getAddress()
	{
		return Address;
	}
	public WebElement getBackPain()
	{
		return BackPain;
	}
	public WebElement getFever()
	{
		return Fever;
	}
	public WebElement getWidget()
	{
		return Widget;
	}
	public WebElement getHourdropdown()
	{
		return Hourdropdown;
	}
	public WebElement getselecthour()
	{
		return selecthour;
	}
	public WebElement getMinutedropdown()
	{
		return Minutedropdown;
	}
	public WebElement getselectminute()
	{
		return selectminute;
	}
	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}
	public WebElement getAppointmentmessage()
	{
		return Appointmentmessage;
	}
	public CreateAppointmentsPage createAppointment() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element1 = CreateAppointmentButton;
		Thread.sleep(2000);
		element1.click();
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage SendNumber(String Ph_No) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Num = PhoneNumber;
		Thread.sleep(2000);
		Num.sendKeys(Ph_No);
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage clickPhoneNumber() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement click = clickphonenumber;
		Thread.sleep(2000);
		clickphonenumber.click();
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage firstname(String First_Name) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement FM = Firstname;
		Thread.sleep(2000);
		FM.sendKeys(First_Name);
		
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage lastname(String Last_Name1) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement LM = Lastname;
		Thread.sleep(2000);
		LM.sendKeys(Last_Name1);
	
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage genderdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Gb = Genderbutton;
		Thread.sleep(2000);
		Gb.click();
		Thread.sleep(2000);
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage addressfield(String address) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement add = Address;
		Thread.sleep(2000);
		add.sendKeys(address);
		
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage Symptoms() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement bp = BackPain;
		Thread.sleep(2000);
		bp.click();
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage Symptoms1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement fv = Fever;
		Thread.sleep(2000);
		fv.click();
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage datewidget(String date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date1 = Widget;
		Thread.sleep(2000);
		date1.sendKeys(date);
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage hourdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hr = Hourdropdown;
		Thread.sleep(2000);
		hr.click();
		Thread.sleep(2000);
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage selecthour() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hr = selecthour;
		Thread.sleep(2000);
		hr.click();
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage minutedropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement min =  Minutedropdown;
		Thread.sleep(2000);
		min.click();
		Thread.sleep(2000);
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage selectminute() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement min =  selectminute;
		Thread.sleep(2000);
		min.click();
		Thread.sleep(2000);
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage Submitbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement sub =  SubmitButton;
		Thread.sleep(2000);
		sub.click();
		return new CreateAppointmentsPage(driver);
	}
	public CreateAppointmentsPage captureMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String appointment = Appointmentmessage.getText();
		System.out.println("Confirmation message is: "+appointment);
		 Assert.assertEquals(appointment, "Appointment created successfully");
		return new CreateAppointmentsPage(driver);
		 
	}
}
