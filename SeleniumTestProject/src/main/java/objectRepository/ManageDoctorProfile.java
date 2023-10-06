package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageDoctorProfile 
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div/div/div[2]/table/tbody/tr[1]/td[7]/button")
	private WebElement ViewProfile;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
	private WebElement editprofiledropd;
	
	@FindBy(id = "react-select-12-option-0")
	private WebElement editprofile;
	
	@FindBy(xpath = "//input[@placeholder='Doctor Name*']")
	private WebElement doctorName;
	
	@FindBy(xpath = "//input[@placeholder='Qualification*']")
	private WebElement Qualification;
	
	@FindBy(xpath = "(//input[@class='form-control text-control call-charges'])[1]")
	private WebElement videoprize;
	
	@FindBy(xpath = "(//input[@class='form-control text-control call-charges'])[2]")
	private WebElement audioprize;
	
	@FindBy(xpath = "(//input[@class='form-control text-control call-charges'])[3]")
	private WebElement housecallprize;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[7]")
	private WebElement generatecertificate;
	
	@FindBy(className = "btn dialog-btn dialog-btn-type-filled")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement doctotProfileUpdate;
	
	public ManageDoctorProfile(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getViewProfile()
	{
		return ViewProfile;
	}
	public WebElement geteditprofiledropd()
	{
		return editprofiledropd;
	}
	public WebElement geteditprofile()
	{
		return editprofile;
	}
	public WebElement getdoctorname()
	{
		return doctorName;
	}
	public WebElement getqualification()
	{
		return Qualification;
	}
	public WebElement getaudioprize()
	{
		return audioprize;
	}
	public WebElement getvideoprize()
	{
		return videoprize;
	}
	public WebElement gethousecallprize()
	{
		return housecallprize;
	}
	public WebElement getgeneratecertificate()
	{
		return generatecertificate;
	}
	public WebElement getsubmit()
	{
		return submit;
	}
	public WebElement getdoctotProfileUpdate()
	{
		return doctotProfileUpdate;
	}
	public ManageDoctorProfile clickViewProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement view = ViewProfile;
		Thread.sleep(2000);
		view.click();
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile clickEditProfiledropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement view = editprofiledropd;
		Thread.sleep(2000);
		view.click();
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile clickEditProfile1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement profile = editprofile;
		Thread.sleep(2000);
		profile.click();
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile DoctorName(WebDriver driver, String Dname) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement name = doctorName;
		Thread.sleep(2000);
		name.clear();
		Thread.sleep(2000);
		name.sendKeys(Dname);
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile Qualification(WebDriver driver, String qualification) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement quali = Qualification;
		Thread.sleep(2000);
		quali.clear();
		Thread.sleep(2000);
		quali.sendKeys(qualification);
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile Clickvideoprize(WebDriver driver,String vdfee) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement video = videoprize;
		Thread.sleep(2000);
		video.clear();
		Thread.sleep(2000);
		video.sendKeys(vdfee);
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile clickaudioprize(String Adfee) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement audio = audioprize;
		Thread.sleep(2000);
		audio.clear();
		Thread.sleep(2000);
		audio.sendKeys(Adfee);
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile clickhousecallprize(String hfee) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement house = housecallprize;
		Thread.sleep(2000);
		house.clear();
		Thread.sleep(2000);
		house.sendKeys(hfee);
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile clickgeneratecertificate() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement certi = generatecertificate;
		Thread.sleep(2000);
		certi.click();
		Thread.sleep(2000);
		certi.click();
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile clicksubmitbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement btn = submit;
		Thread.sleep(2000);
		btn.click();
		return new ManageDoctorProfile(driver);
	}
	public ManageDoctorProfile doctorprofileupdate() throws InterruptedException
	{
		Thread.sleep(2000);
		String message = doctotProfileUpdate.getText();
		 System.out.println("Confirmation message is: "+message);
		 Assert.assertEquals(message, "doctor update profile successfully");
		return new ManageDoctorProfile(driver);
	}
}
