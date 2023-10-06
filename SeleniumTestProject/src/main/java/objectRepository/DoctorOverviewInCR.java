package objectRepository;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class DoctorOverviewInCR extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = " (//div[@class=' css-a32xp9-control'])[2]")
	private WebElement Doctor_dropdown;
	
	@FindBy(id = "react-select-7-option-0")
	private WebElement FirstDoctor;
	
	@FindBy(id = "react-select-7-option-1")
	private WebElement SecondDoctor;
	
	@FindBy(id = "react-select-7-option-2")
	private WebElement ThirdDoctor;
	
	@FindBy(xpath = "(//div[@class=' css-1wy0on6'])[4]")
	private WebElement Year_Dropdown;
	
	@FindBy(id = "react-select-8-option-0")
	private WebElement Current_Year;
	
	@FindBy(id = "react-select-8-option-1")
	private WebElement Current_Month;
	
	@FindBy(id = "react-select-8-option-2")
	private WebElement Current_Week;
	
	@FindBy(id = "react-select-8-option-3")
	private WebElement Custom1;
	
	@FindBy(xpath = "(//input[@class='form-control generate-text'])[1]")
	private WebElement DatePage1;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement Confirm_button;
	
	public DoctorOverviewInCR(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDoctor_dropdown()
	{
		return Doctor_dropdown;
	}
	public WebElement getFirstDoctor()
	{
		return FirstDoctor;
	}
	public WebElement getSecondDoctor()
	{
		return SecondDoctor;
	}
	public WebElement getThirdDoctor()
	{
		return ThirdDoctor;
	}
	public WebElement getYear_Dropdown()
	{
		return  Year_Dropdown;
	}
	public WebElement getCurrent_Year()
	{
		return  Current_Year;
	}
	public WebElement getCurrent_Month()
	{
		return Current_Month;
	}
	public WebElement getCurrent_Week()
	{
		return Current_Week;
	}
	public WebElement getCustom1()
	{
		return Custom1;
	}
	public WebElement getDatePage1()
	{
		return DatePage1;
	}
	public WebElement getConfirm_button()
	{
		return Confirm_button;
	}
	public DoctorOverviewInCR Doctor_dropdown1() throws InterruptedException
	{
		Thread.sleep(2000);
		Doctor_dropdown.click();
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR SecondDoctor1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele2 = SecondDoctor;
		Thread.sleep(2000);
		ele2.click();
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR FirstDoctor1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele1 = FirstDoctor;
		Thread.sleep(2000);
		ele1.click();
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR ThirdDoctor1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele3 = ThirdDoctor;
		Thread.sleep(2000);
		ele3.click();
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR Year_Dropdown1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element = Year_Dropdown;
		Thread.sleep(2000);
		element.click();
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR Current_Year() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element1 = Current_Year;
		Thread.sleep(2000);
		element1.click();
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR Current_Month() throws InterruptedException
	{
		Thread.sleep(2000);
		Year_Dropdown.click();
		Thread.sleep(2000);
		WebElement element2 = Current_Month;
		Thread.sleep(2000);
		element2.click();
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR Current_Week() throws InterruptedException
	{
		Thread.sleep(2000);
		Year_Dropdown.click();
		Thread.sleep(2000);
		WebElement ele =Current_Week;
		Thread.sleep(2000);
		ele.click();
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR Custom1() throws InterruptedException
	{
		Thread.sleep(2000);
		Year_Dropdown.click();
		Thread.sleep(2000);
		WebElement ele1 = Custom1;
		Thread.sleep(2000);
		ele1.click();
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR DatePage(String Date) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement date = DatePage1;
		Thread.sleep(2000);
		date.sendKeys(Date);
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	public DoctorOverviewInCR Confirm_button() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement confirm = Confirm_button;
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
		return new DoctorOverviewInCR(driver);
	}
	
}
