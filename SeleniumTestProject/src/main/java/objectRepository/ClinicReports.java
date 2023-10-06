package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicReports extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[5]")
	private WebElement ClinicReports;
	
	@FindBy(xpath="//div[@title='Report']")
	private WebElement ClinicReports1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public ClinicReports(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public WebElement getClinicReports()
	{
		return ClinicReports;
	}
	public WebElement getClinicReports1()
	{
		return ClinicReports1;
	}
	public WebElement getHamurger()
	{
		return Hamurger;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public ClinicReports CliniReports() throws InterruptedException
	{
		Thread.sleep(2000);
	 WebElement ele = ClinicReports;
	 Actions act=new Actions(driver);
	 act.moveToElement(ele).build().perform();
	 return new ClinicReports(driver);
	}
	public ClinicReports ClinicReports1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele1 = ClinicReports1;
		Thread.sleep(2000);
		ele1.click();
		return new ClinicReports(driver);
	}
	public ClinicReports Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamurger.click();
		return new ClinicReports(driver);
	}
	public ClinicReports crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		Thread.sleep(2000);
		return new ClinicReports(driver);
	}
}
