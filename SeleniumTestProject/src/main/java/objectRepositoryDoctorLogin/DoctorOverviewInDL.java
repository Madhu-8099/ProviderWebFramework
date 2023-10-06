package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class DoctorOverviewInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
	private WebElement dropdown;
	
	@FindBy(id = "react-select-5-option-0")
	private WebElement year;
	
	@FindBy(id = "react-select-5-option-1")
	private WebElement Month;
	
	@FindBy(id = "react-select-5-option-2")
	private WebElement Week;
	
	@FindBy(id = "react-select-5-option-3")
	private WebElement day;
	
	@FindBy(xpath = "//input[@class='form-control generate-text']")
	private WebElement widget1;
	
	@FindBy(xpath = "//button[@class='dialog-btn dialog-btn-type-filled']")
	private WebElement confirmbutton;
	
	public DoctorOverviewInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getdropdown()
	{
		return dropdown;
	}
	public WebElement getyear()
	{
		return year;
	}
	public WebElement getMonth()
	{
		return Month;
	}
	public WebElement getWeek()
	{
		return Week;
	}
	public WebElement getday()
	{
		return day;
	}
	public WebElement getwidget1()
	{
		return widget1;
	}
	public WebElement getconfirmbutton()
	{
		return confirmbutton;
	}
	
	public DoctorOverviewInDL dropdownDL() throws InterruptedException
	{
		Thread.sleep(2000);
		dropdown.click();
		return new DoctorOverviewInDL(driver);
	}
	public DoctorOverviewInDL currentYear() throws InterruptedException
	{
		Thread.sleep(2000);
		year.click();
		return new DoctorOverviewInDL(driver);
	}
	public DoctorOverviewInDL currentMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(2000);
		 Month.click();
		return new DoctorOverviewInDL(driver);
	}
	public DoctorOverviewInDL currentWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(2000);
		Week.click();
		return new DoctorOverviewInDL(driver);
	}
	public DoctorOverviewInDL currentDay() throws InterruptedException
	{
		Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(2000);
		day.click();
		return new DoctorOverviewInDL(driver);
	}
	public DoctorOverviewInDL selectdate(String date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement datewid = widget1;
		Thread.sleep(2000);
		datewid .sendKeys(date);
		return new DoctorOverviewInDL(driver);
	}
	public DoctorOverviewInDL ConfirmButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cb = confirmbutton;
		Thread.sleep(2000);
		cb.click();
		return new DoctorOverviewInDL(driver);
	}
}
