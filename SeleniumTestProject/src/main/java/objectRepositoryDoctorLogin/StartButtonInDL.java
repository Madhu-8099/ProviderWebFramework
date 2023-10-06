package objectRepositoryDoctorLogin;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class StartButtonInDL extends BaseClass
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class='chat-container-primary me-3'])[13]")
	private WebElement chatIcon;
	
	@FindBy(xpath = "//input[@placeholder='Type your message']")
	private WebElement Typemessage;
	
	@FindBy(xpath = "//i[@class='ri-send-plane-line send-chat-message']")
	private WebElement sendButton;
	
	@FindBy(xpath = "//i[@class='ri-close-line dialog-close icon-hover-bg']")
	private WebElement crossButton;
	
	@FindBy(xpath = "(//*[@id=\"ACTION_BUTTON\"])[6]")
	private WebElement callButton;
	
	@FindBy(className = "call-btn call-btn-finish")
	private WebElement finish;
	
	public StartButtonInDL(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getchatIcon()
	{
		return chatIcon;
	}
	public WebElement getTypemessage()
	{
		return Typemessage;
	}
	public WebElement getsendButton()
	{
		return sendButton;
	}
	public WebElement getcrossButton()
	{
		return crossButton;
	}
	public WebElement getcallButton()
	{
		return callButton;
	}
	public WebElement getfinish()
	{
		return finish;
	}
	public StartButtonInDL chaticon() throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement chat = chatIcon;
		Thread.sleep(2000);
		chat.click();
		return new StartButtonInDL(driver);
	}
	public StartButtonInDL Typemessage1(String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement type = Typemessage;
		Thread.sleep(2000);
		type .sendKeys(msg);
		return new StartButtonInDL(driver);
	}
	public StartButtonInDL sendbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement send = sendButton;
		Thread.sleep(2000);
		send .click();
		return new StartButtonInDL(driver);
	}
	public StartButtonInDL crossicon() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cross = crossButton;
		Thread.sleep(2000);
		cross.click();
		return new StartButtonInDL(driver);
	}
	public StartButtonInDL StartCall() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement call = callButton;
		Thread.sleep(2000);
		call.click();
		return new StartButtonInDL(driver);
	}
	public StartButtonInDL FinishButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement button = finish;
		Thread.sleep(2000);
		button.click();
		return new StartButtonInDL(driver);
	}
}
