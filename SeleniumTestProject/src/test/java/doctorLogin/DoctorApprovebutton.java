package doctorLogin;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.AppointmentRequestTabInDL;
import objectRepositoryDoctorLogin.ApproveButtonInDL;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.RejectButtonInDL;

public class DoctorApprovebutton extends BaseClass
{

	@Test(priority = 1)
	public void Welcome() throws Throwable
	{
		driver.manage().window().maximize();
		DoctorLoginPage dl=new DoctorLoginPage(driver);
		dl.DoctorButton();
		dl.username(prop.getProperty("Username"));
		dl.password(prop.getProperty("Password"));
		dl.continueButton();
	}
	@Test(priority = 2)
	public void Appointmentrequest() throws InterruptedException
	{
		AppointmentRequestTabInDL ar=new AppointmentRequestTabInDL(driver);
		ar.AppointmentRequest();
		ar.AppointmentRequest1();
		ar.Hamburger();
		ar.CrossIcon();
	}
	@Test(priority = 3)
	public void rejectButton() throws InterruptedException
	{
		RejectButtonInDL RB=new RejectButtonInDL(driver);
		RB.refreshbutton();
		RB.Rejectbutton();
		RB.ReasonBox(prop.getProperty("text"));
		RB.SubmitButton();
	}
}
