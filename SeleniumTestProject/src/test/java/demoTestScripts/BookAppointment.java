package demoTestScripts;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDemo.AppointmentFlow1;
import objectRepositoryDemo.AppointmentRequestFlow1;
import objectRepositoryDemo.BookAppointmentApprove;
import objectRepositoryDemo.LoginClinic;
import objectRepositoryDemo.LogoutPageFlow;
import objectRepositoryDemo.MobileVerificationPage;

public class BookAppointment extends BaseClass
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
	BookAppointmentApprove ba=new BookAppointmentApprove(driver);
	ba.NavigateToAR();
	ba.ClickHamburger();
	ba.ClickCross();
	ba.clickrefreshButton();
	ba.selectNormalText();
	ba.clickapprovebutton();
	ba.clickacceptbutton();
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
