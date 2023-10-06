package objectRepositoryDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentForHouse 
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
	
	@FindBy(xpath = "//span[contains(text(), 'HOUSE CALL')]")
	private List<WebElement> Searchhouse;
	
	public AppointmentForHouse(WebDriver driver2) 
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
		return Searchhouse;
	}
	
	public AppointmentForHouse ClickAppointmentsPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Appointmentpage;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 ele.click();
		 return new AppointmentForHouse(driver);
	}
	public AppointmentForHouse ClickHamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ham = Hamburger;
		Thread.sleep(2000);
		ham.click();
		return new AppointmentForHouse(driver);
	}
	public AppointmentForHouse ClickCrossIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = Crossicon;
		Thread.sleep(2000);
		cross.click();
		return new AppointmentForHouse(driver);
	}
	public AppointmentForHouse ClickDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement drop = clickdp;
		Thread.sleep(2000);
		drop.click();
		return new AppointmentForHouse(driver);
	}
	public AppointmentForHouse SelectDoctor() throws InterruptedException
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
		return new AppointmentForHouse(driver);
	}
	public AppointmentForHouse RefreshPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement button = ButtonRefresh;
		Thread.sleep(2000);
		button.click();
		return new AppointmentForHouse(driver);
	}
	public AppointmentForHouse SearchHouseButton() throws InterruptedException
	{
		Thread.sleep(2000);
		int count = Searchhouse.size();
	    int i=1; 
			while(i<count)
			{
		    WebElement element = driver.findElement(By.xpath("(//*[@id=\"ACTION_BUTTON\"])[3]"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		    Thread.sleep(2000); 
		}
			return new AppointmentForHouse(driver);
	}
	
}
