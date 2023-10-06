package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage
{
	public WebDriver driver;
	@FindBy(xpath="(//button[text()='Details'])[1]")
	private WebElement Details_button;
	
	@FindBy(xpath="//i[@class='ri-dashboard-line ']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	
	public DetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDetails_button()
	{
		return Details_button;
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
	public DetailsPage Details_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = Details_button;
		Thread.sleep(2000);
		ele.click();
		return new DetailsPage(driver);
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
		 Hamurger.click();
		return new DetailsPage(driver);
	}
	public DetailsPage crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new DetailsPage(driver);
	}
}
