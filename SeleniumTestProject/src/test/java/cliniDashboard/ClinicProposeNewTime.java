package cliniDashboard;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.AppointmentRequestPage;
import objectRepository.Loginpage1;
import objectRepository.ProposeNewTime;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicProposeNewTime extends BaseClass
{

	
	
	@Test(priority = 1)
	public void AppointmentRequest() throws InterruptedException
	{
		AppointmentRequestPage arp=new AppointmentRequestPage(driver);
		arp.AppointmentRequest();
		arp.AppointmentReq1();
		arp.Hamurger();
		arp.crossIcon();
	}
	@Test(priority = 2)
	public void ProposeNewTimePage() throws InterruptedException
	{
		ProposeNewTime pnt=new ProposeNewTime(driver);
		pnt.clickrefresh();
		pnt.propose();
		pnt.Calendarwidget(prop.getProperty("Date"));
		pnt.clickpropose();
	}
}
