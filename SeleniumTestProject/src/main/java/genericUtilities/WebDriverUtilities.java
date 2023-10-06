package genericUtilities;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtilities {

	public WebDriver driver=null;
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitforElementTobeClickable(WebDriver driver,WebElement element, Duration duration)
	{
			   WebDriverWait wait = new WebDriverWait(driver, duration);
			   wait.until(ExpectedConditions.visibilityOf(element));
		   }
		   public void waitForElementTobeClickabl1(String locator)
		   {
			   WebElement ele = driver.findElement(By.xpath(locator));
			   WebDriverWait wait = new WebDriverWait(driver, null);
			   wait.until(ExpectedConditions.visibilityOf(ele));
		   }
		   public void select(WebElement element, int index) 
		   {
			   Select sel= new Select(element);
			   sel.selectByIndex(index);
		   }
		   public void select(WebElement element, String text)
		   {
			   Select sel= new Select(element);
			     sel.selectByVisibleText (text);
		   }
		   public void select( String value,WebElement element)
		   {
			   Select sel= new Select(element);
		     sel.selectByValue(value);
		   }
		   public void mousHover(WebDriver driver,WebElement element)
		   {
			  Actions act=new Actions(driver);
			  act.moveToElement(element).perform();
		   }
		   public void dragAndDrop(WebDriver driver, WebElement src,WebElement target)
		   {
			   Actions act = new Actions(driver);
			   act.dragAndDrop(src, target).perform();
		   }
		   public void doubleclickAction(WebElement element,WebDriver driver)
		   {
			   Actions act = new Actions(driver);
			   act.doubleClick(element).perform();
		   }
		   public void rightClickAction(WebDriver driver,WebElement element)
		   {
			   Actions act= new Actions(driver);
			   act.contextClick(element).perform();
		   }
		   public void rightclick(WebDriver driver,WebElement element)
		   {
			   Actions act = new Actions(driver);
			   act.sendKeys(Keys.ENTER).perform();
			   
		   }
		   public void switchToFrame(WebDriver driver, int index)
		   {
			   driver.switchTo().frame(index);
		   }
		   public void switchToFrame(WebDriver driver,String nameOrID)
		   {
			   driver.switchTo().frame(nameOrID);
		   }
		   public void SwithToFrame(WebDriver driver, WebElement adress)
		   {
			   driver.switchTo().frame(adress);
		   }
		   public void acceptAllert(WebDriver driver)
		   {
			   driver.switchTo().alert().accept();
		   }
		   public void dismisstheAllert(WebDriver driver)
		   {
			  driver.switchTo().alert().dismiss(); 
		   }
		   public void swithtowindowHandles(WebDriver driver,String PartialWinTitle)
		   {
			   //step:1 to use get window handles to capture all window ids
			  Set<String> windows = driver.getWindowHandles();
			  //step:2 iterate thru windows
			  Iterator<String> it = windows.iterator();
			  while(it.hasNext())
			  { 
				  //step:3 capture current window id
				  String windid = it.next();
				  //step:4 switch to current window and capture title
				  String currntWindowTitle = driver.switchTo().window(windid).getTitle();
				  //step:5 check whether current window is expected
				  if(currntWindowTitle.contains(PartialWinTitle))
				  {
					  break;
				  }
			  }
			  
		   }
		   
		   public String getScreenshot(String screenshotName,WebDriver driver) throws Throwable
		   {
			   
			   TakesScreenshot ts= (TakesScreenshot) driver;
		        File src = ts.getScreenshotAs(OutputType.FILE);
		      //  File file=new File(System.getProperty("user.dir")+"\reports\" +screenshotName+".png");
		      File file=new File(System.getProperty("user.dir") +"\\reports\\"+ screenshotName+".png");
		        FileUtils.copyFile(src, file);
		        //return System.getProperty("user.dir")+"\reports\" +screenshotName+ ".png ";
				return screenshotName+".png";
		        
		   } 
		   public void scrollAction(WebDriver driver)
		   {
			   JavascriptExecutor js= (JavascriptExecutor)driver;
			   js.executeScript("window.scrollBy(0,500)", "");
		   }
		   public void scrollAction(WebDriver driver,WebElement element)
		      {
		    	  JavascriptExecutor js=(JavascriptExecutor) driver;
		    	 int y = element.getLocation().getY();
		    	 js.executeScript("window.scrollBy(0,"+y+")", element);
		    	 //js.executescript(argument[0].scrollintoview()",element();
		      }
}

