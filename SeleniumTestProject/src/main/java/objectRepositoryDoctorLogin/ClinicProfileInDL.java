package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class ClinicProfileInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//h2[@id='flush-headingOne'])[1]")
	private WebElement option1;
	
	@FindBy(xpath = "(//h2[@id='flush-headingOne'])[2]")
	private WebElement option2;
	
	@FindBy(xpath = "(//h2[@id='flush-headingOne'])[3]")
	private WebElement options3;
	
	public ClinicProfileInDL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getoption1()
	{
		return option1;
	}
	public WebElement getoption2()
	{
		return option2;
	}
	public WebElement getoption3()
	{
		return options3;
	}
	public ClinicProfileInDL schedule() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element1 = option1;
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(2000);
		element1.click();
		return new ClinicProfileInDL(driver);
	}
	public ClinicProfileInDL Consultation() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element2 = option2;
		Thread.sleep(2000);
		element2.click();
		Thread.sleep(2000);
		element2.click();
		return new ClinicProfileInDL(driver);
	}
	public ClinicProfileInDL Speciality() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement element3 = options3;
		Thread.sleep(2000);
		element3.click();
		Thread.sleep(2000);
		element3.click();
		return new ClinicProfileInDL(driver);
	}
}
