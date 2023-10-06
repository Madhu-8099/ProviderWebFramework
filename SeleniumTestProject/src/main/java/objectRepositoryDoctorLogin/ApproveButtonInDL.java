package objectRepositoryDoctorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ApproveButtonInDL extends BaseClass 
{
	public WebDriver driver;
	@FindBy(xpath = "//i[@class='ri-refresh-line refresh-appointment-list-icon']")
	private WebElement refresh;
	
	@FindBy(xpath = "/html/body/div/div/div[4]/div/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/div[4]/button[1]")
	private WebElement Approve_btn;
	
	@FindBy(xpath = "/html/body/div/div/div[4]/div/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/div[4]/button[1]")
	private WebElement Approve_btn1;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-bordered']")
	private WebElement waveoff;
	
	public ApproveButtonInDL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getApprove_btn()
	{
		return Approve_btn;
	}
	public WebElement getApprove_btn1()
	{
		return Approve_btn1;
	}
	public WebElement getwaveoff()
	{
		return waveoff;
	}
	public ApproveButtonInDL refreshbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement icon = refresh;
		Thread.sleep(2000);
		icon.click();
		return new ApproveButtonInDL(driver);
	}
	public ApproveButtonInDL approvebutton() throws InterruptedException
	{
		WebElement Abtn = Approve_btn;
		Thread.sleep(2000);
		 WebElement ele = Approve_btn;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		return new ApproveButtonInDL(driver);
	}
	public ApproveButtonInDL approvebutton1() throws InterruptedException
	{
		Thread.sleep(2000);
		Approve_btn1.click();
		return new ApproveButtonInDL(driver);
	}
	public ApproveButtonInDL waveOffbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		waveoff.click();
		return new ApproveButtonInDL(driver);
	}
}
