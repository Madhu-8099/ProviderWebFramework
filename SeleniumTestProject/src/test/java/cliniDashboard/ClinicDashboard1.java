package cliniDashboard;


import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.AppointmentInDashboard;
import objectRepository.AttendButton;
import objectRepository.ClinicDashboard;
import objectRepository.DetailsPage;
import objectRepository.DoctorAvailability;
import objectRepository.Loginpage1;

import objectRepository.TakeAction;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicDashboard1 extends BaseClass
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
	public void TakeAction1() throws InterruptedException
	{
		TakeAction ta=new TakeAction(driver);
		ta.Action_button();
		ta.Dashboard();
		ta.Hamurger();
		ta.crossIcon();
	}
	
	@Test(priority = 3)	 
	public void clinicDashboard1() throws InterruptedException
	{
		ClinicDashboard cd=new ClinicDashboard(driver);
		cd.Patient_button();
		cd.All_button();
		cd.video_button();
		cd.Audio_button();
		cd.House_call();
	}
	@Test(priority = 4)
	public void Detailspage1() throws InterruptedException
	{
		DetailsPage dp=new DetailsPage(driver);
		dp.Details_button();
		dp.Dashboard();
		dp.Hamurger();
		dp.crossIcon();
	}
	@Test(priority = 5)
	public void AppointmentInDashboard1() throws InterruptedException
	{
		AppointmentInDashboard aid=new AppointmentInDashboard(driver);
		aid.Appointment();
		aid.Patient_btn();
		aid.All_btn();
		aid.Video_btn();
		aid.Audio_btn();
		aid.House_call();
	}
	@Test(priority = 6)
	public void AttentBtton1() throws InterruptedException
	{
		AttendButton ab=new AttendButton(driver);
		ab.Attend_btn();
		ab.Dashboard();
		ab.Hamurger();
		ab.crossIcon();
	}
	@Test(priority = 7)
	public void DoctorAvailability1() throws InterruptedException
	{
		DoctorAvailability da=new DoctorAvailability(driver);
		da.Doctor_Availability();
		da.Doctor_Name();
		da.Dashboard();
		da.Hamurger();
		da.crossIcon();
	}
		
}
