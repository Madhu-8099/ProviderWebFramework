package doctorLogin;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.ClinicProfileInDL;
import objectRepositoryDoctorLogin.ClinicProfileTabInDL;
//import objectRepositoryDoctorLogin.ClinicProfileInDL;
//import objectRepositoryDoctorLogin.ClinicProfileTabInDL;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.DoctorLogout;


public class DoctorClinicProfile extends BaseClass
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
	public void ClickClinicProfile() throws InterruptedException
	{
		ClinicProfileTabInDL cp=new ClinicProfileTabInDL(driver);
		cp.ClinicProfile();
		cp.ClinicProfile1();
		cp.Hamburger();
		cp.CrossIcon1();
	}
	@Test(priority = 3)
	public void PerformActions() throws InterruptedException
	{
		ClinicProfileInDL cdp=new ClinicProfileInDL(driver);
		cdp.schedule();
		cdp.Consultation();
		cdp.Speciality();
	}
	
}
