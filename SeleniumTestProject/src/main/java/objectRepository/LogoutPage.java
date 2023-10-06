package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class LogoutPage extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//i[@class='ri-logout-box-line me-2']")
	private WebElement Log_out;
	
	@FindBy(xpath="//i[@class='ri-logout-box-line me-2']")
	private WebElement logout;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamburger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossbutton;
	
	@FindBy(xpath="//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement Yes_button;
	
	@FindBy(xpath="//i[@class='ri-close-line dialog-close icon-hover-bg']")
	private WebElement cross_icon;
	
	
	public LogoutPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLog_out() {
	return Log_out;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getHamburger() {
		return Hamburger;
	}
	public WebElement getdash_button() {
		return  crossbutton;
	}
	public WebElement getYes_button() {
		return Yes_button;
	}
	public WebElement getcross_icon() {
		return cross_icon;
	}
	public LogoutPage Logoutbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Log_out;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		return new LogoutPage(driver);
	}
	public LogoutPage logOut() {
		logout.click();
		return new LogoutPage(driver);
	}
	public LogoutPage Hamburger() {
		Hamburger.click();
		return new LogoutPage(driver);
	}
	public LogoutPage crossbutton() {
		crossbutton.click();
		return new LogoutPage(driver);
	}
	public LogoutPage clickonYes() throws InterruptedException
	{
		Thread.sleep(2000);
		Yes_button.click();
		return new LogoutPage(driver);
	}
	public LogoutPage cliconCrossicon()
	{
		cross_icon.click();
		return new LogoutPage(driver);
	}
	 
}
