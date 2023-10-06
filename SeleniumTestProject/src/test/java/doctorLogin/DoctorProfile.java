package doctorLogin;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepositoryDoctorLogin.ChangepasswordDL;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.EditProfileInDL;
import objectRepositoryDoctorLogin.EditTimingInDL;
import objectRepositoryDoctorLogin.ManageLeave;
import objectRepositoryDoctorLogin.ProfileTabInDL;

public class DoctorProfile extends BaseClass
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
	public void LoginProfilePage() throws InterruptedException
	{
		ProfileTabInDL pTab=new ProfileTabInDL(driver);
		pTab.ProfileTab();
		pTab.ProfileTab1();
		pTab.Hamurger();
		pTab.crossIcon();
	}
	@Test(priority = 3)
	public void ChangePassword() throws Throwable
	{
		ChangepasswordDL cwdl=new ChangepasswordDL(driver);
		cwdl.change_pwd();
		cwdl.current_pwd(prop.getProperty("currentPassword"));
		cwdl.New_pwd(prop.getProperty("newpassword"));
		cwdl.Confirm_pwd(prop.getProperty("confirmpassword"));
		cwdl.confirmButton();
		cwdl.OkButton();
		cwdl.CaptureMessage();
	}
	@Test(priority = 4)
	public void AgainLogin() throws InterruptedException
	{
		DoctorLoginPage d1=new DoctorLoginPage(driver);
		d1.username(prop.getProperty("Username"));
		d1.password(prop.getProperty("Password"));
		d1.continueButton();
	}
	@Test(priority = 5)
	public void AgainLoginProfilepage() throws InterruptedException
	{
		ProfileTabInDL pTab=new ProfileTabInDL(driver);
		pTab.ProfileTab();
		pTab.ProfileTab1();
		pTab.Hamurger();
		pTab.crossIcon();
	}
	@Test(priority = 6)
	public void EditDoctorprrofile() throws InterruptedException
	{
		EditProfileInDL edit=new EditProfileInDL(driver);
		edit.clickEditdropdown();
		edit.clickEditProfile();
		edit.Doctorname(prop.getProperty("doctorname"));
		edit.qualification(prop.getProperty("qualification"));
		edit.Videoconsultation(prop.getProperty("vdfee"));
		edit.Audioconsultation(prop.getProperty("Adfee"));
		edit.Houseconsultation(prop.getProperty("hfee"));
		edit.savebutton();
	}
	
}
