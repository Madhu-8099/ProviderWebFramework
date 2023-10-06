package objectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class EditTimingPage extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[3]/div/div/div[2]/div")
	private WebElement clickEdit_dropdown;
	
	@FindBy(xpath = "//div[@class=' css-w32ibi-option']")
	private WebElement clickTiming;
	
	@FindBy(xpath="(//input[@placeholder='HH:MM'])[2]")
	private WebElement TimeToggle;
	
	@FindBy(xpath="(//div[@class='react-switch-bg'])[2]")
	private WebElement TimeToggle2;
	
	@FindBy(xpath="(//div[@class='react-switch-bg'])[3]")
	private WebElement TimeToggle3;
	
	@FindBy(xpath="(//div[@class='react-switch-bg'])[4]")
	private WebElement TimeToggle4;
	
	@FindBy(xpath="(//div[@class='react-switch-bg'])[5]")
	private WebElement TimeToggle5;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[6]")
	private WebElement TimeToggle6;
	
	@FindBy(xpath="(//div[@class='react-switch-bg'])[7]")
	private WebElement TimeToggle7;
	
	@FindBy(className="btn dialog-btn dialog-btn-type-filled")
	private WebElement SubmitChanges;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement updatetiming;
	

	public EditTimingPage(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getEditdropdown()
	{
		return clickEdit_dropdown;
	}
	public WebElement getclickTiming()
	{
		return clickTiming;
	}
	public WebElement getTimeToggle()
	{
		return TimeToggle;
	}
	public WebElement getTimeToggle2()
	{
		return TimeToggle2;
	}
	public WebElement getTimeToggle3()
	{
		return TimeToggle3;
	}
	public WebElement getTimeToggle4()
	{
		return TimeToggle4;
	}
	public WebElement getTimeToggle5()
	{
		return TimeToggle5;
	}
	public WebElement getTimeToggle6()
	{
		return TimeToggle6;
	}
	public WebElement getTimeToggle7()
	{
		return TimeToggle7;
	}
	public WebElement getSubmitChanges()
	{
		return SubmitChanges;
	}
	public WebElement getupdatetiming()
	{
		return updatetiming;
	}
	public EditTimingPage Editdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element1 = clickEdit_dropdown;
		Thread.sleep(2000);
		element1 .click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage ClickTiming() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element2 = clickTiming;
		Thread.sleep(2000);
		element2.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage ChangeTimings(String timing) throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement element3 = TimeToggle;
		 Thread.sleep(2000);
		 element3.clear();
		 Thread.sleep(2000);
		 element3.sendKeys(timing);
		 return new EditTimingPage(driver);
	}
	public EditTimingPage toggle2() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeToggle2.click();
		Thread.sleep(2000);
		TimeToggle2.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage toggle3() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeToggle3.click();
		Thread.sleep(2000);
		TimeToggle3.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage toggle4() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeToggle4.click();
		Thread.sleep(2000);
		TimeToggle4.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage toggle5() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeToggle5.click();
		Thread.sleep(2000);
		TimeToggle5.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage toggle6() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeToggle6.click();
		Thread.sleep(2000);
		TimeToggle6.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage toggle7() throws InterruptedException
	{
		Thread.sleep(2000);
		TimeToggle7.click();
		Thread.sleep(2000);
		TimeToggle7.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage SubmitChanges1() throws InterruptedException
	{
		Thread.sleep(2000);
		SubmitChanges.click();
		return new EditTimingPage(driver);
	}
	public EditTimingPage updatetimingmessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String update = updatetiming.getText();
		 System.out.println("Confirmation message is: "+update);
		 Assert.assertEquals(update, "clinic time updated successfully");
		return new EditTimingPage(driver);
	}
}
