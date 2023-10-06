package webProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.AppointmentRequestPage;
import objectRepository.Loginpage1;
import objectRepositoryDemo.MobileVerificationPage;

public class AppointmentRequest extends BaseClass{
	
@Test
	public void AppointmentRequest() throws InterruptedException {
		driver.manage().window().maximize();
		 Loginpage1 lp=new Loginpage1(driver);
		 lp.clickonAdmin_button();
		 lp.clickoncountry_button();
		 lp.EntercountryName(prop.getProperty("country"));
		 lp.clickonCountry();
		 lp.EnterphoneNumber(prop.getProperty("phoneNumber"));
		 lp.ContinueButton();
		 MobileVerificationPage mp=new MobileVerificationPage(driver);
		 mp.Otp_No1(prop.getProperty("Otp1"));
		 mp.Otp_No2(prop.getProperty("Otp2"));
		 mp.Otp_No3(prop.getProperty("Otp3"));
		 mp.Otp_No4(prop.getProperty("Otp4"));
		 mp.verify_button();
		 AppointmentRequestPage arp=new AppointmentRequestPage(driver);
		 arp.AppointmentRequest();
		 arp.AppointmentReq1();
		 arp.Dashboard();
		 arp.crossIcon();

	}

}
