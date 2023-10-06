package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;
import objectRepository.DetailsPage;

public class DetailsButton extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='btn btn-outline-danger detail mt-1']")
	private WebElement Details_btn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[1]")
	private WebElement Dashboard;
	
	@FindBy(xpath = "//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamburger;
	
	@FindBy(xpath = "//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement CrossIcon;
	
	public DetailsButton(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDetails_btn()
	{
		return Details_btn;
	}
	public WebElement getDashboard2()
	{
		return Dashboard;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossIcon3()
	{
		return CrossIcon;
	}
	public DetailsButton Details_btn1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement button1 = Details_btn;
		Thread.sleep(2000);
		button1.click();
		Thread.sleep(2000);
		return new DetailsButton(driver);
	}
	public DetailsPage Dashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Dashboard;
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Dashboard.click();
		return new DetailsPage(driver);
	}
	public DetailsPage Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		Hamburger.click();
		return new DetailsPage(driver);
	}
	public DetailsPage crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		CrossIcon.click();
		return new DetailsPage(driver);
	}
}
