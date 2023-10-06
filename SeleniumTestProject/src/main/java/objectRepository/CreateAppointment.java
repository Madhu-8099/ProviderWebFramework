package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;

public class CreateAppointment extends BaseClass
{

	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/button")
	private WebElement Create_Appointment_btn;
	
	@FindBy(xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[4]")
	private WebElement clickdropdown;
	
	@FindBy(css = ".css-a6qsyf-option")
	private List<WebElement> doctorlist;
	
	@FindBy(id = "react-select-12-input")
	private WebElement clickNodropdown;
	
	@FindBy(id = "react-select-12-option-0")
	private WebElement clickno;
	
	@FindBy(xpath = "//input[@placeholder='First Name*']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name*']")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> gender;
	
	@FindBy(css = ".symptom-common.symptom-inactive")
	private List<WebElement> symptoms;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[6]")
	private WebElement hour;
	
	@FindBy(xpath = "//div[@class='symptom-common symptom-inactive']")
	private List<WebElement> selecthour;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement successmessage;
	
	
	public CreateAppointment(WebDriver driver2) {
		this.driver=driver;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getCreate_Appointment_btn()
	{
		return Create_Appointment_btn;
	}
	public WebElement getclickdropdown()
	{
		return clickdropdown;
	}
	public List<WebElement> getdoctorlist()
	{
		return doctorlist;
	}
	public WebElement getclickNodropdown()
	{
		return clickNodropdown;
	}
	public WebElement getclickno()
	{
		return clickno;
	}
	public WebElement getFirstName()
	{
		return FirstName;
	}
	public WebElement getLastName()
	{
		return LastName;
	}
	public List<WebElement> getgender()
	{
		return gender;
	}
	public List<WebElement> getsymptoms()
	{
		return symptoms;
	}
	public WebElement gethour()
	{
		return hour;
	}
	public List<WebElement> getselecthour()
	{
		return selecthour;
	}
	public WebElement getsubmit()
	{
		return submit;
	}
	public WebElement getsuccessmessage()
	{
		return successmessage;
	}
	public CreateAppointment ClickCreateAppointment() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement create = Create_Appointment_btn;
		Thread.sleep(2000);
		create.click();
		return new CreateAppointment(driver);
	}
	public CreateAppointment ClickDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drp = clickdropdown;
		Thread.sleep(2000);
		drp.click();
		return new CreateAppointment(driver);
	}
	public CreateAppointment selectdoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> doctors = doctorlist;
		int count = doctors.size();
		for (int i = 0; i <count; i++) 
		{
			String text = doctors.get(i).getText();
			if (text.equalsIgnoreCase("Michela"))
			{
				doctors.get(i).click();
				break;
			}
	     }
		return new CreateAppointment(driver);
	}
	public CreateAppointment clickdropNumber(String Ph_No) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Nodrp = clickNodropdown;
		Thread.sleep(2000);
		Nodrp.sendKeys(Ph_No);
		return new CreateAppointment(driver);
	}
	public CreateAppointment ClickselectNo() throws InterruptedException
	{
		Thread.sleep(2000);
		clickno.click();
		return new CreateAppointment(driver);
	}
	public CreateAppointment sendfirstname(String First_Name) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement fn = FirstName;
		Thread.sleep(2000);
		fn.sendKeys(First_Name);
		return new CreateAppointment(driver);
	}
	public CreateAppointment sendlastname(String Last_Name1) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ln = LastName;
		Thread.sleep(2000);
		ln.sendKeys(Last_Name1);
		return new CreateAppointment(driver);
	}
	public CreateAppointment GenderRadio() throws InterruptedException
	{
		Thread.sleep(2000);
		int count = gender.size();
		int i=1;
		while(i<2)
		{
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
				i++;
			}
		return new CreateAppointment(driver);
	}
	public CreateAppointment SymptomsOptions() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> sys = symptoms;
		int count = sys.size();
		for (int i = 0; i < count; i++) 
		{
			String text = sys.get(i).getText();
			if (text.equalsIgnoreCase("Back Pain"))
			{
				sys.get(i).click();
				break;
			}
		}
		return new CreateAppointment(driver);
	}
	public CreateAppointment ClickHourDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		hour.click();
		return new CreateAppointment(driver);
	}
	public CreateAppointment Selecthour() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> hr = selecthour;
		int count = hr.size();
		for (int i = 0; i < count; i++) 
		{
			String text = hr.get(i).getText();
			if (text.equalsIgnoreCase("2PM"))
			{
				hr.get(i).click();
				break;
			}
		}
		return new CreateAppointment(driver);
	}
	public CreateAppointment Clicksubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		submit.click();
		return new CreateAppointment(driver);
	}
	public CreateAppointment appointmentmessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String message = successmessage.getText();
		 System.out.println("Confirmation message is: "+message);
		 Assert.assertEquals(message, "Appointment created successfully");
		return new CreateAppointment(driver);
		
	}
	
	
}
