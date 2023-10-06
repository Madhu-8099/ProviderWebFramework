package cliniDashboard;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepository.AppointmentsPage;
import objectRepository.CreateAppointment;
import objectRepository.Loginpage1;
import objectRepository.StartButtonInClinic;
import objectRepositoryDemo.MobileVerificationPage;



public class ClinicAppointments extends BaseClass
{
	@Test(priority =1)
	public void welcome() throws InterruptedException {
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
	@Test(priority = 2)
	public void Appointments() throws InterruptedException
	{
		AppointmentsPage ap=new AppointmentsPage(driver);
		ap.AppointmentPage();
		ap.Appointment1();
		ap.Dashboard();
		ap.crossIcon();
	}
	
		
	@Test(priority = 3)
	public void startconsultation() throws InterruptedException
	{
		StartButtonInClinic sb=new StartButtonInClinic(driver);
		sb.start_button();
	}
}
