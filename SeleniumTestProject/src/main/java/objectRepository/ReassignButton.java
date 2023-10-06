package objectRepository;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import genericUtilities.BaseClass;

public class ReassignButton extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[1]")
	private WebElement doctordp;
	
	@FindBy(xpath = "//*[@id=\"refresh-appointment\"]")
	private WebElement refresh;
	
	@FindBy(xpath = "//button[text()='Reassign Request']")
	private WebElement Reassign;
	
	@FindBy(xpath = "//h1[@class='eligible-doctor-box-name']")
	private List<WebElement> doctorsList;
	
	@FindBy(className = "dialog-btn dialog-btn-type-filled")
	private WebElement confirm;
	
	
	public ReassignButton(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ReassignButton clickDdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement dp = doctordp;
		Thread.sleep(2000);
		dp.click();
		return new ReassignButton(driver);
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getReassign()
	{
		return Reassign;
	}
	public WebElement getdoctorsList()
	{
		return confirm;
	}
	public ReassignButton clickrefresh() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new ReassignButton(driver);
	}
	public ReassignButton clickReassign() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = Reassign;
		Thread.sleep(2000);
		ele.click();
		return new ReassignButton(driver);
	}
	public ReassignButton SelectDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> text = doctorsList;
		int count = text.size();
		for (int i = 0; i < count; i++)
		{
			String doctor = text.get(i).getText();
			if (doctor.equalsIgnoreCase("Saniya"))
			{
				text.get(i).click();
				break;
			}
		}
		return new ReassignButton(driver);
	}
	public ReassignButton clickConfirm() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement btn = confirm;
		Thread.sleep(2000);
		btn.click();
		return new ReassignButton(driver);
	}
	
}
