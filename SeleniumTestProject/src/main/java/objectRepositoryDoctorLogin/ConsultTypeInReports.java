package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ConsultTypeInReports extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//i[@class='ri-filter-3-line table-filter-icon'])[3]")
	private WebElement consulttype;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[1]")
	private WebElement house;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[2]")
	private WebElement Audio;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[3]")
	private WebElement video;
	
	@FindBy(xpath = "(//input[@class='appointment-request-checkbox'])[4]")
	private WebElement normal;
	
	@FindBy(className = "table-filter-btn okay-btn")
	private WebElement okk;
	
	public ConsultTypeInReports(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getconsulttype()
	{
		return consulttype;
	}
	public WebElement gethouse()
	{
		return house;
	}
	public WebElement getAudio()
	{
		return Audio;
	}
	public WebElement getvideo()
	{
		return video;
	}
	public WebElement getnormal()
	{
		return normal;
	}
	public WebElement getokk()
	{
		return okk;
	}
	public ConsultTypeInReports ConsultType() throws InterruptedException
	{
		Thread.sleep(4000);
		consulttype.click();
		return new ConsultTypeInReports(driver);
	}
	public ConsultTypeInReports Housecall() throws InterruptedException
	{
		Thread.sleep(2000);
		house.click();
		Thread.sleep(2000);
		okk.click();
		return new ConsultTypeInReports(driver);
	}
	public ConsultTypeInReports Audiocall() throws InterruptedException
	{
		Thread.sleep(2000);
		consulttype.click();
		Thread.sleep(2000);
		house.click();
		Thread.sleep(2000);
		Audio.click();
		Thread.sleep(2000);
		okk.click();
		return new ConsultTypeInReports(driver);
	}
	public ConsultTypeInReports Videocall() throws InterruptedException
	{
		Thread.sleep(2000);
		consulttype.click();
		Thread.sleep(2000);
		Audio.click();
		Thread.sleep(2000);
		video.click();
		Thread.sleep(2000);
		okk.click();
		return new ConsultTypeInReports(driver);
	}
	public ConsultTypeInReports Normalcall() throws InterruptedException
	{
		Thread.sleep(2000);
		consulttype.click();
		Thread.sleep(2000);
		video.click();
		Thread.sleep(2000);
		normal.click();
		Thread.sleep(2000);
		okk.click();
		return new ConsultTypeInReports(driver);
	}
	
}
