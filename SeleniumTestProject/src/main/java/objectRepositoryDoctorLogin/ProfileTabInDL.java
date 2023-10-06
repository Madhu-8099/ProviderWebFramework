package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ProfileTabInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[6]")
	private WebElement ProfileTab;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[6]")
	private WebElement ProfileTab1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public ProfileTabInDL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProfileTab()
	{
		return ProfileTab;
	}
	public WebElement getProfileTab1()
	{
		return ProfileTab1;
	}
	public WebElement getHamurger()
	{
		return Hamurger;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public ProfileTabInDL ProfileTab() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement pt = ProfileTab;
		 Actions act=new Actions(driver);
		 act.moveToElement(pt).build().perform();
		 return new ProfileTabInDL(driver);
	}
	public ProfileTabInDL ProfileTab1() throws InterruptedException
	{
		Thread.sleep(2000);
		ProfileTab1.click();
		 return new ProfileTabInDL(driver);
	}
	public ProfileTabInDL Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamurger.click();
		return new ProfileTabInDL(driver);
	}
	public ProfileTabInDL crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new ProfileTabInDL(driver);
	}
}
