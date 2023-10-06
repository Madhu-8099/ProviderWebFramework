package webProjects;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.AppointmentsPage;
import objectRepository.Loginpage1;
import objectRepositoryDemo.MobileVerificationPage;

public class AppointmentPage extends BaseClass 
{
	@Test
	public void AppointmentPage() throws InterruptedException
	{
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
	     AppointmentsPage ap=new AppointmentsPage(driver);
		 ap.AppointmentPage();
		 ap.Appointment1();
		 ap.Dashboard();
		 ap.crossIcon();
	}
}
