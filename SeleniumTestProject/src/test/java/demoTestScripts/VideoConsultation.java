package demoTestScripts;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDemo.AppointmentFlow;
import objectRepositoryDemo.AppointmentFlow1;
import objectRepositoryDemo.AppointmentRequestFlow;
import objectRepositoryDemo.AppointmentRequestFlow1;
import objectRepositoryDemo.LoginClinic;
import objectRepositoryDemo.LogoutPageFlow;
import objectRepositoryDemo.MobileVerificationPage;


 public class  VideoConsultation extends BaseClass
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
	public void AppointmentFlow() throws InterruptedException
	{
		AppointmentRequestFlow1 flow=new AppointmentRequestFlow1(driver);
		flow.NavigateToAR();
		flow.ClickHamburger();
		flow.ClickCross();
		flow.ClickDropdown();
		flow.ClickselectDoctor();
		flow.clickApproveButton();
		flow.ClickWaveOffButton();
	}
	@Test(priority = 3)
	public void AppointmentRequestFlow() throws InterruptedException
	{
		AppointmentFlow1 af=new AppointmentFlow1(driver);
		af.ClickAppointmentsPage();
		af.ClickHamburger();
		af.ClickCrossIcon();
		af.ClickDropdown();
		af.SelectDoctor();
		af.RefreshPage();
		af.StartConsultation();
		af.ClickJoin();
		af.ClickAlertMessage();
		af.ClickEndButton();
		af.ClickLeaveButton();
	}
	@Test(priority = 4)
	public void LogoutFlow() throws InterruptedException
	{
		LogoutPageFlow lgf=new LogoutPageFlow();
		lgf.ClickLogoutPage();
		lgf.ClickHamburger();
		lgf.ClickCrossButton();
	}
	
}
