package demoTestScripts;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDemo.CreateAppointmentFlow;
import objectRepositoryDemo.LoginClinic;
import objectRepositoryDemo.LogoutPageFlow;
import objectRepositoryDemo.MobileVerificationPage;

public class CreateAppointmentAndJoinCall extends BaseClass
{
	@Test(priority = 1)
	public void LoginMyCLNQ() throws InterruptedException
	{
		driver.manage().window().maximize();
		LoginClinic lc=new LoginClinic(driver);
		lc.clickonAdmin_button();
		lc.clickoncountry_button();
		lc.EntercountryName(prop.getProperty("country"));
		lc.clickonCountry();
		lc.EnterphoneNumber(prop.getProperty("phoneNumber"));
		lc.ContinueButton();
		lc.CaptureToastmsg();
		 MobileVerificationPage mp=new MobileVerificationPage(driver);
		 mp.Otp_No1(prop.getProperty("Otp1"));mp.Otp_No2(prop.getProperty("Otp2"));
		 mp.Otp_No3(prop.getProperty("Otp3"));mp.Otp_No4(prop.getProperty("Otp4"));
		 mp.verify_button();
	}
	@Test(priority = 2)
	public void CreateAppointmentPage() throws InterruptedException
	{
		CreateAppointmentFlow create=new CreateAppointmentFlow(driver);
		create.ClickAppointmentsPage();
		create.ClickHamburger();
		create.ClickCrossIcon();
		create.ClickCreateAppointment();
		create.ClickDoctorDropdown();
		create.SelectDoctorOpt();
		create.sendNumber(prop.getProperty("Ph_No"));
		create.clicknumber();
		create.firstname(prop.getProperty("First_Name"));
		create.lastname(prop.getProperty("Last_Name1"));
		create.genderdropdown();
		create.addressfield(prop.getProperty("address"));
		create.Symptoms();
		create.datewidget(prop.getProperty("date"));
		create.hourdropdown();
		create.selecthour();
		create.minutedropdown();
		create.selectminute();
		create.Submitbutton();
		create.captureMessage();
		create.ClickDropdown();
		create.SelectDoctor();
		create.RefreshPage();
		create.NormalConsult();
		create.FinishCall();
	}
	@Test(priority = 3)
	public void LogoutFlow() throws InterruptedException
	{
		LogoutPageFlow lgf=new LogoutPageFlow();
		lgf.ClickLogoutPage();
		lgf.ClickHamburger();
		lgf.ClickCrossButton();
	}
}
