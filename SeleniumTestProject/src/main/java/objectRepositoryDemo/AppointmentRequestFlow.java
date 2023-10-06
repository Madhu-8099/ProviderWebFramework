package objectRepositoryDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;


public class AppointmentRequestFlow extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentRequest;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentReq1;
	
	@FindBy(xpath = "//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath = "//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
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
	

	public AppointmentRequestFlow(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getAppointmentRequest()
	{
		return AppointmentRequest;
	}
	public WebElement getAppointmentReq1() {
		return AppointmentReq1;
	}
	public WebElement getHamburger() {
		return Hamurger;
	}
	public WebElement getcrossIcon() {
		return crossIcon;
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
	public AppointmentRequestFlow AppointmentRequest() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentRequest;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow AppointmentReq1() throws InterruptedException
	{
		Thread.sleep(2000);
		AppointmentReq1.click();
		return new AppointmentRequestFlow(driver);
	}
	
	public AppointmentRequestFlow Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		Thread.sleep(2000);
		return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow clickdrodown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement dp = drop;
		Thread.sleep(2000);
		dp.click();
		return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow selectDoctor() throws InterruptedException
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
		return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow clickrefreshButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow clickapprovebutton() throws InterruptedException
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
		return new AppointmentRequestFlow(driver);
	}
	public AppointmentRequestFlow clickacceptbutton() throws InterruptedException
	{
		WebElement ele2 = waveoff;
		Thread.sleep(2000);
		ele2.click();
		return new AppointmentRequestFlow(driver);
	}
}
