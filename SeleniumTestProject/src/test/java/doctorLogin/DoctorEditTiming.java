package doctorLogin;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.EditTimingInDL;
import objectRepositoryDoctorLogin.ManageLeave;
import objectRepositoryDoctorLogin.ProfileTabInDL;

public class DoctorEditTiming extends BaseClass
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
	public void LoginprofileTab() throws InterruptedException
	{
		ProfileTabInDL pTab1=new ProfileTabInDL(driver);
		pTab1.ProfileTab();
		pTab1.ProfileTab1();
		pTab1.Hamurger();
		pTab1.crossIcon();
	}
	@Test(priority = 3)
	public void Edittiming() throws InterruptedException
	{
		EditTimingInDL editT=new EditTimingInDL(driver);
		editT.clickEditDrop();
		editT.clickTiming();
		editT.mondaytoggle();
		editT.tuesdaytoggle();
		editT.wednesdaytoggle();
		editT.thursdaytoggle();
		editT.fridaytoggle();
		editT.saturdaytoggle();
		editT.sundaytoggle();
		editT.submit();
		editT.updatebutton();
		editT.CaptureMessage();
	}
	@Test(priority = 4)
	public void Manageleavefield() throws InterruptedException
	{
		ManageLeave ml=new ManageLeave(driver);
		ml.clickmanageleave();
		ml.selectDate();
		ml.capturetext();
		ml.clickcrossicon();
		ml.cancelleave1();
		ml.Yesbutton();
		ml.CancelMessage();
		ml.scheduledropdown();
		ml.cosultationdropdown();
		ml.vitalsignsdropdown();
	}
}
