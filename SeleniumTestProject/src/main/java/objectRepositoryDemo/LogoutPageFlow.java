package objectRepositoryDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPageFlow 
{
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/nav/div[2]")
	private WebElement LogutPage;
	
	@FindBy(xpath = "//i[@class='ri-menu-line hamburger open-panel nav-toggle']")
	private WebElement Hamburger;
	
	@FindBy(xpath = "//i[@class='ri-close-line hamburger open-panel nav-toggle']")
	private WebElement CrossIcon;
	
	public WebElement getLogutPage()
	{
		return LogutPage;
	}
	public WebElement getHamburger()
	{
		return Hamburger;
	}
	public WebElement getCrossIcon()
	{
		return CrossIcon;
	}
	public LogoutPageFlow ClickLogoutPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = LogutPage;
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
		return new LogoutPageFlow();
	}
	public LogoutPageFlow ClickHamburger() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hammy = Hamburger;
		Thread.sleep(2000);
		hammy.click();
		return new LogoutPageFlow();
	}
	public LogoutPageFlow ClickCrossButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = CrossIcon;
		Thread.sleep(2000);
		cross.click();
		return new LogoutPageFlow();
	}
}
