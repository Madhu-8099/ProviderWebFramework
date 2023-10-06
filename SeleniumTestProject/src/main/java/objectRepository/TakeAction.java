package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class TakeAction extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-danger action mt-2 text-nowrap']")
	private WebElement Action_button;
	
	@FindBy(xpath="//i[@class='ri-dashboard-line ']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public TakeAction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAction_button()
	{
		return Action_button;
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
	public TakeAction Action_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = Action_button;
		Thread.sleep(2000);
		ele.click();
		return new TakeAction(driver);
	}
	public TakeAction Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Dashboard;
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Dashboard.click();
		return new TakeAction(driver);
	}
	public TakeAction Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new TakeAction(driver);
	}
	public TakeAction crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new TakeAction(driver);
	}
}
