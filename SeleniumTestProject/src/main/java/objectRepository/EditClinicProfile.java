package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class EditClinicProfile extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[3]/div/div/div[2]/div")
	private WebElement clickEdit_dropdown;
	
	@FindBy(xpath = "//div[@class=' css-w32ibi-option']")
	private WebElement EditProfile;
	
	@FindBy(xpath="//input[@placeholder='Clinic Name*']")
	private WebElement ClinicName;
	
	@FindBy(xpath="//input[@placeholder='Hospital Registration Number*']")
	private WebElement HospitalRegistration;
	
	@FindBy(xpath="//input[@placeholder='Enter phone number*']")
	private WebElement Phone_No;
	
	@FindBy(xpath="//input[@placeholder='Email Address*']")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@placeholder='Clinic Address*']")
	private WebElement ClinicAddress;
	
	@FindBy(xpath="//input[@placeholder='Zip Code*']")
	private WebElement ZipCode;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div[8]/div/button[2]")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement updatemessage;
	

	public EditClinicProfile(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getclickEdit_dropdown()
	{
		return clickEdit_dropdown;
	}
	public WebElement getEditProfile()
	{
		return EditProfile;
	}
	public WebElement getClinicName()
	{
		return ClinicName;
	}
	public WebElement getHospitalRegistration()
	{
		return HospitalRegistration;
	}
	public WebElement getPhone_No()
	{
		return Phone_No;
	}
	public WebElement getEmailAddress()
	{
		return EmailAddress;
	}
	public WebElement getZipCode()
	{
		return ZipCode;
	}
	public WebElement getSubmitButton()
	{
		return SubmitButton;
	}
	public WebElement getupdatemessage()
	{
		return updatemessage;
	}
	public EditClinicProfile clickEdit_dropdown1() throws InterruptedException 
	{
		Thread.sleep(2000);
		 WebElement element = clickEdit_dropdown;
		 element.click();
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile EditProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele1 = EditProfile;
		 Thread.sleep(2000);
		 ele1.click();
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile ClinicName(String clinicname) throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = ClinicName;
		 Thread.sleep(2000);
		 ele.clear();
		 Thread.sleep(2000);
		 ele.sendKeys(clinicname);
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile HospitalRegistration1(String hosipta_No) throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = HospitalRegistration;
		 Thread.sleep(2000);
		 ele.clear();
		 Thread.sleep(2000);
		 ele.sendKeys(hosipta_No);
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile Phone_No1(String mobile_No) throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = Phone_No;
		 Thread.sleep(2000);
		 ele.clear();
		 Thread.sleep(2000);
		 ele.sendKeys(mobile_No);
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile EmailAddress1(String emailaddress) throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = EmailAddress;
		 Thread.sleep(2000);
		 ele.clear();
		 Thread.sleep(2000);
		 ele.sendKeys(emailaddress);
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile ZipCode1(String zip_code) throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = ZipCode;
		 Thread.sleep(2000);
		 ele.clear();
		 Thread.sleep(2000);
		 ele.sendKeys(zip_code);
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile SubmitButton1() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = SubmitButton;
		 Thread.sleep(2000);
		 ele.click();
		 return new EditClinicProfile(driver);
	}
	public EditClinicProfile UpdateProfileMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String msg = updatemessage.getText();
		System.out.println("Confirmation message is: "+msg);
		 Assert.assertEquals(msg, "Clinic profile details updated successfully");
		return new EditClinicProfile(driver);
	}
}
