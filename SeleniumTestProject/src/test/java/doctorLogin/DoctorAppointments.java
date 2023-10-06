package doctorLogin;


import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepositoryDoctorLogin.AppointmentTabInDL;
import objectRepositoryDoctorLogin.CreateAppointmentsPage;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.StartButtonInDL;

public class DoctorAppointments extends BaseClass
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
	public void LoginAppointments() throws InterruptedException 
	{
		AppointmentTabInDL at=new AppointmentTabInDL(driver);
		at.AppointmentsTab();
		at.Appoinments();
		at.Hamurger();
		at.crossIcon();
	}
	@Test(priority = 3)
	public void createappointment() throws Throwable
	{
		CreateAppointmentsPage ca=new CreateAppointmentsPage(driver);
		ca.createAppointment();
		ca.SendNumber(prop.getProperty("Ph_No"));
		ca.clickPhoneNumber();
		ca.firstname(prop.getProperty("First_Name"));
		ca.lastname(prop.getProperty("Last_Name1"));
		ca.addressfield(prop.getProperty("address"));
		ca.Symptoms();
		ca.Symptoms1();
		ca.hourdropdown();
		ca.selecthour();
		ca.Submitbutton();
		ca.captureMessage();
	}
	@Test(priority = 4)
	public void startandchatpage() throws InterruptedException
	{
		StartButtonInDL sdl=new StartButtonInDL(driver);
		sdl.StartCall();
		sdl.FinishButton();
		
	}
	
}
