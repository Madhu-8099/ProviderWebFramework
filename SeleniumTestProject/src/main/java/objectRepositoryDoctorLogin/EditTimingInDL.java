package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class EditTimingInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
	private WebElement editTimedropdown;
	
	@FindBy(id = "react-select-5-option-1")
	private WebElement Edittiming;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[1]")
	private WebElement Mtoggle;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[3]")
	private WebElement Ttoggle;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[5]")
	private WebElement Wtoggle;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[7]")
	private WebElement TDtoggle;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[9]")
	private WebElement Ftoggle;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[11]")
	private WebElement Stoggle;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[13]")
	private WebElement Suntoggle;
	
	@FindBy(xpath = "//button[@class='btn dialog-btn dialog-btn-type-filled']")
	private WebElement submitt;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement updatebtn;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement confirmmessage;
	
	public EditTimingInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement geteditTimedropdown()
	{
		return editTimedropdown;
	}
	public WebElement getEdittiming()
	{
		return Edittiming;
	}
	public WebElement getMtoggle()
	{
		return Mtoggle;
	}
	public WebElement getTtoggle()
	{
		return Ttoggle;
	}
	public WebElement getWtoggle()
	{
		return Wtoggle;
	}
	public WebElement getTDtoggle()
	{
		return TDtoggle;
	}
	public WebElement getFtoggle()
	{
		return Ftoggle;
	}
	public WebElement getStoggle()
	{
		return Stoggle;
	}
	public WebElement getSuntoggle()
	{
		return Suntoggle;
	}
	public WebElement getsubmitt()
	{
		return submitt;
	}
	public WebElement getupdatebtn()
	{
		return updatebtn;
	}
	public WebElement getconfirmmessage()
	{
		return confirmmessage;
	}
	public EditTimingInDL clickEditDrop() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement edit = editTimedropdown;
		Thread.sleep(2000);
		edit.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL clickTiming() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement time = Edittiming;
		Thread.sleep(2000);
		time.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL mondaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement MT = Mtoggle;
		Thread.sleep(2000);
		MT.click();
		Thread.sleep(2000);
		MT.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL tuesdaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement TT = Ttoggle;
		Thread.sleep(2000);
		TT.click();
		Thread.sleep(2000);
		TT.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL wednesdaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement WT = Wtoggle;
		Thread.sleep(2000);
		WT.click();
		Thread.sleep(2000);
		WT.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL thursdaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement TDT = TDtoggle;
		Thread.sleep(2000);
		TDT.click();
		Thread.sleep(2000);
		TDT.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL fridaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement FT = Ftoggle;
		Thread.sleep(2000);
		FT.click();
		Thread.sleep(2000);
		FT.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL saturdaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ST = Stoggle;
		Thread.sleep(2000);
		ST.click();
		Thread.sleep(2000);
		ST.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL sundaytoggle() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement SunT = Suntoggle;
		Thread.sleep(2000);
		SunT.click();
		Thread.sleep(2000);
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL submit() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Sub = submitt;
		Thread.sleep(2000);
		Sub.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL updatebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ub = updatebtn;
		Thread.sleep(2000);
		ub.click();
		return new EditTimingInDL(driver);
	}
	public EditTimingInDL CaptureMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String confirm = confirmmessage.getText();
		System.out.println("Confirmation message is: "+confirm);
		 Assert.assertEquals(confirm, "Doctor timing updated successfully");
		return new EditTimingInDL(driver);
	}
}
