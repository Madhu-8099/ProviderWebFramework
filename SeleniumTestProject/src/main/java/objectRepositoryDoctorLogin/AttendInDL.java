package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectRepository.DetailsPage;

public class AttendInDL 
{
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='btn btn-outline-danger detail mt-1']")
	private WebElement AttendButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[1]")
	private WebElement Dashboard;
	
	@FindBy(xpath = "//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamburger;
	
	@FindBy(xpath = "//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement CrossIcon;
	
	public AttendInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAttendButton()
	{
		return AttendButton;
	}
	public WebElement getDashboard2()
	{
		return Dashboard;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossIcon3()
	{
		return CrossIcon;
	}
	public AttendInDL AttendButton1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement button1 = AttendButton;
		Thread.sleep(2000);
		button1.click();
		Thread.sleep(2000);
		return new AttendInDL(driver);
	}
	public AttendInDL Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Dashboard;
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Dashboard.click();
		return new AttendInDL(driver);
	}
	public AttendInDL Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamburger.click();
		return new AttendInDL(driver);
	}
	public AttendInDL crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		CrossIcon.click();
		return new AttendInDL(driver);
	}
}
