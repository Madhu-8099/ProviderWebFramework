package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtilities.BaseClass;

public class EditConfigurationPage extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[3]/div/div/div[2]/div")
	private WebElement clickEdit_dropdown;
	
	@FindBy(css = ".css-w32ioptionbi-")
	private WebElement editconfiguration;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[1]")
	private WebElement videoconsult;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[2]")
	private WebElement audioconsult;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[3]")
	private WebElement houseconsult;
	
	@FindBy(xpath = "(//div[@class='react-switch-bg'])[9]")
	private WebElement medicalcertificate;
	
	@FindBy(className = "btn dialog-btn dialog-btn-type-filled")
	private WebElement Submit;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement configmessage;
	
	public EditConfigurationPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getclickEdit_dropdown()
	{
		return clickEdit_dropdown;
	}
	public WebElement geteditconfiguration()
	{
		return editconfiguration;
	}
	public WebElement getvideoconsult()
	{
		return videoconsult;
	}
	public WebElement getaudioconsult()
	{
		return audioconsult;
	}
	public WebElement gethouseconsult()
	{
		return houseconsult;
	}
	public WebElement getmedicalcertificate()
	{
		return medicalcertificate;
	}
	public WebElement getSubmit()
	{
		return Submit;
	}
	public WebElement getconfigmessage()
	{
		return configmessage;
	}
	public EditConfigurationPage clickdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement dropdown = clickEdit_dropdown;
		Thread.sleep(2000);
		dropdown.click();
		return new EditConfigurationPage(driver);
	}
	public EditConfigurationPage clickconfiguration() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement config = editconfiguration;
		Thread.sleep(2000);
		config.click();
		return new EditConfigurationPage(driver);
	}
	public EditConfigurationPage clickvideoconsult() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement video = videoconsult;
		Thread.sleep(2000);
		video.click();
		Thread.sleep(2000);
		video.click();
		return new EditConfigurationPage(driver);
	}
	public EditConfigurationPage clickaudioconsult() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement audio = audioconsult;
		Thread.sleep(2000);
		audio.click();
		Thread.sleep(2000);
		audio.click();
		return new EditConfigurationPage(driver);
	}
	
	public EditConfigurationPage clickhouseconsult() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement house = houseconsult;
		Thread.sleep(2000);
		house.click();
		Thread.sleep(2000);
		house.click();
		return new EditConfigurationPage(driver);
	}
	public EditConfigurationPage clickmedicalcertificate() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement medical = medicalcertificate;
		Thread.sleep(2000);
		medical.click();
		Thread.sleep(2000);
		medical.click();
		return new EditConfigurationPage(driver);
	}
	public EditConfigurationPage clicksubmitbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement Submit = medicalcertificate;
		Thread.sleep(2000);
		Submit.click();
		return new EditConfigurationPage(driver);
	}
	public EditConfigurationPage configupdatemessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String text = configmessage.getText();
		System.out.println("Confirmation message is: "+text);
		 Assert.assertEquals(text, "Clinic Configuration Details Updated Successfully");
		return new EditConfigurationPage(driver);
	}
	
}
