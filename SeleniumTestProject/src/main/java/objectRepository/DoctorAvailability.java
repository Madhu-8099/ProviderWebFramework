package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorAvailability 
{
	public WebDriver driver;
	@FindBy(xpath="//span[text()='Doctor Availability']")
	private WebElement Doctor_Availability;
	
	@FindBy(xpath="(//td[@class='doctor-detail-work d-flex text-nowrap'])[1]")
	private WebElement Doctor_Name;
	
	@FindBy(xpath="//i[@class='ri-dashboard-line ']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public DoctorAvailability(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDoctor_Availability()
	{
		return Doctor_Availability;
	}
	public WebElement getDoctor_Name()
	{
		return Doctor_Name;
	}
	public WebElement getDashboard() {
		return Dashboard;
	}
	public WebElement getHamurger() {
		return Hamurger;
	}
	public WebElement getcrossIcon() {
		return crossIcon;
	}
	public DoctorAvailability Doctor_Availability() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele =Doctor_Availability;
		Thread.sleep(2000);
		ele.click();
		return new DoctorAvailability(driver);
	}
	public DoctorAvailability Doctor_Name() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Doctor_Name;
		Thread.sleep(2000);
		Doctor_Name.click();
		return new DoctorAvailability(driver);
	}
	public DoctorAvailability Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Dashboard;
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Dashboard.click();
		return new DoctorAvailability(driver);
	}
	public DoctorAvailability Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new DoctorAvailability(driver);
	}
	public DoctorAvailability crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new DoctorAvailability(driver);
	}
	
}
