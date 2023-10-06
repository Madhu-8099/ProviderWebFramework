package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeleteDoctorPage 
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[4]/div/div/div[2]/table/tbody/tr[1]/td[7]/button")
	private WebElement ViewProfile;
	
	@FindBy(className = "btn btn-danger delete mt-2 text-nowrap")
	private WebElement clickDoctor;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement YesButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement deletemessage;
	
	public DeleteDoctorPage(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getclickDoctor()
	{
		return clickDoctor;
	}
	public WebElement getYesButton()
	{
		return YesButton;
	}
	public WebElement getViewProfile()
	{
		return ViewProfile;
	}
	public WebElement getdeletemessage()
	{
		return deletemessage;
	}
	public DeleteDoctorPage ClickViewProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement view = ViewProfile;
		Thread.sleep(2000);
		view.click();
		return new DeleteDoctorPage(driver);
	}

	public DeleteDoctorPage ClickDoctorButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement doctor = clickDoctor;
		Thread.sleep(2000);
		doctor.click();
		return new DeleteDoctorPage(driver);
	}
	public DeleteDoctorPage clickYesButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement yes = YesButton;
		Thread.sleep(2000);
		yes.click();
		return new DeleteDoctorPage(driver);
	}
	public DeleteDoctorPage DoctorDeleteMessage() throws InterruptedException
	{
		Thread.sleep(2000);
		String message = deletemessage.getText();
		 System.out.println("Text of the toast message is: "+message);
		 Assert.assertEquals(message, "Doctor added successfully");
		return new DeleteDoctorPage(driver);
	}
}
