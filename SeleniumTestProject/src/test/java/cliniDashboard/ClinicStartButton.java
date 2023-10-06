package cliniDashboard;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.AppointmentsPage;
import objectRepository.Loginpage1;

import objectRepositoryDemo.MobileVerificationPage;

public class ClinicStartButton extends BaseClass
{
	
	@Test(priority = 1)
	public void Appointments() throws InterruptedException
	{
		AppointmentsPage ap=new AppointmentsPage(driver);
		ap.AppointmentPage();
		ap.Appointment1();
		ap.Dashboard();
		ap.crossIcon();
	}
	/*@Test(priority = 2)
	public void ClickStartButton() throws InterruptedException
	{
		StartButtonInDL sb=new StartButton(driver);
		sb.Time_dropdown();
		sb.select_dropdown();
		sb.Doctor_dropdown();
		sb.select_doctor1();
		sb.start_button();*/
	}

