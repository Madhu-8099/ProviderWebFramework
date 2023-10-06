package objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ApproveButton extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//div[@class='refresh-appointment-list-icon-parent']")
	private WebElement refresh;
	
	@FindBy(xpath = "//button[text()='Approve']")
	private WebElement approve;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement acceptbutton;
	
	public ApproveButton(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getapprove()
	{
		return approve;
	}
	public WebElement getacceptbutton()
	{
		return acceptbutton;
	}
	public ApproveButton clickrefreshButton() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new ApproveButton(driver);
	}
	public ApproveButton clickapprovebutton() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		approve.click();
		return new ApproveButton(driver);
	}
	public ApproveButton clickacceptbutton() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		acceptbutton.click();
		return new ApproveButton(driver);
	}
}
