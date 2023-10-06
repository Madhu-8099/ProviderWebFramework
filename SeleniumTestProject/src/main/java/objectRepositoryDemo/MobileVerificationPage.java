package objectRepositoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileVerificationPage 
{

	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@class='form-control me-3 otp-input-field'])[1]")
	private WebElement Otp_No1;
	
	@FindBy(xpath="(//input[@class='form-control me-3 otp-input-field'])[2]")
	private WebElement Otp_No2;
	
	@FindBy(xpath="(//input[@class='form-control me-3 otp-input-field'])[3]")
	private WebElement Otp_No3;
	
	@FindBy(xpath="(//input[@class='form-control me-3 otp-input-field'])[4]")
	private WebElement Otp_No4;
	
	@FindBy(xpath="//button[@class='btn text-white continue']")
	private WebElement verify_button;
	
	public MobileVerificationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getOtp_No1() 
	{
		return Otp_No1;
	}
	public WebElement getOtp_No2()
	{
		return Otp_No2;
	}
	public WebElement getOtp_No3()
	{
		return Otp_No3;
	}
	public WebElement getOtp_No4()
	{
		return Otp_No4;
	}
	public MobileVerificationPage Otp_No1(String Otp1) throws InterruptedException 
	{
		Thread.sleep(2000);
		Otp_No1.sendKeys(Otp1);
		return new MobileVerificationPage(driver);
	}
	public MobileVerificationPage Otp_No2(String Otp2)
	{
		Otp_No2.sendKeys(Otp2);
		return new MobileVerificationPage(driver);
	}
	public MobileVerificationPage Otp_No3(String Otp3)
	{
		Otp_No3.sendKeys(Otp3);
		return new MobileVerificationPage(driver);
	}
	public MobileVerificationPage Otp_No4(String Otp4)
	{
		Otp_No4.sendKeys(Otp4);
		return new MobileVerificationPage(driver);
	}
	public MobileVerificationPage verify_button() 
	{
		verify_button.click();
		return new MobileVerificationPage(driver);
	}
}
