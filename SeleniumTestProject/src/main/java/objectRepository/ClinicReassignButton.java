package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicReassignButton extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"refresh-appointment\"]")
	private WebElement refresh;
	
	@FindBy(xpath = "(//*[@id=\"ACTION_BUTTON\"])[3]")
	private WebElement reassign;
	
	public ClinicReassignButton(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getreassign()
	{
		return reassign;
	}
	
	public ClinicReassignButton clickrefresh() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new ClinicReassignButton(driver);
	}
	public ClinicReassignButton Clickreassign() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement rb = reassign;
		Thread.sleep(2000);
		rb.click();
		return new ClinicReassignButton(driver);
	}
}
