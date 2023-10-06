package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class AddDoctor extends BaseClass
{
	
	public WebDriver driver;
	@FindBy(className = "btn btn-danger mt-2 text-nowrap add-doctor-btn")
	private WebElement Add_Doctor;
	
	@FindBy(xpath="//input[@placeholder='Doctor Name*']")
	private WebElement Doctor_Name;
	
	@FindBy(xpath="//input[@placeholder='Qualification*']")
	private WebElement Qualification;
	
	@FindBy(xpath="//input[@placeholder='Email Address*']")
	private WebElement Email_Address;
	
	@FindBy(xpath="(//div[@class=' css-1wy0on6'])[2]")
	private WebElement speciality_dropdown;
	
	@FindBy(id="react-select-6-input")
	private WebElement Select_speciality;
	
	@FindBy(className ="(//div[@class=' css-1wy0on6'])[2]")
	private WebElement click_Action;
	
	@FindBy(xpath="(//input[@name='fav_language'])[2]")
	private WebElement Gender_radio;
	
	@FindBy(xpath="//input[@placeholder='Enter phone number*']")
	private WebElement Phone_Number;
	
	@FindBy(xpath="(//div[@class=' css-1wy0on6'])[3]")
	private WebElement year_dropdown;
	
	@FindBy(xpath="//div[text()='2019']")
	private WebElement select_year;
	
	@FindBy(xpath="(//div[@class=' css-1wy0on6'])[5]")
	private WebElement language_dropdown;
	
	@FindBy(id="react-select-9-input")
	private WebElement select_languagename;
	
	@FindBy(className="form-check-input")
	private WebElement Click_language;
	
	@FindBy(xpath="//input[@class='form-check-input']")
	private WebElement Language;
	
	@FindBy(xpath="(//div[@class=' css-1wy0on6'])[5]")
	private WebElement Generate_certificate;
	
	@FindBy(xpath="(//div[@class='react-switch-bg'])[18]")
	private WebElement Generate_Certificate;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div/div[2]/div[13]/div[9]/button[2]")
	private WebElement Submit;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement toastmessage;
	
	public AddDoctor(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAdd_Doctor()
	{
		return Add_Doctor;
	}
	public WebElement getDoctor_Name()
	{
		return Doctor_Name;
	}
	public WebElement getQualification()
	{
		return Qualification;
	}
	public WebElement getEmail_Address()
	{
		return Email_Address;
	}
	public WebElement getspeciality_dropdown()
	{
		return speciality_dropdown;
	}
	public WebElement getSelect_speciality()
	{
		return Select_speciality;
	}
	public WebElement getclick_Action()
	{
		return click_Action;
	}
	public WebElement getGender_radio()
	{
		return Gender_radio;
	}
	public WebElement getPhone_Number()
	{
		return Phone_Number;
	}
	public WebElement getyear_dropdown()
	{
		return year_dropdown;
	}
	public WebElement getselect_year()
	{
		return select_year;
	}
	public WebElement getlanguage_dropdown()
	{
		return language_dropdown;
	}
	public WebElement getselect_language()
	{
		return select_languagename;
	}
	
	public WebElement getClick_language()
	{
		return Click_language;
	}
	public WebElement getGenerate_certificate()
	{
		return Generate_certificate;
	}
	
	public WebElement getSubmit()
	{
		return Submit;
	}
	public WebElement gettoastmessage()
	{
		return toastmessage;
	}
	public AddDoctor Add_Doctor() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = Add_Doctor;
		 Thread.sleep(2000);
		 ele.click();
		 return new AddDoctor(driver);
	}
	public AddDoctor Doctor_Name(String DoctorName) throws InterruptedException
	{
		Thread.sleep(2000);
		Doctor_Name.sendKeys(DoctorName);
		 return new AddDoctor(driver);
	}
	public AddDoctor Qualification(String qualification) throws InterruptedException
	{
		Thread.sleep(2000);
		Qualification.sendKeys(qualification);
		return new AddDoctor(driver);
	}
	public AddDoctor EmailAddress(String Email) throws InterruptedException
	{
		Thread.sleep(2000);
		Email_Address.sendKeys(Email);
		return new AddDoctor(driver);
	}
	public AddDoctor SpecialityDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = speciality_dropdown;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor SelectSpeciality(String speciality) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Select_speciality;
		Thread.sleep(2000);
		ele.sendKeys(speciality);
		return new AddDoctor(driver);
	}
	public AddDoctor CLICKACTION() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = click_Action;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor GenderDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Gender_radio;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor phoneNumber(String PhoneNumber) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Phone_Number;
		Thread.sleep(2000);
		ele.sendKeys(PhoneNumber);
		return new AddDoctor(driver);
	}
	public AddDoctor SelectYear() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = year_dropdown;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor ClickYear() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = select_year;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor LanguageDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = language_dropdown;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor SelectLanguageName(String Language) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = select_languagename;
		Thread.sleep(2000);
		ele.sendKeys(Language);
		return new AddDoctor(driver);
	}
	public AddDoctor ClickLanguage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Click_language;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor GenerateCertificate() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Generate_Certificate;
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor SubmitButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Submit;
		Thread.sleep(2000);
		ele.click();
		return new AddDoctor(driver);
	}
	public AddDoctor captureAddDoctorMessage() throws InterruptedException
	{

		Thread.sleep(2000);
	 String toasttitle = toastmessage.getText();
		 System.out.println("Add Doctor confirmation message is: "+toasttitle);
		 Assert.assertEquals(toasttitle, "Doctor added successfully");
		return new AddDoctor(driver);
	}
	
	
}
