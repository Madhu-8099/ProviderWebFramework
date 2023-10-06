package doctorLogin;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.AppointmentRequestTabInDL;
import objectRepositoryDoctorLogin.ApproveButtonInDL;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.ProposeNewTimeInDL;
import objectRepositoryDoctorLogin.RejectButtonInDL;

public class DoctorAppointmentRequest extends BaseClass
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
	public void Approvebutton() throws InterruptedException
	{
		ApproveButtonInDL ab=new ApproveButtonInDL(driver);
		ab.refreshbutton();
		ab.approvebutton();
		ab.approvebutton1();
		ab.waveOffbutton();
	}
	
	
}
