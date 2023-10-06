package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ViewInReportsPage extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//span[@class='table-view-btn me-2']")
	private WebElement view;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[1]")
	private WebElement all;
	
	@FindBy(className = "table-filter-btn okay-btn")
	private WebElement ok;
	
	public ViewInReportsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getview()
	{
		return view;
	}
	public WebElement getall()
	{
		return all;
	}
	public WebElement getok()
	{
		return ok;
	}
	public ViewInReportsPage viewdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		view.click();
		return new ViewInReportsPage(driver);
	}
	public ViewInReportsPage alldropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		all.click();
		Thread.sleep(2000);
		ok.click();
		return new ViewInReportsPage(driver);
	}
}
