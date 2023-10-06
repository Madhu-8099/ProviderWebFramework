package objectRepositoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;
import objectRepository.Loginpage1;

public class LoginClinic extends BaseClass
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
	
	
	public LoginClinic(WebDriver driver) {
		this.driver=driver;
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
	
	public LoginClinic clickonAdmin_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = Admin_button;
		Thread.sleep(2000);
		ele1.click();
		return new LoginClinic(driver);
	}
	public LoginClinic clickoncountry_button()
	{
		country_dropdown.click();
		return new LoginClinic(driver);
	}
	public LoginClinic EntercountryName(String country) 
	{
		search_button.sendKeys(country);
		return new LoginClinic(driver);
	}
	public LoginClinic clickonCountry()
	{
		countryName.click();
		return new LoginClinic(driver);
	}
	public LoginClinic EnterphoneNumber(String phoneNumber)
	{
		phone_Number.sendKeys(phoneNumber);
		return new LoginClinic(driver);
	}
	public LoginClinic ContinueButton()
	{
		continue_button.click();
		return new LoginClinic(driver);
	}
	public LoginClinic CaptureToastmsg() throws InterruptedException
	{
		Thread.sleep(2000);
	 String toasttitle = toastmessage.getText();
		 System.out.println("Text of the toast message is: "+toasttitle);
		 Assert.assertEquals(toasttitle, "OTP sent!");
		return new LoginClinic(driver);
	}
}
