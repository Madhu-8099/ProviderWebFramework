package objectRepositoryDoctorLogin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorLogout 
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/nav/div[2]")
	private WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/nav/div[2]")
	private WebElement logouttab;
	
	@FindBy(className = "ri-menu-line hamburger open-panel nav-toggle")
	private WebElement Hamburger;
	
	@FindBy(className = "ri-close-line hamburger open-panel nav-toggle")
	private WebElement Crossicon;
	
	public DoctorLogout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getlogout()
	{
		return logout;
	}
	public WebElement getlogouttab()
	{
		return logouttab;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossicon()
	{
		return Crossicon;
	}
	public DoctorLogout logouttab() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		WebElement lp = logout;
		 Actions act=new Actions(driver);
		 act.moveToElement(lp).build().perform();
		 return new DoctorLogout(driver);
	}
	public DoctorLogout logoutpage() throws InterruptedException
	{
		Thread.sleep(2000);
		logouttab.click();
		return new DoctorLogout(driver);
	}
	public DoctorLogout clickhamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamburger.click();
		return new DoctorLogout(driver);
	}
	public DoctorLogout clickcrossicon() throws InterruptedException
	{
		Thread.sleep(2000);
		Crossicon.click();
		return new DoctorLogout(driver);
	}
}
