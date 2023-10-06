package objectRepositoryDemo;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;


public class ApproveButtonFlow extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[3]")
	private WebElement drop;
	
	@FindBy(css = ".css-1tdpez0-option")
	private List<WebElement> selectDoctor;
	
	@FindBy(xpath = "//div[@class='refresh-appointment-list-icon-parent']")
	private WebElement refresh;
	
	@FindBy(css = ".appointment-request-btn")
	private List<WebElement> approve;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement acceptbutton;
	
	@FindBy(css = ".dialog-btn.dialog-btn-type-bordered")
	private WebElement waveoff;
	
	public ApproveButtonFlow(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getdrop()
	{
		return drop;
	}
	public List<WebElement> getselectDoctor()
	{
		return selectDoctor;
	}
	public WebElement getacceptbutton()
	{
		return acceptbutton;
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public List<WebElement> getapprove()
	{
		return approve;
	}
	public WebElement getwaveoff()
	{
		return waveoff;
	}
	
	public ApproveButtonFlow clickdrodown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement dp = drop;
		Thread.sleep(2000);
		dp.click();
		return new ApproveButtonFlow(driver);
	}
	public ApproveButtonFlow selectDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		 List<WebElement> sel = selectDoctor;
		 int count = sel.size();
		 for (int i = 0; i <count ; i++) 
		 {
			 String text = sel.get(i).getText();
			 if (text.equalsIgnoreCase("Saniya")) 
			 {
				 sel.get(i).click();
				 break;
			}
		 }
		return new ApproveButtonFlow(driver);
	}
	public ApproveButtonFlow clickrefreshButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new ApproveButtonFlow(driver);
	}
	public ApproveButtonFlow clickapprovebutton() throws InterruptedException
	{
		List<WebElement> btn = approve;
		int count2 = btn.size();
		 for (int i = 0; i <count2 ; i++) 
		 {
			 String text = approve.get(i).getText();
			 if (text.equalsIgnoreCase("Approve")) 
			 {
				 approve.get(i).click();
				 break;
			}
		}
		return new ApproveButtonFlow(driver);
	}
	public ApproveButtonFlow clickacceptbutton() throws InterruptedException
	{
		WebElement ele2 = waveoff;
		Thread.sleep(2000);
		ele2.click();
		return new ApproveButtonFlow(driver);
	}
}
