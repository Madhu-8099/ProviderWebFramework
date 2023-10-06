package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicOverviewInCR extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
	private WebElement YearDropdown;
	
	@FindBy(id = "react-select-6-option-0")
	private WebElement CurrentYear;
	
	@FindBy(id = "react-select-6-option-1")
	private WebElement CurrentMonth;
	
	@FindBy(id = "react-select-6-option-2")
	private WebElement CurrentWeek;
	
	@FindBy(id = "react-select-6-option-3")
	private WebElement custom;
	
	@FindBy(xpath = "(//input[@class='form-control generate-text'])[1]")
	private WebElement DatePage;
	
	@FindBy(className = "dialog-footer")
	private WebElement Confirm_button;
	
	public ClinicOverviewInCR(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getYearDropdown()
	{
		return YearDropdown;
	}
	public WebElement getCurrentYear()
	{
		return CurrentYear;
	}
	public WebElement getCurrentMonth()
	{
		return CurrentMonth;
	}
	public WebElement getCurrentWeek()
	{
		return CurrentWeek;
	}
	public WebElement getcustom()
	{
		return custom;
	}
	public WebElement getDatePage()
	{
		return DatePage;
	}
	public WebElement getConfirm_button()
	{
		return Confirm_button;
	}
	public ClinicOverviewInCR YearDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element = YearDropdown;
		Thread.sleep(2000);
		element.click();
		return new ClinicOverviewInCR(driver);
	}
	public ClinicOverviewInCR CurrentYear() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element1 = CurrentYear;
		Thread.sleep(2000);
		element1.click();
		return new ClinicOverviewInCR(driver);
	}
	public ClinicOverviewInCR CurrentMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		YearDropdown.click();
		Thread.sleep(2000);
		WebElement element2 = CurrentMonth;
		Thread.sleep(2000);
		element2.click();
		return new ClinicOverviewInCR(driver);
	}
	public ClinicOverviewInCR CurrentWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		YearDropdown.click();
		Thread.sleep(2000);
		WebElement ele = CurrentWeek;
		Thread.sleep(2000);
		ele.click();
		return new ClinicOverviewInCR(driver);
	}
	public ClinicOverviewInCR CurrentDay() throws InterruptedException
	{
		Thread.sleep(2000);
		YearDropdown.click();
		Thread.sleep(2000);
		WebElement ele1 = custom;
		Thread.sleep(2000);
		ele1.click();
		Thread.sleep(2000);
		return new ClinicOverviewInCR(driver);
	}
	public ClinicOverviewInCR DatePage(String Date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date = DatePage;
		Thread.sleep(2000);
		date.sendKeys(Date);
		Thread.sleep(2000);
		return new ClinicOverviewInCR(driver);
	}
	public ClinicOverviewInCR Confirm_button() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement confirm = Confirm_button;
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
		return new ClinicOverviewInCR(driver);
	}
}
