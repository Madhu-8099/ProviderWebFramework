package objectRepositoryDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class StartButtonFlow extends BaseClass
{
	public WebDriver driver;
	@FindBy(css = ".css-19bb58m")
	private WebElement dropdown;
	
	@FindBy(css = ".css-1tdpez0-option")
	private List<WebElement> select;
	
	@FindBy(css = ".ri-refresh-line.refresh-appointment-list-icon")
	private WebElement refresh;
	
	@FindBy(xpath = "(//*[@id=\"ACTION_BUTTON\"])[23]")
	private WebElement startbutton;
	
	@FindBy(xpath = "//button[@class='zm-btn joinWindowBtn btn btn-primary btn-block btn-lg submit zm-btn--default zm-btn__outline--blue']")
	private WebElement zoom;
	
	@FindBy(xpath = "//button[@class='zm-btn join-audio-by-voip__join-btn zm-btn--primary zm-btn__outline--white zm-btn--lg']")
	private WebElement join;
	
	@FindBy(xpath = "//div[@class='zmu-btn footer__leave-btn ax-outline ellipsis zmu-btn--danger zmu-btn__outline--blue']")
	private WebElement leave;
	
	@FindBy(xpath = "//*[@id=\"wc-footer\"]/div[2]/div[2]/div[3]/div/div/button[1]")
	private WebElement cutcall;
	
	public StartButtonFlow(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getdropdown()
	{
		return dropdown;
	}
	public List<WebElement> getselect()
	{
		return select;
	}
	public WebElement getrefresh()
	{
		return refresh;
	}
	public WebElement getzoom()
	{
		return zoom;
	}
	public WebElement getjoin()
	{
		return join;
	}
	public WebElement getleave()
	{
		return leave;
	}
	public WebElement getcutcall()
	{
		return cutcall;
	}
	public StartButtonFlow Selectdropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement dp8 = dropdown;
		Thread.sleep(2000);
		dp8.click();
		return new StartButtonFlow(driver);
	}
	public StartButtonFlow selectDoctor() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> sel = select;
		int count1 = sel.size();
		 for (int i = 0; i < count1; i++)
		 {
			 String text = sel.get(i).getText();
			 if (text.equalsIgnoreCase("Saniya")) 
			 {
				 sel.get(i).click();
				 break;
			}
		}
		return new StartButtonFlow(driver);
	}
	public StartButtonFlow RefreshButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ref = refresh;
		Thread.sleep(2000);
		ref.click();
		return new StartButtonFlow(driver);
	}
	public StartButtonFlow ClickStrat() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement zz = zoom;
		Thread.sleep(2000);
		zz.click();
		return new StartButtonFlow(driver);
	}
	public StartButtonFlow clickJoin() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement jn = join;
		Thread.sleep(2000);
		jn.click();
		return new StartButtonFlow(driver);
	}
}
