package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class StartButtonInClinic extends BaseClass 
{
	public WebDriver driver;
	@FindBy(xpath = "//div[@class='chat-container-primary me-3']")
	private List<WebElement> Time_dropdown;
	
	@FindBy(className = " css-w32ibi-option")
	private WebElement select_dropdown;
	
	@FindBy(xpath="//div[@class=' css-15lsz6c-indicatorContainer']")
	private WebElement Doctor_dropdown;
	
	@FindBy(id="react-select-7-option-2")
	private WebElement select_doctor;
	
	@FindBy(css = ".call-btn.call-btn-start")
	private List<WebElement> start_button;
	
	public StartButtonInClinic(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public List<WebElement> getTime_dropdown()
	{
		return Time_dropdown;
	}
	public WebElement getselect_dropdown()
	{
		return select_dropdown;
	}
	public WebElement getDoctor_dropdown()
	{
		return Doctor_dropdown;
	}
	public WebElement getselect_doctor()
	{
		return select_doctor;
	}
	public List<WebElement> getstart_button()
	{
		return start_button;
	}
	public StartButtonInClinic Time_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> ele = Time_dropdown;
		int count = ele.size();
		for (int i = 0; i < count; i++) 
		{
			driver.findElement(By.xpath("(//div[@class='chat-container-primary me-3'])[1]")).click();
		}
		return new StartButtonInClinic(driver);
	}
	public StartButtonInClinic start_button() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> ele3 = start_button;
		int count = ele3.size();
		Thread.sleep(2000);
		for (int i = 0; i < count; i++) 
		{
			driver.findElement(By.xpath("(//button[@class='call-btn call-btn-start'])[1]")).click();
			break;
		}
		return new StartButtonInClinic(driver);
	}
}
