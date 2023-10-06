package objectRepositoryDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentForAudio 
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[1]/ul/li/div[2]")
	private WebElement Appointmentpage;
	
	@FindBy(css = ".ri-menu-line.hamburger.open-panel.nav-toggle")
	private WebElement Hamburger;
	
	@FindBy(css = ".ri-close-line.hamburger.open-panel.nav-toggle")
	private WebElement Crossicon;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[3]")
	private WebElement clickdp;
	
	@FindBy(css  = ".css-1tdpez0-option")
	private List<WebElement> selectD;
	
	@FindBy(css = ".refresh-appointment-list-icon-parent")
	private WebElement ButtonRefresh;
	
	@FindBy(xpath = "//span[contains(text(), 'AUDIO')]")
	private List<WebElement> Searchaudio;
	
	@FindBy(xpath = "(//div[@class='mini-layout-body'])[2]")
	private WebElement JoinButton;
	
	@FindBy(xpath = "//button[@class='zm-btn join-audio-by-voip__join-btn zm-btn--primary zm-btn__outline--white zm-btn--lg']")
	private WebElement Alertmessage;
	
	@FindBy(xpath = "//div[@class='footer__leave-btn-container']")
	private WebElement LeaveButton;
	
	@FindBy(xpath = "//button[@class='zmu-btn leave-meeting-options__btn leave-meeting-options__btn--default leave-meeting-options__btn--danger zmu-btn--default zmu-btn__outline--white']")
	private WebElement EndMeeting;
	
	public AppointmentForAudio(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getAppointmentpage()
	{
		return Appointmentpage;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossicon()
	{
		return Crossicon;
	}
	public WebElement getclickdp()
	{
		return clickdp;
	}
	public List<WebElement> getselectDoctor()
	{
		return selectD;
	}
	public WebElement getButtonRefresh()
	{
		return ButtonRefresh;
	}
	public List<WebElement> getSearchaudio()
	{
		return Searchaudio;
	}
	public WebElement getJoinButton()
	{
		return JoinButton;
	}
	public WebElement getAlertmessage()
	{
		return Alertmessage;
	}
	public WebElement getLeaveButton()
	{
		return LeaveButton;
	}
	public WebElement getEndMeeting()
	{
		return EndMeeting;
	}
	public AppointmentForAudio ClickAppointmentsPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Appointmentpage;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 ele.click();
		 return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickHamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ham = Hamburger;
		Thread.sleep(2000);
		ham.click();
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickCrossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = Crossicon;
		Thread.sleep(2000);
		cross.click();
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drop = clickdp;
		Thread.sleep(2000);
		drop.click();
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio SelectDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> doctors = selectD;
		int count = doctors.size();
		for (int i = 0; i < count; i++) 
		{
			String text = doctors.get(i).getText();
			if (text.equalsIgnoreCase("Michela")) 
			{
				doctors.get(i).click();
				break;
			}
		}
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio RefreshPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement button = ButtonRefresh;
		Thread.sleep(2000);
		button.click();
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio SearchAudioButton() throws InterruptedException
	{
		Thread.sleep(2000);
		int count = Searchaudio.size();
		System.out.println(count);
	    int i=1; 
			while(i<count)
			{
		    WebElement element = driver.findElement(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[3]"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		    Thread.sleep(2000); 
		}
			return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickJoin() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement join = JoinButton;
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", join);
		Thread.sleep(2000);
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickAlertMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement msg = Alertmessage;
		Thread.sleep(2000);
		msg.click();
		Thread.sleep(2000);
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickEndButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement end = LeaveButton;
		Thread.sleep(2000);
		end.click();
		Thread.sleep(2000);
		return new AppointmentForAudio(driver);
	}
	public AppointmentForAudio ClickLeaveButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement end = EndMeeting;
		Thread.sleep(2000);
		end.click();
		Thread.sleep(2000);
		return new AppointmentForAudio(driver);
	}
	
}
