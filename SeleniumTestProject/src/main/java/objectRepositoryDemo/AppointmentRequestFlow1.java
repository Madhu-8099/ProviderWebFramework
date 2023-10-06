package objectRepositoryDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AppointmentRequestFlow1 extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[3]")
	private WebElement AppointmentRequest;
	
	@FindBy(css = ".ri-menu-line.hamburger.open-panel.nav-toggle")
	private WebElement Hamburger;
	
	@FindBy(css = ".ri-close-line.hamburger.open-panel.nav-toggle")
	private WebElement CrossIcon;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[3]")
	private WebElement Dropdown;
	
	@FindBy(css =  ".css-1tdpez0-option")
	private List<WebElement> Doctorslist;
	
	@FindBy(css = ".refresh-appointment-list-icon-parent")
	private WebElement Refresh;
	
	@FindBy(xpath = "//*[@id=\"ACTION_BUTTON\"]")
	private List<WebElement> approvebtn;
	
	@FindBy(css = ".dialog-btn.dialog-btn-type-bordered")
	private WebElement Waveoff;
	
	public AppointmentRequestFlow1(WebDriver driver2)
	{
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
	public WebElement getDropdown()
	{
		return Dropdown;
	}
	public List<WebElement> getDoctorslist()
	{
		return Doctorslist;
	}
	public WebElement getRefresh()
	{
		return Refresh;
	}
	public List<WebElement> getapprovebtn()
	{
		return approvebtn;
	}
	public WebElement getWaveoff()
	{
		return Waveoff;
	}
	public AppointmentRequestFlow1 NavigateToAR() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement ele = AppointmentRequest;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 ele.click();
		return new AppointmentRequestFlow1(driver);
	}
	public AppointmentRequestFlow1 ClickHamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ham = Hamburger;
		Thread.sleep(2000);
		ham.click();
		return new AppointmentRequestFlow1(driver);
	}
	public AppointmentRequestFlow1 ClickCross() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = CrossIcon;
		Thread.sleep(2000);
		cross.click();
		return new AppointmentRequestFlow1(driver);
	}
	public AppointmentRequestFlow1 ClickDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement down = Dropdown;
		Thread.sleep(2000);
		down.click();
		return new AppointmentRequestFlow1(driver);
	}
	public AppointmentRequestFlow1 ClickselectDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> list = Doctorslist;
		int count = list.size();
		for (int i = 0; i < count; i++)
		{
			String text = list.get(i).getText();
			if (text.equalsIgnoreCase("Michela")) 
			{
				list.get(i).click();
				break;
			}
		}
		return new AppointmentRequestFlow1(driver);	
	}
	public AppointmentRequestFlow1 Clickrefresh() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = Refresh;
		Thread.sleep(2000);
		ref.click();
		return new AppointmentRequestFlow1(driver);
	}
	public AppointmentRequestFlow1 clickApproveButton() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> buttons = approvebtn;
		int count1 = buttons.size();
		for (int i = 0; i < count1; i++) 
		{
			String text = buttons.get(i).getText();
			if (text.equalsIgnoreCase("Approve"))
			{
				buttons.get(i).click();
				break;
			}
		}
		return new AppointmentRequestFlow1(driver);
	}
	public AppointmentRequestFlow1 ClickWaveOffButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement off = Waveoff;
		Thread.sleep(2000);
		off.click();
		return new AppointmentRequestFlow1(driver);
		
	}
}
