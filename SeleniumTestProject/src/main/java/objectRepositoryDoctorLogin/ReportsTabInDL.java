package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ReportsTabInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[4]")
	private WebElement ReportsTab;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[4]")
	private WebElement ReportsTab1;
	
	@FindBy(xpath = "//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamburger;
	
	@FindBy(xpath = "//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement Crossicon;
	
	public ReportsTabInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getReportsTab()
	{
		return ReportsTab;
	}
	public WebElement getReportsTab1()
	{
		return ReportsTab1;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossicon()
	{
		return Crossicon;
	}
	public ReportsTabInDL reporttab() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = ReportsTab;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new ReportsTabInDL(driver);
	}
	public ReportsTabInDL reportstab1() throws InterruptedException
	{
		Thread.sleep(2000);
		ReportsTab1.click();
		return new ReportsTabInDL(driver);
	}
	public ReportsTabInDL Hamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamburger.click();
		return new ReportsTabInDL(driver);
	}
	public ReportsTabInDL Crossicon() throws InterruptedException
	{
		Thread.sleep(2000);
		Crossicon.click();
		return new ReportsTabInDL(driver);
	}
}
