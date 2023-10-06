package objectRepositoryDemo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAppointmentFlow 
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[2]")
	private WebElement Appointmentpage;
	
	@FindBy(css = ".ri-menu-line.hamburger.open-panel.nav-toggle")
	private WebElement Hamburger;
	
	@FindBy(css = ".ri-close-line.hamburger.open-panel.nav-toggle")
	private WebElement Crossicon;
	
	@FindBy(css = ".appointment-card-filter-view-col-2-create-btn-view")
	private WebElement createAppointment;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[4]")
	private WebElement DoctorDp;
	
	@FindBy(css = ".css-a6qsyf-option")
	private List<WebElement> DoctorSelect;
	
	@FindBy(id = "react-select-11-input")
	private WebElement sendNo;
	
	@FindBy(id = "react-select-11-option-0")
	private WebElement selectnumber;
	
	@FindBy(xpath = "//input[@placeholder='First Name*']")
	private WebElement Firstname;
	
	@FindBy(xpath = "//input[@placeholder='Last Name*']")
	private WebElement Lastname;
	
	@FindBy(xpath = "//div[@class='d-flex align-items-center me-2']")
	private WebElement Genderbutton;
	
	@FindBy(xpath = "//input[@placeholder='Address (Optional)']")
	private WebElement Address;
	
	@FindBy(css = ".symptom-common.symptom-inactive")
	private List<WebElement> symptoms;
	
	@FindBy(xpath = "(//div[@class='symptom-common symptom-inactive'])[9]")
	private WebElement Fever;
	
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement Widget;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[6]")
	private WebElement Hourdropdown;
	
	@FindBy(css = ".css-1tdpez0-option")
	private List<WebElement> selecthour;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[7]")
	private WebElement Minutedropdown;
	
	@FindBy(css = ".css-1tdpez0-option")
	private List<WebElement> selectminute;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement Appointmentmessage;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[3]")
	private WebElement clickdp;
	
	@FindBy(css  = ".css-1tdpez0-option")
	private List<WebElement> selectD;
	
	@FindBy(css = ".refresh-appointment-list-icon-parent")
	private WebElement ButtonRefresh;
	
	@FindBy(xpath = "(//*[@id=\"ACTION_BUTTON\"])[6]")
	private WebElement Normalcall;
	
	@FindBy(xpath = "(//*[@id=\"ACTION_BUTTON\"])[5]")
	private WebElement Finishcall;
	
	public CreateAppointmentFlow(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getAppointmentpage()
	{
		return Appointmentpage;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossicon()
	{
		return Crossicon;
	}
	public WebElement getDoctorDp()
	{
		return DoctorDp;
	}
	public List<WebElement> getcreateAppointment()
	{
		return DoctorSelect;
	}
	
	public WebElement getsendNo()
	{
		return sendNo;
	}
	public WebElement getselectnumber()
	{
		return selectnumber;
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
	public List<WebElement> getBackPain()
	{
		return symptoms;
	}
	public WebElement getWidget()
	{
		return Widget;
	}
	public WebElement getHourdropdown()
	{
		return Hourdropdown;
	}
	public List<WebElement> getselecthour()
	{
		return selecthour;
	}
	public WebElement getMinutedropdown()
	{
		return Minutedropdown;
	}
	public List<WebElement> getselectminute()
	{
		return selectminute;
	}
	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}
	public WebElement getButtonRefresh()
	{
		return ButtonRefresh;
	}
	public WebElement getclickdp()
	{
		return clickdp;
	}
	public List<WebElement> getselectD()
	{
		return selectD;
	}
	public WebElement getAppointmentmessage()
	{
		return Appointmentmessage;
	}
	public WebElement getNormalcall()
	{
		return Normalcall;
	}
	public WebElement getFinishcall()
	{
		return Finishcall;
	}
	public CreateAppointmentFlow ClickAppointmentsPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Appointmentpage;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 ele.click();
		 return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow ClickHamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ham = Hamburger;
		Thread.sleep(2000);
		ham.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow ClickCrossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = Crossicon;
		Thread.sleep(2000);
		cross.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow ClickCreateAppointment() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement create = createAppointment;
		Thread.sleep(2000);
		create.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow ClickDoctorDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drop = DoctorDp;
		Thread.sleep(2000);
		drop.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow SelectDoctorOpt() throws InterruptedException
	{
		Thread.sleep(2000);
		int count = DoctorSelect.size();
		for (int i = 0; i < count; i++) 
		{
			String text = DoctorSelect.get(i).getText();
			if (text.equalsIgnoreCase("Saniya"))
			{
				DoctorSelect.get(i).click();
				break;
			}
		}
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow sendNumber(String Ph_No) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement num = sendNo;
		Thread.sleep(2000);
		num.sendKeys(Ph_No);
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow clicknumber() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement num1 = selectnumber;
		Thread.sleep(2000);
		num1.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow firstname(String First_Name) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement FM = Firstname;
		Thread.sleep(2000);
		FM.sendKeys(First_Name);
		
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow lastname(String Last_Name1) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement LM = Lastname;
		Thread.sleep(2000);
		LM.sendKeys(Last_Name1);
	
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow genderdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Gb = Genderbutton;
		Thread.sleep(2000);
		Gb.click();
		Thread.sleep(2000);
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow addressfield(String address) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement add = Address;
		Thread.sleep(2000);
		add.sendKeys(address);
		
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow Symptoms() throws InterruptedException
	{
		Thread.sleep(2000);
		int count = symptoms.size();
		for (int i = 0; i < count; i++) 
		{
			String text = symptoms.get(i).getText();
			if (text.equalsIgnoreCase("Back Pain"))
			{
				symptoms.get(i).click();
				break;
			}
			String text1 = symptoms.get(i).getText();
		    if (text1.equalsIgnoreCase("Cough"))
			{
				symptoms.get(i).click();
				break;
			}	
		}
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow datewidget(String date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date1 = Widget;
		Thread.sleep(2000);
		date1.sendKeys(date);
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow hourdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hr = Hourdropdown;
		Thread.sleep(2000);
		hr.click();
		Thread.sleep(2000);
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow selecthour() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> hr = selecthour;
		int count = hr.size();
		for (int i = 0; i < count; i++) 
		{
			String hour = hr.get(i).getText();
			if (hour.equalsIgnoreCase("11 AM")) 
			{
				hr.get(i).click();
				break;
			}
		}
	
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow minutedropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement min =  Minutedropdown;
		Thread.sleep(2000);
		min.click();
		Thread.sleep(2000);
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow selectminute() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> min = selectminute;
		int count = min.size();
		for (int i = 0; i < count; i++) 
		{
			String minute = min.get(i).getText();
			if (minute.equalsIgnoreCase("50")) 
			{
				min.get(i).click();
				break;
			}
		}
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow Submitbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement sub =  SubmitButton;
		Thread.sleep(2000);
		sub.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow captureMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String appointment = Appointmentmessage.getText();
		System.out.println("Confirmation message is: "+appointment);
		 Assert.assertEquals(appointment, "Appointment created successfully");
		return new CreateAppointmentFlow(driver);	 
	}
	public CreateAppointmentFlow ClickDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drop = clickdp;
		Thread.sleep(2000);
		drop.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow SelectDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> doctors = selectD;
		int count = doctors.size();
		for (int i = 0; i < count; i++) 
		{
			String text = doctors.get(i).getText();
			if (text.equalsIgnoreCase("Saniya")) 
			{
				doctors.get(i).click();
				break;
			}
		}
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow RefreshPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement button = ButtonRefresh;
		Thread.sleep(2000);
		button.click();
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow NormalConsult() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement consult = Normalcall;
		Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", consult);
		return new CreateAppointmentFlow(driver);
	}
	public CreateAppointmentFlow FinishCall() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement finish = Finishcall;
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", finish);
		return new CreateAppointmentFlow(driver);
	}
}
