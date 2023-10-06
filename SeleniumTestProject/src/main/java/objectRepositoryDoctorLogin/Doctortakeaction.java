package objectRepositoryDoctorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class Doctortakeaction extends BaseClass
{
	public WebDriver driver;
	@FindBy(css = ".p-2")
	private WebElement Take_action;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[1]")
	private WebElement Dashboard;
	
	@FindBy(className = "ri-menu-line hamburger open-panel nav-toggle")
	private WebElement Hamburger;
	
	@FindBy(className = "ri-close-line hamburger open-panel nav-toggle")
	private WebElement CrossIcon;
	
	public Doctortakeaction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTake_action()
	{
		return Take_action;
	}
	public WebElement getDashboard()
	{
		return Dashboard;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossIcon()
	{
		return CrossIcon;
	}
	public Doctortakeaction Take_action1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = Take_action;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.body.style.zoom='110%'");
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		return new Doctortakeaction(driver);
	}
	public Doctortakeaction Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Dashboard;
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Dashboard.click();
		return new Doctortakeaction(driver);
	}
	public Doctortakeaction Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamburger.click();
		return new Doctortakeaction(driver);
	}
	public Doctortakeaction crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		CrossIcon.click();
		return new Doctortakeaction(driver);
	}
}
