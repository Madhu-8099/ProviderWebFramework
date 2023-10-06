package objectRepositoryDoctorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class DoctorLoginPage extends BaseClass
{
public WebDriver driver;

@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/section/div[2]")
private WebElement DoctorButton;

@FindBy(xpath="//input[@placeholder='Username']")
private WebElement username;

@FindBy(xpath="//input[@placeholder='Password']")
private WebElement password;

@FindBy(xpath = "//button[text()='Continue']")
private WebElement continueButton;

public DoctorLoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getDoctor_button() 
{
	return DoctorButton;
}
public WebElement getUsername()
{
	return username;
}
public WebElement getpassword()
{
	return password;
}
public WebElement getcontinue()
{
	return continueButton;
}
public DoctorLoginPage DoctorButton() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement ele = DoctorButton;
	Thread.sleep(2000);
	DoctorButton.click();
	return new DoctorLoginPage(driver);
}
public DoctorLoginPage username(String Username) throws InterruptedException
{
	Thread.sleep(2000);
	username.sendKeys(Username);
	return new DoctorLoginPage(driver);
}
public DoctorLoginPage password(String Password) throws InterruptedException
{
	Thread.sleep(2000);
	password.sendKeys(Password);
	Thread.sleep(2000);
	return new DoctorLoginPage(driver);
}
public DoctorLoginPage continueButton() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement button = continueButton;
	Thread.sleep(2000);
	button.click();
	Thread.sleep(2000);
	return new DoctorLoginPage(driver);
}
}
