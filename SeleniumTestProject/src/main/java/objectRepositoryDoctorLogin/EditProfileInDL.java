package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class EditProfileInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
	private WebElement editdropdown;
	
	@FindBy(xpath = "//div[@class=' css-w32ibi-option']")
	private WebElement editprofile;
	
	@FindBy(xpath = "//input[@placeholder='Doctor Name*']")
	private WebElement Doctorname;
	
	@FindBy(xpath = "//input[@placeholder='Qualification*']")
	private WebElement Qualification;
	
	@FindBy(xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[4]")
	private WebElement speciality;
	
	@FindBy(xpath = "(//input[@class='form-control text-control call-charges'])[1]")
	private WebElement Videofee;
	
	@FindBy(xpath = "(//input[@class='form-control text-control call-charges'])[2]")
	private WebElement Audiofee;
	
	@FindBy(xpath = "(//input[@class='form-control text-control call-charges'])[3]")
	private WebElement Housefee;
	
	@FindBy(xpath = "//button[@class='btn dialog-btn dialog-btn-type-filled']")
	private WebElement save;
	
	public EditProfileInDL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement geteditdropdown()
	{
		return editdropdown;
	}
	public WebElement geteditprofile()
	{
		return editprofile;
	}
	public WebElement getDoctorname()
	{
		return Doctorname;
	}
	public WebElement getQualification()
	{
		return Qualification;
	}
	public WebElement getspeciality()
	{
		return speciality;
	}
	public WebElement getVideofee()
	{
		return Videofee;
	}
	public WebElement getAudiofee()
	{
		return Audiofee;
	}
	public WebElement getHousefee()
	{
		return Housefee;
	}
	public WebElement getsubmit()
	{
		return save;
	}
	public EditProfileInDL clickEditdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement dropdown = editdropdown;
		Thread.sleep(2000);
		dropdown.click();
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL clickEditProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement profile = editprofile;
		Thread.sleep(2000);
		profile.click();
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL Doctorname(String doctorname) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Dname = Doctorname;
		Thread.sleep(2000);
		Dname.clear();
		Thread.sleep(2000);
		Dname.sendKeys(doctorname);
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL qualification(String qualification) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement quali = Qualification;
		Thread.sleep(2000);
		quali.clear();
		Thread.sleep(2000);
		quali.sendKeys(qualification);
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL Videoconsultation(String vdfee) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement vfee = Videofee;
		Thread.sleep(2000);
		vfee.clear();
		Thread.sleep(2000);
		vfee.sendKeys(vdfee);
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL Audioconsultation(String Adfee) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Afee = Audiofee;
		Thread.sleep(2000);
		Afee.clear();
		Thread.sleep(2000);
		Afee.sendKeys(Adfee);
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL Houseconsultation(String hfee) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Hfee = Housefee;
		Thread.sleep(2000);
		Hfee.clear();
		Thread.sleep(2000);
		Hfee.sendKeys(hfee);
		return new EditProfileInDL(driver);
	}
	public EditProfileInDL savebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement sv = save;
		Thread.sleep(2000);
		sv.click();
		return new EditProfileInDL(driver);
	}
}
