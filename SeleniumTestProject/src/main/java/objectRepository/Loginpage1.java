package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;
import genericUtilities.PropertyFileUtility;

public class Loginpage1 extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/section/div[1]")
	private WebElement Admin_button;
	
	@FindBy(xpath="//div[@class='selected-flag']")
	private WebElement country_dropdown;
	
	@FindBy(className="search-box")
	private WebElement search_button;
	
	@FindBy(xpath="//li[@data-flag-key='flag_no_1']")
	private WebElement countryName;
	
	@FindBy(xpath="//input[@placeholder='Enter phone number*']")
	WebElement phone_Number;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement continue_button;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement toastmessage;
	
	
	public Loginpage1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCLN_buttton() {
		return Admin_button;
	}
	public WebElement getcountry_dropdown() {
		return country_dropdown;
	}
	public WebElement getsearch_button() {
		return search_button;
	}
	public WebElement getcountryName() {
		return  countryName;
	}
	public WebElement getphone_Number() {
		return phone_Number;
	}
	public WebElement getcontinue_button() {
		return continue_button;
	}
	public WebElement gettoastmessage()
	{
		return toastmessage;
	}
	
	public Loginpage1 clickonAdmin_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = Admin_button;
		Thread.sleep(2000);
		ele1.click();
		return new Loginpage1(driver);
	}
	public Loginpage1 clickoncountry_button()
	{
		country_dropdown.click();
		return new Loginpage1(driver);
	}
	public Loginpage1 EntercountryName(String country) 
	{
		search_button.sendKeys(country);
		return new Loginpage1(driver);
	}
	public Loginpage1 clickonCountry()
	{
		countryName.click();
		return new Loginpage1(driver);
	}
	public Loginpage1 EnterphoneNumber(String phoneNumber)
	{
		phone_Number.sendKeys(phoneNumber);
		return new Loginpage1(driver);
	}
	public Loginpage1 ContinueButton()
	{
		continue_button.click();
		return new Loginpage1(driver);
	}
	public Loginpage1 CaptureToastmsg() throws InterruptedException
	{
		Thread.sleep(2000);
	 String toasttitle = toastmessage.getText();
		 System.out.println("Text of the toast message is: "+toasttitle);
		 Assert.assertEquals(toasttitle, "OTP sent!");
		return new Loginpage1(driver);
	}
	
}
