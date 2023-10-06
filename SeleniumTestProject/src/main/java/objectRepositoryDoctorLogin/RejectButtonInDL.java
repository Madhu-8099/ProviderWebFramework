package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class RejectButtonInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//i[@class='ri-refresh-line refresh-appointment-list-icon']")
	private WebElement refresh;
	
	@FindBy(xpath = "(//button[@class='appointment-request-btn'])[3]")
	private WebElement REJECT_BTN;
	
	@FindBy(xpath = "//textarea[@placeholder='Reject reason']")
	private WebElement reasonbox;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement submitbutton;
	
	public RejectButtonInDL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getREJECT_BTN()
	{
		return REJECT_BTN;
	}
	public WebElement getreasonbox()
	{
		return reasonbox;
	}
	public WebElement getsubmitbutton()
	{
		return submitbutton;
	}
	public RejectButtonInDL refreshbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement icon = refresh;
		Thread.sleep(2000);
		icon.click();
		return new RejectButtonInDL(driver);
	}
	public RejectButtonInDL Rejectbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement rbtn = REJECT_BTN;
		Thread.sleep(2000);
		rbtn.click();
		return new RejectButtonInDL(driver);
	}
	public RejectButtonInDL ReasonBox(String text) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement box = reasonbox;
		Thread.sleep(2000);
		box.sendKeys(text);
		return new RejectButtonInDL(driver);
	}
	public RejectButtonInDL SubmitButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement btn = submitbutton;
		Thread.sleep(2000);
		btn.click();
		return new RejectButtonInDL(driver);
	}
}
