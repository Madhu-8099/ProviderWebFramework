package cliniDashboard;

import org.testng.annotations.Test;

import extentReportsPage.Retry;
import genericUtilities.BaseClass;
import objectRepository.AppointmentRequestPage;
import objectRepository.ApproveButton;
import objectRepository.Loginpage1;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicApproveButton extends BaseClass
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
	@Test(priority = 2,retryAnalyzer=Retry.class)
	public void ClickApproveButton() throws InterruptedException
	{
		ApproveButton approve=new ApproveButton(driver);
		approve.clickrefreshButton();
		approve.clickapprovebutton();
		approve.clickacceptbutton();
	}
}
