package doctorLogin;


import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepositoryDoctorLogin.AppointmentRequestInDD;
import objectRepositoryDoctorLogin.AppointmentsInDL;
import objectRepositoryDoctorLogin.AttendInDL;
import objectRepositoryDoctorLogin.DetailsButton;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.Doctortakeaction;


public class DoctorDashboardPage extends BaseClass
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
	public void AppointmentRequest() throws InterruptedException
	{
		AppointmentRequestInDD ar=new AppointmentRequestInDD(driver);
		ar.PatientFilter1();
		ar.AllButton();
		ar.VideoCallButton();
		ar.AudioButton();
		ar.House_Call();
	}
	
	@Test(priority = 3)
	public void Detailsbuttonpage() throws InterruptedException
	{
		DetailsButton db=new DetailsButton(driver);
		db.Details_btn1();
		db.Dashboard();
		db.Hamurger();
		db.crossIcon();
	}
	@Test(priority = 4)
	public void AppointmentsInDD() throws InterruptedException
	{
		AppointmentsInDL ad=new AppointmentsInDL(driver);
		ad.AppointmentTabA();
		ad.PatientFilterA();
		ad.AllButtonA();
		ad.VideoCallButton();
		ad.AudioButton();
		ad.House_Call();
	}
	@Test(priority = 5)
	public void AppointmentInDLPage() throws InterruptedException
	{
		AttendInDL ad=new AttendInDL(driver);
		ad.AttendButton1();
		ad.Dashboard();
		ad.Hamurger();
		ad.crossIcon();
	}
	

}
