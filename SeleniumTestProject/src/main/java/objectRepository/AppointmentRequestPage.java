package objectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AppointmentRequestPage extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentRequest;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentReq1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	

	public AppointmentRequestPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAppointmentRequest()
	{
		return AppointmentRequest;
	}
	public WebElement getAppointmentReq1() {
		return AppointmentReq1;
	}
	public WebElement getDashboard() {
		return Dashboard;
	}
	public WebElement getHamburger() {
		return Hamurger;
	}
	public WebElement getcrossIcon() {
		return crossIcon;
	}
	public AppointmentRequestPage AppointmentRequest() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentRequest;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new AppointmentRequestPage(driver);
	}
	public AppointmentRequestPage AppointmentReq1() throws InterruptedException
	{
		Thread.sleep(2000);
		AppointmentReq1.click();
		return new AppointmentRequestPage(driver);
	}
	public AppointmentRequestPage Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		Dashboard.click();
		return new AppointmentRequestPage(driver);
	}
	public AppointmentRequestPage Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new AppointmentRequestPage(driver);
	}
	public AppointmentRequestPage crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new AppointmentRequestPage(driver);
	}
}
