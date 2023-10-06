package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicDashboard extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath="//i[@class='appointment-request-filter ri-filter-3-fill me-3']")
	private WebElement Patient_button;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement All_button;
	
	@FindBy(xpath="//button[@class='table-filter-btn okay-btn']")
	private WebElement okay_button;
	
	@FindBy(xpath="(//input[@class='appointment-request-checkbox'])[2]")
	private WebElement video_button;
	
	@FindBy(xpath="(//input[@class='appointment-request-checkbox'])[3]")
	private WebElement Audio_button;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	private WebElement House_call;
	
	public ClinicDashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPatient_button() {
		return Patient_button;
	}
	public WebElement getAll_button() {
		return All_button;
	}
	public WebElement getokay_button() {
		return okay_button;
	}
	public WebElement getvideo_button() {
		return video_button;
	}
	public WebElement getAudio_button() {
		return Audio_button;
	}
	public WebElement getHouse_call() {
		return House_call;
	}
	public ClinicDashboard Patient_button() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Patient_button;
		Thread.sleep(2000);
		ele.click();
		return new ClinicDashboard(driver);
	}
	public ClinicDashboard All_button() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele1 = All_button;
		Thread.sleep(1000);
		ele1.click();
		Thread.sleep(1000);
		okay_button.click();
		return new ClinicDashboard(driver);
	}
	public ClinicDashboard video_button() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Patient_button;
		Thread.sleep(2000);
		ele.click();
		WebElement ele1 = All_button;
		Thread.sleep(1000);
		ele1.click();
		Thread.sleep(2000);
		WebElement ele2 = video_button;
		Thread.sleep(1000);
		ele2.click();
		Thread.sleep(1000);
		okay_button.click();
		return new ClinicDashboard(driver);
	}
	public ClinicDashboard Audio_button() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Patient_button;
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		WebElement ele2 = video_button;
		Thread.sleep(1000);
		ele2.click();
		Thread.sleep(2000);
		WebElement ele3 = Audio_button;
		Thread.sleep(1000);
		ele3.click();
		Thread.sleep(1000);
		okay_button.click();
		return new ClinicDashboard(driver);
	}
	public ClinicDashboard House_call() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Patient_button;
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		WebElement ele3 = Audio_button;
		Thread.sleep(1000);
		ele3.click();
		Thread.sleep(2000);
		WebElement ele4 = House_call;
		Thread.sleep(1000);
		ele4.click();
		Thread.sleep(1000);
		okay_button.click();
		return new ClinicDashboard(driver);
	}
	
}
