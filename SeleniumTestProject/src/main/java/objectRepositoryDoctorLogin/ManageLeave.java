package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class ManageLeave extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='btn btn-outline-danger leave manage-leave align-item-center']")
	private WebElement Manageleave;
	
	@FindBy(xpath = "(//div[@class='rmdp-day'])[1]")
	private WebElement selectdate;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement textMessage;
	
	@FindBy(xpath = "//i[@class='ri-close-line dialog-close icon-hover-bg']")
	private WebElement crossicon;
	
	@FindBy(xpath = "//i[@class='ri-close-line me-2']")
	private WebElement cancelleave;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement yesbutton;
	
	@FindBy(xpath = "(//h2[@class='accordion-header'])[1]")
	private WebElement schedule;
	
	@FindBy(xpath = "(//h2[@class='accordion-header'])[2]")
	private WebElement consultation;
	
	@FindBy(xpath = "(//h2[@class='accordion-header'])[3]")
	private WebElement vitalsigns;
	
	public ManageLeave(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getManageleave()
	{
		return Manageleave;
	}
	public WebElement getselectdate()
	{
		return selectdate;
	}
	public WebElement gettextMessage()
	{
		return textMessage;
	}
	public WebElement getcrossicon()
	{
		return crossicon;
	}
	public WebElement getcancelleave()
	{
		return cancelleave;
	}
	public WebElement getyesbutton()
	{
		return yesbutton;
	}
	public WebElement getschedule()
	{
		return schedule;
	}
	public WebElement getconsultation()
	{
		return consultation;
	}
	public WebElement getvitalsigns()
	{
		return vitalsigns;
	}
	
	public ManageLeave clickmanageleave() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement leave = Manageleave;
		Thread.sleep(2000);
		leave.click();
		return new ManageLeave(driver);
	}
	public ManageLeave selectDate() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date = selectdate;
		Thread.sleep(2000);
		date .click();
		return new ManageLeave(driver);
	}
	public ManageLeave capturetext() throws InterruptedException
	{
		Thread.sleep(2000);
		String text = textMessage.getText();
		System.out.println("Confirmation message is: "+text);
		 Assert.assertEquals(text, "Leave added successfully");
		return new ManageLeave(driver);
	}
	public ManageLeave clickcrossicon() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cicon = crossicon;
		Thread.sleep(2000);
		cicon.click();
		return new ManageLeave(driver);
	}
	public ManageLeave cancelleave1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement leave = Manageleave;
		Thread.sleep(2000);
		leave.click();
		Thread.sleep(2000);
		WebElement leave1 = cancelleave;
		Thread.sleep(2000);
		leave1.click();
		return new ManageLeave(driver);
	}
	public ManageLeave Yesbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ybtn = yesbutton;
		Thread.sleep(2000);
		ybtn.click();
		Thread.sleep(2000);
		WebElement cicon = crossicon;
		Thread.sleep(2000);
		cicon.click();
		return new ManageLeave(driver);
	}
	public ManageLeave CancelMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String message = textMessage.getText();
		System.out.println("Confirmation message is: "+message);
		 Assert.assertEquals(message, "Leave cancelled successfully");
		return new ManageLeave(driver);
	}
	public ManageLeave scheduledropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drp1 = schedule;
		Thread.sleep(2000);
		drp1.click();
		Thread.sleep(2000);
		drp1.click();
		return new ManageLeave(driver);
	}
	public ManageLeave cosultationdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drp2 = consultation;
		Thread.sleep(2000);
		drp2.click();
		Thread.sleep(2000);
		drp2.click();
		return new ManageLeave(driver);
	}
	public ManageLeave vitalsignsdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drp3 = vitalsigns;
		Thread.sleep(2000);
		drp3.click();
		Thread.sleep(2000);
		drp3.click();
		return new ManageLeave(driver);
	}
}
