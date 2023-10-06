package objectRepositoryDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class BookAppointmentApprove extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentRequest;
	
	@FindBy(css = ".ri-menu-line.hamburger.open-panel.nav-toggle")
	private WebElement Hamburger;
	
	@FindBy(css = ".ri-close-line.hamburger.open-panel.nav-toggle")
	private WebElement CrossIcon;
	
	@FindBy(xpath = "//div[@class='refresh-appointment-list-icon-parent']")
	private WebElement refresh;
	
	@FindBy(xpath = "//span[contains(text(),'NORMAL')]")
	private List<WebElement> Normal;
	
	@FindBy(xpath = "//button[text()='Approve']")
	private WebElement approve;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement acceptbutton;
	
	
	public BookAppointmentApprove(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getAppointmentRequest()
	{
		return AppointmentRequest;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossIcon()
	{
		return CrossIcon;
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getapprove()
	{
		return approve;
	}
	public WebElement getacceptbutton()
	{
		return acceptbutton;
	}
	public BookAppointmentApprove NavigateToAR() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentRequest;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 ele.click();
		return new BookAppointmentApprove(driver);
	}
	public BookAppointmentApprove ClickHamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ham = Hamburger;
		Thread.sleep(2000);
		ham.click();
		return new BookAppointmentApprove(driver);
	}
	public BookAppointmentApprove ClickCross() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = CrossIcon;
		Thread.sleep(2000);
		cross.click();
		return new BookAppointmentApprove(driver);
	} 
	public BookAppointmentApprove clickrefreshButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new BookAppointmentApprove(driver);
	}
	public BookAppointmentApprove selectNormalText() throws InterruptedException
	{
		Thread.sleep(2000);
		int count = Normal.size();
	    int i=1; 
			while(i<count)
			{
		    WebElement element = driver.findElement(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[3]"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		    Thread.sleep(2000); 
		}
		return new BookAppointmentApprove(driver);
	}
	public BookAppointmentApprove clickapprovebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		approve.click();
		return new BookAppointmentApprove(driver);
	}
	public BookAppointmentApprove clickacceptbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		acceptbutton.click();
		return new BookAppointmentApprove(driver);
	}
}
