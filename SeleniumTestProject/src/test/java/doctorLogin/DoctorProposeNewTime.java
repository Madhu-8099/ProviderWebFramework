package doctorLogin;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.AppointmentRequestTabInDL;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.ProposeNewTimeInDL;

public class DoctorProposeNewTime extends BaseClass
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
	public void ProposeNewTime() throws InterruptedException
	{
		ProposeNewTimeInDL pn=new ProposeNewTimeInDL(driver);
		pn.refreshbutton();
		pn.proposenewtime();
		pn.Datewidget(prop.getProperty("date"));
		pn.Hourdropdown();
		pn.selectHRdropdown();
		pn.proposebutton();
	}
}
