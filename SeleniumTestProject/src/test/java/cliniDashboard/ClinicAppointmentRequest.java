package cliniDashboard;
import org.testng.annotations.Test;

import extentReportsPage.Retry;
import genericUtilities.BaseClass;
import objectRepository.AppointmentRequestPage;
import objectRepository.Loginpage1;
import objectRepository.ReassignButton;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicAppointmentRequest extends BaseClass
{
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		driver.manage().window().maximize();
		 Loginpage1 lp=new Loginpage1(driver);
		 lp.clickonAdmin_button();
		 lp.clickoncountry_button();
		 lp.EntercountryName(prop.getProperty("country"));
		 lp.clickonCountry();
		 lp.EnterphoneNumber(prop.getProperty("phoneNumber"));
		 lp.ContinueButton();
		 lp.CaptureToastmsg();
		 MobileVerificationPage mp=new MobileVerificationPage(driver);
		 mp.Otp_No1(prop.getProperty("Otp1"));mp.Otp_No2(prop.getProperty("Otp2"));
		 mp.Otp_No3(prop.getProperty("Otp3"));mp.Otp_No4(prop.getProperty("Otp4"));
		 mp.verify_button();}
	
		@Test(priority = 1)
		public void AppointmentRequest() throws InterruptedException
		{
			AppointmentRequestPage arp=new AppointmentRequestPage(driver);
			arp.AppointmentRequest();
			arp.AppointmentReq1();
			arp.Hamurger();
			arp.crossIcon();
		}
		@Test(priority = 2,retryAnalyzer=Retry.class)
		public void reassignButtoninclinic() throws InterruptedException
		{
			ReassignButton ab=new ReassignButton(driver);
				ab.clickReassign();
				ab.SelectDoctor();
				ab.clickConfirm();
				
			
		}
		 
		
}
