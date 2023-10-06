package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDoctorPage 
{
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[4]")
	private WebElement ManageDoctor;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[4]")
	private WebElement ManageDoctor1;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamurger;
	
	@FindBy(xpath="//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement crossIcon;
	

	public ManageDoctorPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getManageDoctor()
	{
		return ManageDoctor;
	}
	public WebElement getManageDoctor1() {
		return ManageDoctor1;
	}
	public WebElement getDashboard() {
		return Dashboard;
	}
	public WebElement getHamburger() {
		return Hamurger;
	}
	public WebElement getcrossIcon() {
		return crossIcon;
	}
	public ManageDoctorPage ManageDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = ManageDoctor;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 return new ManageDoctorPage(driver);
	}
	public ManageDoctorPage ManageDoctor1() throws InterruptedException
	{
		Thread.sleep(2000);
		ManageDoctor1.click();
		return new ManageDoctorPage(driver);
	}
	public ManageDoctorPage Hamurger() throws InterruptedException
	{
		Thread.sleep(2000);
		 Hamurger.click();
		return new ManageDoctorPage(driver);
	}
	public ManageDoctorPage crossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		crossIcon.click();
		return new ManageDoctorPage(driver);
	}

	
}
