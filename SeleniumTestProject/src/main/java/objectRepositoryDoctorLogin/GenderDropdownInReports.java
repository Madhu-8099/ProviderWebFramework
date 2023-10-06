package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class GenderDropdownInReports extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//i[@class='ri-filter-3-line table-filter-icon'])[2]")
	private WebElement genderdrp;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[1]")
	private WebElement Male;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[2]")
	private WebElement Female;
	
	@FindBy(xpath = "//button[@class='table-filter-btn okay-btn']")
	private WebElement ok;
	
	public GenderDropdownInReports(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getgenderdrp()
	{
		return genderdrp;
	}
	public WebElement getMale()
	{
		return Male;
	}
	public WebElement getFemale()
	{
		return Female;
	}
	public WebElement getok()
	{
		return ok;
	}
	public GenderDropdownInReports genderdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		genderdrp.click();
		return new GenderDropdownInReports(driver);
	}
	public GenderDropdownInReports maledropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		Male.click();
		Thread.sleep(2000);
		ok.click();
		return new GenderDropdownInReports(driver);
	}
	public GenderDropdownInReports femaledropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		genderdrp.click();
		Thread.sleep(2000);
		Male.click();
		Thread.sleep(2000);
		Female.click();
		Thread.sleep(2000);
		ok.click();
		return new GenderDropdownInReports(driver);
	}
}
