package webProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import objectRepository.Loginpage1;
import objectRepository.LogoutPage;
import objectRepositoryDemo.MobileVerificationPage;

public class TestFrame1 extends BaseClass
{
	@Test
	public void welcome() throws InterruptedException {
		driver.manage().window().maximize();
		 Loginpage1 lp=new Loginpage1(driver);
		 lp.clickonAdmin_button();
		 lp.clickoncountry_button();
		 lp.EntercountryName(prop.getProperty("country"));
		 lp.clickonCountry();
		 lp.EnterphoneNumber(prop.getProperty("phoneNumber"));
		 lp.ContinueButton();
		 MobileVerificationPage mp=new MobileVerificationPage(driver);
		 mp.Otp_No1(prop.getProperty("Otp1"));mp.Otp_No2(prop.getProperty("Otp2"));
		 mp.Otp_No3(prop.getProperty("Otp3"));mp.Otp_No4(prop.getProperty("Otp4"));
		 mp.verify_button();
		 LogoutPage lp1=new LogoutPage(driver);
		 lp1.Logoutbutton();lp1.logOut();lp1.Hamburger();lp1.crossbutton();lp1.clickonYes();
		
		 
	}
	
}
