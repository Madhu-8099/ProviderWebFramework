package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ExportInReports extends BaseClass
{
	public WebDriver driver;
	@FindBy(className = "ri-share-forward-box-fill me-2")
	private WebElement export;
	
	@FindBy(xpath = "(//input[@class='app-input'])[2]")
	private WebElement xls;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled disable-app-btn")
	private WebElement exportbutton;
	
	public ExportInReports(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getexport()
	{
		return export;
	}
	public WebElement getxls()
	{
		return xls;
	}
	public WebElement getexportbutton()
	{
		return exportbutton;
	}
	public ExportInReports Exports() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ex = export;
		Thread.sleep(2000);
		ex.click();
		return new ExportInReports(driver);
	}
	public ExportInReports clickbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement example = xls;
		Thread.sleep(2000);
		example.click();
		return new ExportInReports(driver);
	}
	public ExportInReports clickExport() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement click = exportbutton;
		Thread.sleep(2000);
		click.click();
		return new ExportInReports(driver);
	}
}
