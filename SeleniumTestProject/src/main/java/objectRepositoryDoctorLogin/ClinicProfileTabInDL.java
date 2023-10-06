package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicProfileTabInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[5]")
	private WebElement Clinicprofile;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[5]")
	private WebElement Clinicprofile1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public ClinicProfileTabInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getClinicprofile()
	{
		return Clinicprofile;
	}
	public WebElement getClinicprofile1()
	{
		return Clinicprofile1;
	}
	public WebElement getHamurger()
	{
		return Hamurger;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public ClinicProfileTabInDL ClinicProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = Clinicprofile;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new ClinicProfileTabInDL(driver);
	}
	public ClinicProfileTabInDL ClinicProfile1() throws InterruptedException
	{
		Thread.sleep(2000);
		Clinicprofile1.click();
		return new ClinicProfileTabInDL(driver);
	}
	public ClinicProfileTabInDL Hamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamurger.click();
		return new ClinicProfileTabInDL(driver);
	}
	public ClinicProfileTabInDL CrossIcon1() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new ClinicProfileTabInDL(driver);
	}
}
