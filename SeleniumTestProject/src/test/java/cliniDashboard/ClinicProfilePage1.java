package cliniDashboard;

import org.testng.annotations.Test;

import extentReportsPage.Retry;
import genericUtilities.BaseClass;
import objectRepository.ClinicProfilePage;
import objectRepository.EditClinicProfile;
import objectRepository.EditConfigurationPage;
import objectRepository.EditTimingPage;
import objectRepository.Loginpage1;
import objectRepository.ManageLeaveInClinic;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicProfilePage1 extends BaseClass
{
	@Test(priority =1)
	public void welcome() throws InterruptedException {
		driver.manage().window().maximize();
		 Loginpage1 lp=new Loginpage1(driver);
		 lp.clickonAdmin_button();
		 lp.clickoncountry_button();
		 lp.EntercountryName(prop.getProperty("country"));
		 lp.clickonCountry();
		 lp.EnterphoneNumber(prop.getProperty("phoneNumber"));
		 lp.ContinueButton();
		 lp.CaptureToastmsg();
		 MobileVerificationPage mp=new MobileVerificationPage(driver);
		 mp.Otp_No1(prop.getProperty("Otp1"));mp.Otp_No2(prop.getProperty("Otp2"));
		 mp.Otp_No3(prop.getProperty("Otp3"));mp.Otp_No4(prop.getProperty("Otp4"));
		 mp.verify_button();}

	@Test(priority = 2)
	public void ClinicprofilePage1() throws InterruptedException
	{
		ClinicProfilePage cp1=new ClinicProfilePage(driver);
		cp1.ClinicProfilePage1();
		cp1.ClinicProfilePage1();
		cp1.Hamurger();
		cp1.crossIcon();
	}
	@Test(priority = 4)
	public void Editprofile() throws InterruptedException
	{
		EditClinicProfile ec2=new EditClinicProfile(driver);
		ec2.clickEdit_dropdown1();
		ec2.EditProfile();
		ec2.ClinicName(prop.getProperty("clinicname"));
		ec2.HospitalRegistration1(prop.getProperty("hosipta_No"));
		ec2.Phone_No1(prop.getProperty("mobile_No"));
		ec2.EmailAddress1(prop.getProperty("emailaddress"));
		ec2.ZipCode1(prop.getProperty("zip_code"));
		ec2.SubmitButton1();
		ec2.UpdateProfileMessage();
	}
	@Test(priority = 3,retryAnalyzer=Retry.class)
	public void EditTimingPage() throws InterruptedException
	{
		EditTimingPage edit=new EditTimingPage(driver);
		edit.Editdropdown();
		edit.ClickTiming();
		edit.ChangeTimings(prop.getProperty("timing"));
		edit.toggle2();
		edit.toggle3();
		edit.toggle4();
		edit.toggle5();
		edit.toggle6();
		edit.toggle7();
		edit.SubmitChanges1();
		edit.updatetimingmessage();
	}
	
	@Test(priority = 5)
	public void Editconfiguration() throws InterruptedException
	{
		EditConfigurationPage ec=new EditConfigurationPage(driver);
		ec.clickdropdown();
		ec.clickconfiguration();
		ec.clickvideoconsult();
		ec.clickaudioconsult();
		ec.clickhouseconsult();
		ec.clickmedicalcertificate();
		ec.clicksubmitbutton();
		ec.configupdatemessage();
	}
	@Test(priority = 6)
	public void Manageleaveoption() throws InterruptedException
	{
		ManageLeaveInClinic ml=new ManageLeaveInClinic(driver);
		ml.Manageleave();
		ml.selectDay();
		ml.Textbox1(prop.getProperty("message"));
		ml.submit1();
		ml.LeaveMessage();
		ml.dropdown1();
		ml.dropdown2();
		ml.dropdown3();
		ml.dropdown4();
	}
	
}
