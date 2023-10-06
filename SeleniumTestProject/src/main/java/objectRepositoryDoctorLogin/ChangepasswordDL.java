package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class ChangepasswordDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='btn btn btn-danger text-white']")
	private WebElement changepwd_btn;
	
	@FindBy(xpath = "//input[@placeholder='Enter Current Password']")
	private WebElement currentpwd;
	
	@FindBy(xpath = "//input[@placeholder='Enter New Password']")
	private WebElement newpwd;
	
	@FindBy(xpath = "//input[@placeholder='Confirm New Password']")
	private WebElement confirmpwd;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement confirm;
	
	@FindBy(xpath = "(//button[@class='dialog-btn dialog-btn-type-filled'])[2]")
	private WebElement Okbtn;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement confirmationMessage;
	
	public ChangepasswordDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getchangepwd_btn()
	{
		return changepwd_btn;
	}
	public WebElement getcurrentpwd()
	{
		return currentpwd;
	}
	public WebElement getnewpwd()
	{
		return newpwd;
	}
	public WebElement getconfirmpwd()
	{
		return confirmpwd;
	}
	public WebElement getconfirm()
	{
		return confirm;
	}
	public WebElement getOkbtn()
	{
		return Okbtn;
	}
	public WebElement getconfirmationMessage()
	{
		return confirmationMessage;
	}
	public ChangepasswordDL change_pwd() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cpwd = changepwd_btn;
		Thread.sleep(2000);
		cpwd.click();
		return new ChangepasswordDL(driver);
	}
	public ChangepasswordDL current_pwd(String currentPassword) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement pwd = currentpwd;
		Thread.sleep(2000);
		pwd.sendKeys(currentPassword);
		return new ChangepasswordDL(driver);
	}
	public ChangepasswordDL New_pwd(String newpassword) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement New = newpwd;
		Thread.sleep(2000);
		New.sendKeys(newpassword);
		return new ChangepasswordDL(driver);
	}
	public ChangepasswordDL Confirm_pwd(String confirmpassword) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement con_pwd = confirmpwd;
		Thread.sleep(2000);
		con_pwd.sendKeys(confirmpassword);
		return new ChangepasswordDL(driver);
	}
	public ChangepasswordDL confirmButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement btn = confirm;
		Thread.sleep(2000);
		btn.click();
		return new ChangepasswordDL(driver);
	}
	public ChangepasswordDL OkButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ok = Okbtn;
		Thread.sleep(2000);
		ok.click();
		return new ChangepasswordDL(driver);
	}
	public ChangepasswordDL CaptureMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String message = confirmationMessage.getText();
		System.out.println("Confirmation message is: "+message);
		 Assert.assertEquals(message, "Doctor Password updated successfully,Please login again!");
		return new ChangepasswordDL(driver);
	}
}
