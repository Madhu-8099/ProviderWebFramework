package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttendButton 
{
	public WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-outline-danger detail mt-1']")
	private WebElement Attend_btn;
	
	@FindBy(xpath="//i[@class='ri-dashboard-line ']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public AttendButton(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAttend_btn()
	{
		return Attend_btn;
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
	public AttendButton Attend_btn() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = Attend_btn;
		Thread.sleep(2000);
		ele.click();
		return new AttendButton(driver);
	}
	public AttendButton Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Dashboard;
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Dashboard.click();
		return new AttendButton(driver);
	}
	public AttendButton Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new AttendButton(driver);
	}
	public AttendButton crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new AttendButton(driver);
	}
}
