package demoTestScripts;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDemo.AppointmentForAudio;
import objectRepositoryDemo.AppointmentForHouse;
import objectRepositoryDemo.AppointmentRequestFlow1;
import objectRepositoryDemo.LoginClinic;
import objectRepositoryDemo.MobileVerificationPage;

public class AudioConsultation extends BaseClass
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
	public void AppointmentRequestFlow() throws InterruptedException
	{
		AppointmentRequestFlow1 flow=new AppointmentRequestFlow1(driver);
		flow.NavigateToAR();
		flow.ClickHamburger();
		flow.ClickCross();
		flow.ClickDropdown();
		flow.ClickselectDoctor();
		flow.Clickrefresh();
		flow.clickApproveButton();
		flow.ClickWaveOffButton();
	}
	@Test(priority = 3)
	public void AppointmentAudioFlow() throws InterruptedException
	{
		AppointmentForAudio aa=new AppointmentForAudio(driver);
		aa.ClickAppointmentsPage();
		aa.ClickHamburger();
		aa.ClickCrossIcon();
		aa.ClickDropdown();
		aa.SelectDoctor();
		aa.RefreshPage();
		aa.SearchAudioButton();
		aa.ClickJoin();
		aa.ClickAlertMessage();
		aa.ClickEndButton();
		aa.ClickLeaveButton();
	}
}
