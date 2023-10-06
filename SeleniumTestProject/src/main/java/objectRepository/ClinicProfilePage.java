package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicProfilePage extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[6]/div/div")
	private WebElement ClinicProfilePage;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[6]/div/div")
	private WebElement ClickClinicProfile;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public ClinicProfilePage(WebDriver driver1){
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getClinicProfilePage()
	{
		return ClinicProfilePage;
	}
	public WebElement getClickClinicProfile()
	{
		return ClickClinicProfile;
	}
	public WebElement getHamurger()
	{
		return Hamurger;
	}
	public WebElement getcrossIcon()
	{
		return crossIcon;
	}
	public ClinicProfilePage ClinicProfilePage1() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = ClinicProfilePage;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 ele.click();
		 return new ClinicProfilePage(driver);
	}

	public ClinicProfilePage Hamurger() throws InterruptedException
	{
		Thread.sleep(1000);
		 Hamurger.click();
		return new ClinicProfilePage(driver);
	}
	public ClinicProfilePage crossIcon() throws InterruptedException
	{
		Thread.sleep(1000);
		crossIcon.click();
		return new ClinicProfilePage(driver);
	}
	
}
