package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class ManageLeaveInClinic extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-outline-danger leave manage-leave mr-2']")
	private WebElement Manageleave;
	
	@FindBy(xpath="(//div[@class='rmdp-day'])[3]")
	private WebElement selectDay;
	
	@FindBy(id = "exampleInputEmail1")
	private WebElement Textbox;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement Leave;
	
	@FindBy(xpath = "(//button[@class='accordion-button collapsed'])[1]")
	private WebElement dropdown1;
	
	@FindBy(xpath = "(//button[@class='accordion-button collapsed'])[2]")
	private WebElement dropdown2;
	
	@FindBy(xpath = "(//button[@class='accordion-button collapsed'])[3]")
	private WebElement dropdown3;
	
	@FindBy(xpath = "(//button[@class='accordion-button collapsed'])[4]")
	private WebElement dropdown4;
	
	public ManageLeaveInClinic(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getManageleave() {
		return Manageleave;
	}
	public WebElement getselectDay()
	{
		return selectDay;
	}
	public WebElement getTextbox()
	{
		return Textbox;
	}
	public WebElement getsubmit()
	{
		return submit;
	}
	public WebElement getLeave()
	{
		return Leave;
	}
	public WebElement getdropdown1()
	{
		return dropdown1;
	}
	public WebElement getdropdown2()
	{
		return dropdown2;
	}
	public WebElement getdropdown3()
	{
		return dropdown3;
	}
	public WebElement getdropdown4()
	{
		return dropdown4;
	}
	public ManageLeaveInClinic Manageleave() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Manageleave;
		Thread.sleep(2000);
		ele.click();
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic selectDay() throws InterruptedException
	{
		Thread.sleep(2000);
		selectDay.click();
		Thread.sleep(2000);
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic Textbox1(String message) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement textbox = Textbox;
		Thread.sleep(2000);
		textbox.sendKeys(message);
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic submit1() throws InterruptedException
	{
		Thread.sleep(2000);
		submit.click();
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic LeaveMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String message = Leave.getText();
		System.out.println("Confirmation message is: "+message);
		 Assert.assertEquals(message, "Leave added successfully");
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic dropdown1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement option1 = dropdown1;
		Thread.sleep(2000);
		option1.click();
		Thread.sleep(2000);
		option1.click();
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic dropdown2() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement option2 = dropdown2;
		Thread.sleep(2000);
		option2.click();
		Thread.sleep(2000);
		option2.click();
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic dropdown3() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement option3 = dropdown3;
		Thread.sleep(2000);
		option3.click();
		Thread.sleep(2000);
		option3.click();
		return new ManageLeaveInClinic(driver);
	}
	public ManageLeaveInClinic dropdown4() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement option4 = dropdown4;
		Thread.sleep(2000);
		option4.click();
		Thread.sleep(2000);
		option4.click();
		return new ManageLeaveInClinic(driver);
	}
}
